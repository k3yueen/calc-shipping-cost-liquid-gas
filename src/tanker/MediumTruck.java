//Roza Antonevici
package tanker;
public class MediumTruck extends Truck {

  /**
   *this is a constructor for MediumTruck
   *it initializes with:
   *Length: 380 inches ≈ 9.65 meters
   *Radius: 40 inches ≈ 1.02 meters
   *and is calling the superclass (Truck) constructor to set these values
   */
  public MediumTruck() {
    super("Medium", 9.65, 1.02);
  }

  /**
   *Overrides the printTruckInfo() method to display
   *this truck’s dimensions and calculated volume
   */
  @Override
  public void printTruckInfo() {
    System.out.println("\nMedium Truck Information:");
    System.out.println("Length: " + String.format("%.2f", getLengthMeters()) + " meters");
    System.out.println("Radius: " + String.format("%.2f", getRadiusMeters()) + " meters");
    System.out.println("Volume: " + String.format("%.2f", getVolumeGallons()) + " gallons (" +
        String.format("%.2f", getVolumeCubicMeters()) + " cubic meters)");
  }
}
