//Roza Antonevici
package orders;

public class order {
    private String destination;
    private String liquidName;
    private double quantity;
    
    public order(String destination, String liquidName, double quantity) {
        this.destination = destination;
        this.liquidName = liquidName;
        this.quantity = quantity;
    }
    
    // Getters and Setters
    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }
    
    public String getLiquidName() { return liquidName; }
    public void setLiquidName(String liquidName) { this.liquidName = liquidName; }
    
    public double getQuantity() { return quantity; }
    public void setQuantity(double quantity) { this.quantity = quantity; }
    
    public void printOrderInfo() {
        System.out.println("Order: " + quantity + " gallons of " + liquidName + " to " + destination);
    }
}

