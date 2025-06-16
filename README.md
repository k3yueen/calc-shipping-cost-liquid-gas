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

---

## Classes and Responsibilities

### LiquidItem
- Fields: name, code, density, weight, volume
- Methods: volume conversion, getters/setters, info print

### Order
- Fields: list of `LiquidItem`, destination
- Methods: item management, volume aggregation

### Calculation
- Methods:
  - `addItems(List<Item>)`
  - `addOrder(Order)`
  - `totalVolume()`
  - `totalWeight()`
  - `bestShipping()`
  - `shippingPrice()`
  - `printItem()`
  - `printOrder()`

### Distance
- Methods:
  - `getAvailableCities()`
  - `isValidCity(String)`
  - `getDistance(String)`

### Info
- Fields: studentName, studentID, group, submissionDate
- Method: `printInfo()`

---

## Execution Logic

1. Displaying metadata via `Info.printInfo()`
2. Instantiating the `Calculation` and `Distance` classes
3. To show available products and destinations
4. To read and validate user input
5. Construction of an `Order` object with user selected items
6. Performance of calculations via `Calculation`
7. Output best shipping method and order summary

---

## Notes

- System assumes all tankers are available and uses predefined capacity constraints
- Input validation is handled at runtime so invalid entries prompt reentry or exit
- Error handling includes numeric parsing, city validation, and empty orders
