package org.piyush;

import java.util.Scanner;

public class EHRModule {
    public static void viewEHR() {
        System.out.println("Enter Patient ID to View Medical History: ");
        Scanner sc = new Scanner(System.in);
        int patientId = sc.nextInt();

        // Simulating data fetch
        System.out.println("Displaying Electronic Health Records for Patient ID: " + patientId);
        System.out.println("Record: [Example Medical History]");
    }
}





