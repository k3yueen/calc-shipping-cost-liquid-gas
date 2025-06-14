//Roza Antonevici
package tanks;

/**
 *Abstract class representing a chemical item to be transported by tanker trucks
 *that is storing essential chemical and physical properties
 */

public abstract class Item {
  private String name;
  private String chemicalFormula;
  private double riskFactor;
  private double densityKgPerGallon; //Density in kg per gallon
  private double volumeGallons;
  private double volumeCubicMeters;

  public Item(String name, String chemicalFormula, double riskFactor, double densityKgPerGallon) {
    this.name = name;
    this.chemicalFormula = chemicalFormula;
    this.riskFactor = riskFactor;
    this.densityKgPerGallon = densityKgPerGallon;
  }

  //Public getters
  public String getName() {
    return name;
  }

  public String getChemicalFormula() {
    return chemicalFormula;
  }

  public double getRiskFactor() {
    return riskFactor;
  }

  public double getDensityKgPerGallon() {
    return densityKgPerGallon;
  }

  public double getVolumeGallons() {
    return volumeGallons;
  }

  public double getVolumeCubicMeters() {
    return volumeCubicMeters;
  }
 
  
  //Setters
  
  public void setName(String name) {
    this.name = name;
  }

  public void setChemicalFormula(String chemicalFormula) {
    this.chemicalFormula = chemicalFormula;
  }

  public void setRiskFactor(double riskFactor) {
    this.riskFactor = riskFactor;
  }

  public void setDensityKgPerGallon(double densityKgPerGallon) {
    this.densityKgPerGallon = densityKgPerGallon;
  }

  public void setVolumeGallons(double volumeGallons) {
    this.volumeGallons = volumeGallons;
    this.volumeCubicMeters = volumeGallons * 0.00378541; //Converting gallons to cubic meters
  }

  /**
   *calculates total weight in kilograms based on volume and density.
   */
  
  public double calculateWeight() {
    return volumeGallons * densityKgPerGallon;
  }

  /**
   *abstract method to be implemented by subclasses for printing info.
   */
  
  public abstract void printItemInfo();
}
