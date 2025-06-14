//Roza Antonevici
package tanks;

	public class LiquidItem extends Item {
	    
	    public LiquidItem(String name, double riskFactor, double densityKgPerGallon, double quantityGallons) {
	        super(name, riskFactor, densityKgPerGallon, quantityGallons);
	    }
	    
	    @Override
	    public void printItemInfo() {
	        System.out.println("Item Information");
	        System.out.println("Name: " + name);
	        System.out.println("Quantity: " + String.format("%.2f", quantityGallons) + " gallons");
	        System.out.println("Volume: " + String.format("%.2f", calculateVolume()) + " m³");
	        System.out.println("Weight: " + String.format("%.2f", calculateWeight()) + " kg");
	        System.out.println("Risk Factor: " + riskFactor + "%");
	        System.out.println("Density: " + densityKgPerGallon + " kg/gallon");
	        System.out.println("made by Roza");
	    }
	}

