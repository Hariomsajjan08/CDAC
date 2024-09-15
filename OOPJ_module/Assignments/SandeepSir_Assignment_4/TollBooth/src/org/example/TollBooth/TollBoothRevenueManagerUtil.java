package org.example.TollBooth;

import java.util.Scanner;

public class TollBoothRevenueManagerUtil {

    public static Scanner sc = new Scanner(System.in);
    TollBoothRevenueManager t1 = new TollBoothRevenueManager();

    public void showMenu() {
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Accept Record");
            System.out.println("2. Print Record");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    acceptRecord();
                    setTollRates();
                    break;
                case 2:
                    printRecord();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    public void acceptRecord() {
        System.out.println("Enter the number of cars: ");
        t1.setNoOfCars(sc.nextInt());
        System.out.println("Enter the number of motorcycles: ");
        t1.setNoOfMotorCycles(sc.nextInt());
        System.out.println("Enter the number of trucks: ");
        t1.setNoOfTrucks(sc.nextInt());
    }

    public void setTollRates() {
        System.out.println("Enter the rate for cars: ");
        t1.setRateOfCars(sc.nextInt());
        System.out.println("Enter the rate for motorcycles: ");
        t1.setRateOfMotoCycles(sc.nextInt());
        System.out.println("Enter the rate for trucks: ");
        t1.setRateOfTrucks(sc.nextInt());
    }

    public void printRecord() {
        t1.calculateTotalRevenue();
        String str = t1.toString();
        System.out.println(str);
    }
}
