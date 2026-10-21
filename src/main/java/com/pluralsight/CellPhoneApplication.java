package com.pluralsight;
import java.util.*;


public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        CellPhone p1 = new CellPhone();
        System.out.println("What is the serial number? ");
        int serialNumber = scanner.nextInt();
        p1.setSerialNumber(serialNumber);
        scanner.nextLine();

        System.out.println("What is the model of the phone? ");
        String model = scanner.nextLine();
        p1.setModel(model);

        System.out.println("Who is the carrier? ");
        String carrier = scanner.nextLine();
        p1.setCarrier(carrier);

        System.out.println("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        p1.setPhoneNumber(phoneNumber);

        System.out.println("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        p1.setOwner(owner);


        System.out.println();





    }
}
