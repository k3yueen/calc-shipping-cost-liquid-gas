//Roza Antonevici
package tanker;

/**
 *this is an abstract base class representing a generic Truck
 *this class defines common properties and behaviors for different truck sizes
 *such as volume calculation based on cylindrical shape
 */

public abstract class Truck {
  private String type;
  private double lengthMeters;
  private double radiusMeters;
  private double volumeGallons;
  private double volumeCubicMeters;

  public Truck(String type, double lengthMeters, double radiusMeters) {
    this.type = type;
    this.lengthMeters = lengthMeters;
    this.radiusMeters = radiusMeters;
    calculateVolume();
  }

  protected void calculateVolume() {
    //Calculating the volume in cubic meters
    this.volumeCubicMeters = Math.PI * radiusMeters * radiusMeters * lengthMeters;

    //Converting  to gallons (1 cubic meter = 264.172 gallons)
    this.volumeGallons = volumeCubicMeters * 264.172;
  }

  //Public getters
  public String getType() {
    return type;
  }

  public double getVolumeGallons() {
    return volumeGallons;
  }

  public double getVolumeCubicMeters() {
    return volumeCubicMeters;
  }

  //Protected getters for subclasses
  protected double getLengthMeters() {
    return lengthMeters;
  }

  protected double getRadiusMeters() {
    return radiusMeters;
  }

  public abstract void printTruckInfo();
}
