//Roza Antonevici
package main;

import shippingCompany.Info;
import calculation.Calculation;
import distance_methods.Distance;
import tanker.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Displaying  project info
        Info projectInfo = new Info();
        projectInfo.printInfo();

        //Initializing  calculation system
        Calculation calculator = new Calculation();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== Shipping Company Management System ===");
        System.out.println("Welcome to the Liquid Shipping Calculator!");

        //Adding an order
        System.out.println("\nExample Order:");
        calculator.addOrder("Berlin", "Oxygen", 3200.0);
        calculator.printOrder("Berlin");

        //Try out a destination to see how it works
        System.out.println("Interactive Mode");
        System.out.print("Enter destination city: ");
        String city = scanner.nextLine();

        System.out.print("Enter liquid type (Oxygen, Hydrogen, Nitrogen, etc.): ");
        String liquid = scanner.nextLine();

        System.out.print("Enter quantity in gallons: ");
        double quantity = scanner.nextDouble();

        //Clears the remaining newline
        scanner.nextLine();

        calculator.addOrder(city, liquid, quantity);
        calculator.printOrder(city);

        //Display of available trucks
        System.out.println("Available Truck Types");
        SmallTruck small = new SmallTruck();
        MediumTruck medium = new MediumTruck();
        LargeTruck large = new LargeTruck();

        small.printTruckInfo();
        medium.printTruckInfo();
        large.printTruckInfo();

        //Display of distances
        Distance distanceInfo = new Distance();
        distanceInfo.printAllDistances();

        scanner.close();
        System.out.println("Thank you for using the Shipping Company System!");
    }
}
