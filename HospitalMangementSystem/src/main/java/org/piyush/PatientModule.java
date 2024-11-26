package org.piyush;

import java.util.Scanner;

public class PatientModule {
    public static void registerPatient() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Patient Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.println("Enter Address: ");
        String address = sc.nextLine();
        System.out.println("Enter Contact Number: ");
        String contact = sc.nextLine();

        // Simulating database insertion
        System.out.println("Patient Registered Successfully!");
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address + ", Contact: " + contact);
    }


}


