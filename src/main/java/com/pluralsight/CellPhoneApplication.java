package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        // Make an instance of a CellPhone

        int serialNumber;
        String model;
        String carrier;
        String phoneNumber;
        String owner;

        Scanner scanner = new Scanner(System.in);

        // Questions to create instance

        System.out.print("What is the serial number? ");
        serialNumber = scanner.nextInt();
        System.out.print("What is the model? ");
        model = scanner.nextLine();
        System.out.print("Who is the carrier? ");
        carrier = scanner.nextLine();
        System.out.print("What is the phone number? ");
        phoneNumber = scanner.nextLine();
        System.out.print("Who is the owner of the service? ");
        owner = scanner.nextLine();

        
    }
}
