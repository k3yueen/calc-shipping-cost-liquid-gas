//Roza Antonevici
package main;

//Importing necessary classes from other packages
import calculation.Calculation;
import tanks.LiquidItem;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import orders.Order;
import shippingCompany.Info;
import distance_methods.Distance;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        try {
            //Step 1: Displaying project information (name, ID, group, submission date)
            Info info = new Info("Roza Antonevici", "xxxxxxxx", "B", "June 13");
            info.printInfo();

            //Step 2: Initializing the calculation and distance systems
            Calculation calculation = new Calculation();
            Distance distance = new Distance();

            //Step 3: Defining available liquid items and their properties
            Map<String, LiquidItem> availableItems = new HashMap<>();
            availableItems.put("O2", new LiquidItem("Oxygen", "O2", 17.0, 9.8));
            availableItems.put("H2", new LiquidItem("Hydrogen", "H2", 18.0, 0.7));
            availableItems.put("N2", new LiquidItem("Nitrogen", "N2", 2.0, 7.2));
            availableItems.put("Propene", new LiquidItem("Propene", "C3H6", 20.0, 4.2));
            availableItems.put("CO2", new LiquidItem("Carbon Dioxide", "CO2", 10.0, 8.8));
            availableItems.put("CH4", new LiquidItem("Methane", "CH4", 18.0, 2.7));
            availableItems.put("Benzene95", new LiquidItem("Benzene Super E95", "C6H6", 20.0, 7.3));
            availableItems.put("Benzene", new LiquidItem("Benzene Super", "C6H6", 20.0, 7.3));
            availableItems.put("H2O", new LiquidItem("Water", "H2O", 0.0, 8.3));
            availableItems.put("MLK", new LiquidItem("Milk", "H2O+", 0.0, 8.6)); // fun bonus!

            //Step 4: Displaying available products to the user
            System.out.println("\nAvailable Products:");
            for (Map.Entry<String, LiquidItem> entry : availableItems.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue().getName());
            }

            //Step 5: Showing available cities from Hamburg and prompt user to choose one
            System.out.println("\nAvailable Cities:");
            for (String city : distance.getAvailableCities()) {
                System.out.println(city);
            }

            System.out.println("\nEnter destination city:");
            String destination = scanner.nextLine();

            //This section validate the city input if it doesnt exist
            if (!distance.isValidCity(destination)) {
                System.out.println("Error: Invalid destination city. Please choose from the available cities.");
                return; //exit the program if city is invalid, user has to rerun the program again
            }

            //Step 6: Creating an order for the selected city
            Order order = new Order(destination);

            //Step 7: Starting item selection loop
            while (true) {
                System.out.println("\nEnter product code (or type 'done' to view the shipping detail and your best solution): ");
                String productCode = scanner.nextLine().toUpperCase(); // Normalize to uppercase

                //Breaks the loop if user is finished
                if (productCode.equals("DONE")) {
                    break;
                }

                //Validating product code
                if (!availableItems.containsKey(productCode)) {
                    System.out.println("Invalid product code. Please try again.");
                    continue;
                }

                //this section prompts for volume input
                System.out.println("Enter volume in gallons (and 'done' to view the shipping detail and your best solution):");
                try {
                    double volume = Double.parseDouble(scanner.nextLine());

                    if (volume <= 0) {
                        System.out.println("Error: Volume must be greater than 0.");
                        continue;
                    }

                    //this section update volume and adds the item to the order
                    LiquidItem item = availableItems.get(productCode);
                    item.setVolumeGallons(volume);
                    order.addItem(item);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Please enter a valid number for volume.");
                }
            }

            //Step 8: Checking if any items were added to the order
            if (order.getItems().isEmpty()) {
                System.out.println("Error: No items were added to the order.");
                return;
            }

            //Step 9: Processing the order and calculating shipping details
            calculation.processOrder(order);

        } catch (Exception e) {
            //Handles any unexpected exceptions with error msg
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Step 10: closing the scanner
            scanner.close();
        }
    }
}
