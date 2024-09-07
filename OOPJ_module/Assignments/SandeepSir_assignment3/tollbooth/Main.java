package org.example.tollbooth;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TollBoothRevenueManager obj1 = new TollBoothRevenueManager();
		
		obj1.acceptRecord();
		obj1.setTollRate();
		obj1.calculateRevenue();
		
	}

}
