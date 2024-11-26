package org.piyush;

import java.util.Scanner;

public class StaffModule {
    public static void manageStaff() {
        System.out.println("1. Add New Staff");
        System.out.println("2. View Staff");
        System.out.print("Enter Choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter Staff Name: ");
                sc.nextLine(); // Consume newline
                String name = sc.nextLine();
                System.out.println("Enter Role (Doctor/Nurse/etc.): ");
                String role = sc.nextLine();
                System.out.println("Enter Contact: ");
                String contact = sc.nextLine();
                System.out.println("Staff Added: " + name + ", Role: " + role + ", Contact: " + contact);
                break;
            case 2:
                System.out.println("Displaying Staff...");
                System.out.println("[Example Staff Data]");
                break;
            default:
                System.out.println("Invalid Choice!");
        }
    }
}




