package org.piyush;

import java.util.Scanner;

public class HospitalManageSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Hospital Management System");
        System.out.println("1. Register Patient");
        System.out.println("2. Schedule Appointment");
        System.out.println("3. View Electronic Health Records (EHR)");
        System.out.println("4. Billing and Invoicing");
        System.out.println("5. Inventory Management");
        System.out.println("6. Staff Management");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                PatientModule.registerPatient();
                break;
            case 2:
                AppointmentModule.scheduleAppointment();
                break;
            case 3:
                EHRModule.viewEHR();
                break;
            case 4:
                BillingModule.generateBill();
                break;
            case 5:
                InventoryModule.manageInventory();
                break;
            case 6:
                StaffModule.manageStaff();
                break;
            default:
                System.out.println("Invalid Choice!");
        }
        sc.close();
    }
}




