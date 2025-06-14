//Roza Antonevici
package tanker;

public abstract class Truck {
    protected double length; //in meters
    protected double radius; //in meters
    protected String type;
    
    //Constructor
    public Truck(double length, double radius, String type) {
        this.length = length;
        this.radius = radius;
        this.type = type;
    }
    
    //Getters and Setters
    public double getLength() { 
        return length; 
    }
    
    public void setLength(double length) { 
        this.length = length; 
    }
    
    public double getRadius() { 
        return radius; 
    }
    
    public void setRadius(double radius) { 
        this.radius = radius; 
    }
    
    public String getType() { 
        return type; 
    }
    
    public void setType(String type) { 
        this.type = type; 
    }
    
    //Calculating volume in cubic meters (π × r² × length)
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * length;
    }
    
    //Converting volume to gallons (1 cubic meter = 264.172 gallons)
    public double getVolumeInGallons() {
        return calculateVolume() * 264.172;
    }
    
    public abstract void printTruckInfo();
}
