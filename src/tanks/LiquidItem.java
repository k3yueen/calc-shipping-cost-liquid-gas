//Roza Antonevici
package tanks;

	public class LiquidItem extends Item {
	    
	    public LiquidItem(String name, double riskFactor, double densityKgPerGallon, double quantityGallons) {
	        super(name, riskFactor, densityKgPerGallon, quantityGallons);
	    }
	    
	    @Override
	    public void printItemInfo() {
	        System.out.println("Item Information");
	        System.out.println("Name: " + getName());
	        System.out.println("Quantity: " + String.format("%.2f", getQuantityGallons()) + " gallons");
	        System.out.println("Volume: " + String.format("%.2f", calculateVolume()) + " m³");
	        System.out.println("Weight: " + String.format("%.2f", calculateWeight()) + " kg");
	        System.out.println("Risk Factor: " + getRiskFactor() + "%");
	        System.out.println("Density: " + getDensityKgPerGallon() + " kg/gallon");
	        System.out.println("made by Roza");
	    }
}
