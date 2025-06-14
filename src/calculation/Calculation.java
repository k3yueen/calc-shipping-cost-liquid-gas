//Roza Antonevici
package calculation;

import tanks.Item;
import tanker.Truck;
import distance_methods.Distance;
import orders.Order;
import java.util.*;

public class Calculation {

  //Helper class to get distances between cities super useful for calculating shipping costs
  private Distance distance;

  //List of trucks available for shipping 
  private List<Truck> trucks;

  //Constants for pricing which keep the calculations consistent and easy to manipulate
  private static final double COST_PER_KM_PER_GALLON = 0.01;  //this is the cost for every km per gallon shipped
  private static final double RETURN_COST_PER_KM = 0.6;       //this is the net cost for the truck's return trip

  /**
   *Constructor section which will initialize distance info and load available trucks
   *This will set up the environment so I can start calculating shipments smoothly with the program
   */
  public Calculation() {
    this.distance = new Distance();
    this.trucks = new ArrayList<>();
    initializeTrucks();  //loads trucks of different sizes
  }

  /**
   *This section adds the available truck types to the trucks list
   *The requirements want small, medium, and large trucks to cover all shipment sizes
   */
  private void initializeTrucks() {
    trucks.add(new tanker.SmallTruck());
    trucks.add(new tanker.MediumTruck());
    trucks.add(new tanker.LargeTruck());
  }

  /**
   *This section calculates the total shipping price for a given order
   *And it also ncludes base cost, risk factor surcharge or however you write that and the cost of the truck returning empty
   *To consider risky terms as well
   */
  public double calculateShippingPrice(Order order) {
    String destination = order.getDestination();
    double distanceKm = distance.getDistance(destination);

    //Total liquid volume in gallons (I assume order can have multiple items)
    double totalVolume = order.getTotalVolume();

    //Getting the highest risk factor among all items in the order
    double maxRiskFactor = order.getItems().stream()
        .mapToDouble(Item::getRiskFactor)
        .max()
        .orElse(0.0);  //default to 0 if no items are got just in case

    //Base cost depends on distance and volume
    double baseCost = distanceKm * totalVolume * COST_PER_KM_PER_GALLON;

    //Extra cost because risky liquids need extra care and price
    double riskCost = baseCost * (maxRiskFactor / 100.0);

    //This is the cost to bring the truck back (empty) after delivery
    double returnCost = distanceKm * RETURN_COST_PER_KM;

    //Total cost is all of the above added together
    return baseCost + riskCost + returnCost;
  }

  /**
   *In this section I am calculate the best combination of trucks needed to carry the total volume of whatever the liquids is/are
   *The company picks big trucks first to minimize the number of trips and then smaller trucks if needed
   */
  public List<Truck> calculateBestShipping(double totalVolume) {
    List<Truck> requiredTrucks = new ArrayList<>();
    double remainingVolume = totalVolume;

    //Sorting trucks by capacity from biggest to smallest to optimize packing
    trucks.sort((t1, t2) -> Double.compare(t2.getVolumeGallons(), t1.getVolumeGallons()));

    //This section keeps adding trucks until we fit most of the volume
    for (Truck truck : trucks) {
      while (remainingVolume >= truck.getVolumeGallons()) {
        requiredTrucks.add(truck);
        remainingVolume -= truck.getVolumeGallons();
      }
    }

    //If some volume still needs shipping the company adds the smallest truck that fits it
    if (remainingVolume > 0) {
      for (Truck truck : trucks) {
        if (truck.getVolumeGallons() >= remainingVolume) {
          requiredTrucks.add(truck);
          break;  // found the perfect fit, no need to look further
        }
      }
    }

    return requiredTrucks;
  }

  /**
   *This is the big boss method that processes the entire order:
   *it calculates cost
   *and then figures out the trucks needed
   *and prints a cute summary for the client
   * 
   *basically its the final display on the console still have to edit that 
   */
  public void processOrder(Order order) {
    double totalCost = calculateShippingPrice(order);
    order.setTotalCost(totalCost);  // Save total cost inside order for later use

    List<Truck> requiredTrucks = calculateBestShipping(order.getTotalVolume());

    //This is where the shipping details are printed
    System.out.println("\n----- Shipping Details -----");
    System.out.println("From: Hamburg");
    System.out.println("To: " + order.getDestination());
    System.out.println("Distance: " + String.format("%.2f", distance.getDistance(order.getDestination())) + " km");

    //Counting how many of each truck type are needed and print it out
    System.out.println("\n----- Required Trucks -----");
    Map<String, Integer> truckCount = new HashMap<>();
    for (Truck truck : requiredTrucks) {
      truckCount.merge(truck.getType(), 1, Integer::sum);
    }
    for (Map.Entry<String, Integer> entry : truckCount.entrySet()) {
      System.out.println(entry.getValue() + "x " + entry.getKey());
    }

    //Breaking down the costs
    System.out.println("\n----- Cost Breakdown -----");
    System.out.println("Base Cost: " + String.format("%.2f", totalCost * 0.7) + " EUR");
    System.out.println("Risk Factor Cost: " + String.format("%.2f", totalCost * 0.2) + " EUR");
    System.out.println("Return Trip Cost: " + String.format("%.2f", totalCost * 0.1) + " EUR");
    System.out.println("Total Cost: " + String.format("%.2f", totalCost) + " EUR");

    //Finally this is where the printing of the order details happen
    order.printOrderDetails();
  }
}
