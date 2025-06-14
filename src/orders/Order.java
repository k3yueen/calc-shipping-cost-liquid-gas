//Roza Antonevici
package orders;

import tanks.Item;
import java.util.*;

/**
 *Represents a customers shipping order 
 *Stores destination, ordered items, total volume, weight, and cost
 */
public class Order {
  //Fields of items
  private String destination;        // Destination city
  private List<Item> items;          // List of items in the order
  private double totalVolume;        // Total volume in gallons
  private double totalWeight;        // Total weight in kg
  private double totalCost;          // Final calculated shipping cost

  /**
   *Constructor for an order
   */
  public Order(String destination) {
    this.destination = destination;
    this.items = new ArrayList<>();
    this.totalVolume = 0;
    this.totalWeight = 0;
    this.totalCost = 0;
  }

  /**
   *Adds an item to the order and updates total
   */
  public void addItem(Item item) {
    items.add(item);
    updateTotals(); //Automatically update volume and weight
  }

  /**
   *Recalculates the total volume and weight of the order
   *using  Java Streams for readable results
   */
  private void updateTotals() {
    totalVolume = items.stream()
        .mapToDouble(Item::getVolumeGallons)
        .sum();

    totalWeight = items.stream()
        .mapToDouble(Item::calculateWeight)
        .sum();
  }

  /**
   *setting  the final cost of the order
   *will be called after distance and tank calculations
   */
  public void setTotalCost(double cost) {
    this.totalCost = cost;
  }

  //Getters for accessing order data

  public String getDestination() {
    return destination;
  }

  public List<Item> getItems() {
    return items;
  }

  public double getTotalVolume() {
    return totalVolume;
  }

  public double getTotalWeight() {
    return totalWeight;
  }

  public double getTotalCost() {
    return totalCost;
  }

  /**
   *Printing order summary, including destination, totals, and item details
   */
  public void printOrderDetails() {
    System.out.println("\nOrder Details:");
    System.out.println("Destination: " + destination);
    System.out.println("Total Volume: " + String.format("%.2f", totalVolume) + " gallons");
    System.out.println("Total Weight: " + String.format("%.2f", totalWeight) + " kg");
    System.out.println("Total Cost: " + String.format("%.2f", totalCost) + " EUR");

    System.out.println("\nItems in Order:");
    for (Item item : items) {
      item.printItemInfo();
    }
  }
}
