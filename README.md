# Liquid Shipping Company
```
project-root/
│
├── main/
│   └── Main.java                      //Execution of entry point
│
├── tanks/
│   ├── Item.java                      //Abstract base class for tank items
│   └── LiquidItem.java                //Extends Item but represents mainly liquid product
│
├── tanker/
│   ├── Truck.java                     //Abstract base class for all trucks
│   ├── SmallTruck.java                //Small tanker subclass
│   ├── MediumTruck.java               //Medium tanker subclass
│   └── LargeTruck.java                //Large tanker subclass
│
├── orders/
│   └── Order.java                     //Encapsulates order composition and item aggregation
│
├── calculation/
│   ├── Calculation.java               //Handles all computations and logic
│   └── BestShipment.java              //Computes optimal truck combinations for given load
│
├── distance_methods/
│   └── Distance.java                  //Validates destinations and retrieves distances
│
├── shippingCompany/
│   └── Info.java                      //Stores and prints user metadata (name, ID, etc.)
```
