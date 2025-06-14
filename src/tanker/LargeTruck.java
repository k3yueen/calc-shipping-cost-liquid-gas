//Roza Antonevici
package tanker;

public class LargeTruck extends Truck {
    
    public LargeTruck() {
        super(21.84, 1.32, "Large");
    }
    
    @Override
    public void printTruckInfo() {
        System.out.println("Large Truck Info");
        System.out.println("Type: " + type);
        System.out.println("Length: " + String.format("%.2f", length) + " m");
        System.out.println("Radius: " + String.format("%.2f", radius) + " m");
        System.out.println("Volume: " + String.format("%.2f", calculateVolume()) + " m³");
        System.out.println("Capacity: " + String.format("%.2f", getVolumeInGallons()) + " gallons");
        System.out.println("made by Roza");
    }
    
}
