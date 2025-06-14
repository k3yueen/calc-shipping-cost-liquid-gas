//Roza Antonevici
package tanker;
public class LargeTruck extends Truck {

  /**
   * this is a section for constructor that initializes the LargeTruck with given length and radius values
   *these values are converted from inches to meters:
   *length: 860 inches ≈ 21.84 meters
   *and radius: 52 inches ≈ 1.32 meters
   */
  public LargeTruck() {
    super("Large", 21.84, 1.32);
  }

  /**
   *overrides the Truck's abstract printTruckInfo method to provide
   *formatted details specific to a LargeTruck
   */
  @Override
  public void printTruckInfo() {
    System.out.println("\nLarge Truck Information:");
    System.out.println("Length: " + String.format("%.2f", getLengthMeters()) + " meters");
    System.out.println("Radius: " + String.format("%.2f", getRadiusMeters()) + " meters");
    System.out.println("Volume: " + String.format("%.2f", getVolumeGallons()) + " gallons (" +
        String.format("%.2f", getVolumeCubicMeters()) + " cubic meters)");
  }
}
