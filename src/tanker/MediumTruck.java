//Roza Antonevici
package tanker;

public class MediumTruck extends Truck {
    
    public MediumTruck() {
        super(9.65, 1.02, "Medium");
    }
    
    @Override
    public void printTruckInfo() {
        System.out.println("Medium Truck Info");
        System.out.println("Type: " + type);
        System.out.println("Length: " + String.format("%.2f", length) + " m");
        System.out.println("Radius: " + String.format("%.2f", radius) + " m");
        System.out.println("Volume: " + String.format("%.2f", calculateVolume()) + " m³");
        System.out.println("Capacity: " + String.format("%.2f", getVolumeInGallons()) + " gallons");
        System.out.println("made by Roza");
    }
    
}
