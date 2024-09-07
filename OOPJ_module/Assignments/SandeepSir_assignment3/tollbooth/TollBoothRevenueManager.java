package org.example.tollbooth;

import java.util.Scanner;

public class TollBoothRevenueManager {
	Scanner sc = new Scanner(System.in);
	private int truckRate;
	private int carRate;
	private int motorCycleRate;
	private int noOfMotorCycles;
	private int noOfCars;
	private int noOfTruck;
	
	public void acceptRecord() {
		
		System.out.println(" set toll rates :    ");
		System.out.println("no of cars :   ");
		this.noOfMotorCycles = sc.nextInt();
		System.out.println("no of truck :   ");
		this.noOfCars = sc.nextInt();
		System.out.println("no of motorcycle :   ");
		this.noOfTruck = sc.nextInt();
	}
	
	public void  setTollRate() {
		System.out.println("set rates for car :   ");
		this.carRate = sc.nextInt();
		System.out.println("set rates for truck :   ");
		this.carRate = sc.nextInt();
		System.out.println("set rates for motorcycle :   ");
		this.carRate = sc.nextInt();
	}
	
	public void  calculateRevenue () {
		int totalRevenue = (this.noOfCars * this.carRate) + (this.noOfMotorCycles * this.motorCycleRate) + (this.noOfTruck * this.truckRate);
		printRecord(totalRevenue);
		
		
	}
	
	public void printRecord (int totalRevenue) {
		System.out.println("no of cars :		"+this.noOfCars);
		System.out.println("no of truck :		"+this.noOfTruck);
		System.out.println("no of motorcycle :		"+this.noOfMotorCycles);
		System.out.println("Total revenue generated :       "+totalRevenue);
	}
}
