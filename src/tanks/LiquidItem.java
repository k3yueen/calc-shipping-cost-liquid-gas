//Roza Antonevici
package tanks;

//this class represents a specific type of Item which is a liquid and extends the abstract Item class

//constructor that initializes the liquid item with the given parameters
public class LiquidItem extends Item {
  public LiquidItem(String name, String chemicalFormula, double riskFactor, double densityKgPerGallon) {
    super(name, chemicalFormula, riskFactor, densityKgPerGallon);
  }

//this method overrides the abstract method from the Item class
//it  prints detailed information about the liquid item
  
  @Override
  public void printItemInfo() {
    System.out.println("\nLiquid Item Information:");
    System.out.println("Name: " + getName());
    System.out.println("Chemical Formula: " + getChemicalFormula());
    System.out.println("Risk Factor: " + getRiskFactor() + "%");
    System.out.println("Density: " + getDensityKgPerGallon() + " kg/gallon");
    System.out.println("Volume: " + getVolumeGallons() + " gallons (" + getVolumeCubicMeters() + " cubic meters)");
    System.out.println("Weight: " + calculateWeight() + " kg");
  }
}
