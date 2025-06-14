//Roza Antonevici
package tanks;

public abstract class Item {
    private String name;
    private double riskFactor;
    private double densityKgPerGallon;
    private double quantityGallons;
    
    //Constructor
    public Item(String name, double riskFactor, double densityKgPerGallon, double quantityGallons) {
        this.name = name;
        this.riskFactor = riskFactor;
        this.densityKgPerGallon = densityKgPerGallon;
        this.quantityGallons = quantityGallons;
    }
    
    //Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public double getRiskFactor() { return riskFactor; }
    public void setRiskFactor(double riskFactor) { this.riskFactor = riskFactor; }
    
    public double getDensityKgPerGallon() { return densityKgPerGallon; }
    public void setDensityKgPerGallon(double densityKgPerGallon) { this.densityKgPerGallon = densityKgPerGallon; }
    
    public double getQuantityGallons() { return quantityGallons; }
    public void setQuantityGallons(double quantityGallons) { this.quantityGallons = quantityGallons; }
    
    //Calculating volume in cubic meters (1 gallon = 0.00378541 cubic meters)
    public double calculateVolume() {
        return quantityGallons * 0.00378541;
    }
    
    //Calculating weight in kg
    public double calculateWeight() {
        return quantityGallons * densityKgPerGallon;
    }
    
    public abstract void printItemInfo();
}


    
    public abstract void printItemInfo();
}


