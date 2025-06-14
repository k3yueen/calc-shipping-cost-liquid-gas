//Roza Antonevici
package tanker;
public class SmallTruck extends Truck {

  /**
   *this is a constructor for SmallTruck.
   *it initializes the truck with:
   *Length: 300 inches ≈ 7.62 meters
   *Radius: 24 inches ≈ 0.61 meters
   */
  public SmallTruck() {
    super("Small", 7.62, 0.61);
  }

  /**
   *Overrides the printTruckInfo method to display:
   *the type of truck there is
   *length and radius in meters
   *volume in gallons and cubic meters
   */
  @Override
  public void printTruckInfo() {
    System.out.println("\nSmall Truck Information:");
    System.out.println("Length: " + String.format("%.2f", getLengthMeters()) + " meters");
    System.out.println("Radius: " + String.format("%.2f", getRadiusMeters()) + " meters");
    System.out.println("Volume: " + String.format("%.2f", getVolumeGallons()) + " gallons (" +
        String.format("%.2f", getVolumeCubicMeters()) + " cubic meters)");
  }
}
