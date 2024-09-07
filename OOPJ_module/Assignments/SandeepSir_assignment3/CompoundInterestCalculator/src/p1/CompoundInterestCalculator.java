package p1;

import java.util.Scanner;

public class CompoundInterestCalculator {
	
	private double principalAmount;
	private double interestRate;
	private double noOfCompounds;
	private double noOfYears;
	private double futureValue;
	private double totalInterest;
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("principalAmount :   ");
		principalAmount = sc.nextDouble();
		System.out.println("interstRate :   ");
		interestRate = sc.nextDouble() / 100;
		System.out.println("noOfYears :   ");
		noOfYears = sc.nextDouble();
		System.out.println("Interest is Compounded Per Year:   ");
		noOfCompounds = sc.nextDouble();
		
		sc.close();
	}
	
	public void  calculateFutureValue() {
		this.futureValue = principalAmount * Math.pow((1 + interestRate / noOfCompounds),(noOfCompounds * noOfYears));
		
		 totalInterest = this.futureValue - this.principalAmount; 
	}
	
	public void printRecord () {
		System.out.println("total interest earned :   "+totalInterest);
		
	}
}
