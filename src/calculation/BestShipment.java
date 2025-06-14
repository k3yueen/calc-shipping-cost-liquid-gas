//Roza Antonevici
package calculation;

import tanker.Truck;
import java.util.*;

public class BestShipment {
  
  //List to keep track of the trucks selected for this shipment
  private List<Truck> trucks;

  //The total volume of liquid to be shipped (in gallons)
  private double totalVolume;

  //Total cost for shipping using the selected trucks (in EUR)
  private double totalCost;

  /**
   *Constructor to create a BestShipment object
   *It takes a list of trucks, the total volume, and the total cost
   *I copied the trucks list to keep the shipping company's data safe and separate
   */
  public BestShipment(List<Truck> trucks, double totalVolume, double totalCost) {
    this.trucks = new ArrayList<>(trucks);  //Copy this file into GitHub don't forget!!!
    this.totalVolume = totalVolume;
    this.totalCost = totalCost;
  }

  /**
   *Getter method to retrieve the list of trucks involved in this shipment
   *Was useful when I want to check or manipulate the trucks for later implementations or solutions
   */
  public List<Truck> getTrucks() {
    return trucks;
  }

  /**
   *This is the section where i include a getter for the total volume being shipped
   *Important for understanding how much liquid is being moved
   */
  public double getTotalVolume() {
    return totalVolume;
  }

  /**
   *This is the section where i include the getter for the total cost of the shipment
   *Always good to keep an eye on the budget righttt
   */
  public double getTotalCost() {
    return totalCost;
  }

  /**
   *Printing a clear summary of the best shipment plan
   *Also showing the total volume, total cost, and details about each truck used
   *This section will make it super easy to understand the final shipping solution double check it later dont forget to remove some weird comments
   */
  public void printShipmentDetails() {
    System.out.println("\nBest Shipment Solution:");
    System.out.println("Total Volume: " + String.format("%.2f", totalVolume) + " gallons");
    System.out.println("Total Cost: " + String.format("%.2f", totalCost) + " EUR");

    System.out.println("\nRequired Trucks:");
    for (Truck truck : trucks) {
      truck.printTruckInfo();  //Each truck prints its own details
    }
  }
}
