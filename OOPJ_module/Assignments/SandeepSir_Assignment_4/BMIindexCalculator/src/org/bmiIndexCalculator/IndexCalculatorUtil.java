package org.bmiIndexCalculator;

import java.util.Scanner;

public class IndexCalculatorUtil {
	Scanner sc = new Scanner (System.in);
	IndexCalculator obj1 = new IndexCalculator();
	   public void showMenu() {
	        int choice;
	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1. Accept Record");
	            System.out.println("0. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    acceptRecord();
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
	
	public void acceptRecord () {
		System.out.println("enter weight kg: ");
		this.obj1.setHeight(sc.nextFloat());
		System.out.println("entr heightt in m");
		this.obj1.setHeight(sc.nextFloat());
		
		obj1.calculateIndex();
		obj1.classifyWeigntCategory();
	}
	
	public void printRecord () {
		String str1 = obj1.toString();
		
		System.out.println(str1);
	}
	
	
}
