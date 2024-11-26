package org.piyush;

import java.util.Scanner;

public class BillingModule {
    public static void generateBill() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Patient ID: ");
        int patientId = sc.nextInt();
        System.out.println("Enter Amount: ");
        double amount = sc.nextDouble();

        // Simulating database insertion
        System.out.println("Bill Generated Successfully!");
        System.out.println("Patient ID: " + patientId + ", Amount: $" + amount);
    }
}



