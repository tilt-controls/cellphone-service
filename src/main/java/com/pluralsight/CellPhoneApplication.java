package com.pluralsight;
import java.util.*;


public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // create instance of cellphone class + input serial number
        CellPhone p1 = new CellPhone();
        System.out.println("What is the serial number? ");
        int serialNumber = scanner.nextInt();
        p1.setSerialNumber(serialNumber);
        scanner.nextLine();

        // input model
        System.out.println("What is the model of the phone? ");
        String model = scanner.nextLine();
        p1.setModel(model);

        // input carrier
        System.out.println("Who is the carrier? ");
        String carrier = scanner.nextLine();
        p1.setCarrier(carrier);

        // input phone #
        System.out.println("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        p1.setPhoneNumber(phoneNumber);

        // input owner
        System.out.println("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        p1.setOwner(owner);
        System.out.println();

        // print results
        System.out.println("Serial number: " + p1.getSerialNumber());
        System.out.println("Model: " + p1.getModel());
        System.out.println("Carrier: " + p1.getCarrier());
        System.out.println("Phone number: " + p1.getPhoneNumber());
        System.out.println("Owner: " + p1.getOwner());
        System.out.println();

        // create second phone!!!

//        CellPhone p2 = new CellPhone();
//        System.out.println("What is the serial number? ");
//        serialNumber = scanner.nextInt();
//        p2.setSerialNumber(serialNumber);
//        scanner.nextLine();
//
//        // input model
//        System.out.println("What is the model of the phone? ");
//        model = scanner.nextLine();
//        p2.setModel(model);
//
//        // input carrier
//        System.out.println("Who is the carrier? ");
//        carrier = scanner.nextLine();
//        p2.setCarrier(carrier);
//
//        // input phone #
//        System.out.println("What is the phone number? ");
//        phoneNumber = scanner.nextLine();
//        p2.setPhoneNumber(phoneNumber);
//
//        // input owner
//        System.out.println("Who is the owner of the phone? ");
//        owner = scanner.nextLine();
//        p2.setOwner(owner);
//        System.out.println();

        display(p1);



    }
    public static void display(CellPhone phone) {
        System.out.println("Phone number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }
}
