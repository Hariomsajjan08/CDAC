package org.CompoundInterestCalculator;

import java.util.Scanner;

public class CompoundInterestCalculatorUtil {
	Scanner sc = new Scanner(System.in);
	CompoundInterestCalculator obj1 = new CompoundInterestCalculator();
	
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

    // This method now returns a DiscountCalculator object
    public void acceptRecord() {

        System.out.print("principal amount : 		");
        obj1.setPrincipalAmount(sc.nextDouble());
        System.out.print("no of compounds : 		");
        obj1.setNoOfCompounds(sc.nextInt());
        System.out.print("interest rate : 		");
        obj1.setAnnualInterestRate(sc.nextDouble());
        System.out.print("no of years : 		");
        obj1.setNoOfYears(sc.nextDouble());
        
        obj1.CalculateInterest();

    }

    public void printRecord() {
        String str = obj1.toString();
        System.out.println(str);
    }
}
