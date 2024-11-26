package org.piyush;

import java.util.Scanner;

public class AppointmentModule {
    public static void scheduleAppointment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Patient ID: ");
        int patientId = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.println("Enter Doctor's Name: ");
        String doctor = sc.nextLine();
        System.out.println("Enter Appointment Date (YYYY-MM-DD): ");
        String date = sc.nextLine();

        // Simulating database insertion
        System.out.println("Appointment Scheduled Successfully!");
        System.out.println("Patient ID: " + patientId + ", Doctor: " + doctor + ", Date: " + date);
    }
}




