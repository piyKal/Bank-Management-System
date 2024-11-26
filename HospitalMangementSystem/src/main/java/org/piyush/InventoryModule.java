package org.piyush;

import java.util.Scanner;

public class InventoryModule {
    public static void manageInventory() {
        System.out.println("1. Add New Item");
        System.out.println("2. View Inventory");
        System.out.print("Enter Choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter Item Name: ");
                sc.nextLine(); // Consume newline
                String itemName = sc.nextLine();
                System.out.println("Enter Quantity: ");
                int quantity = sc.nextInt();
                System.out.println("Item Added: " + itemName + ", Quantity: " + quantity);
                break;
            case 2:
                System.out.println("Displaying Inventory...");
                System.out.println("[Example Inventory Data]");
                break;
            default:
                System.out.println("Invalid Choice!");
        }
    }
}



