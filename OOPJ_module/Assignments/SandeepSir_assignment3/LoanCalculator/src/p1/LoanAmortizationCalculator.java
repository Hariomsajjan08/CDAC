package p1;
import java.util.*;
public class LoanAmortizationCalculator {
	
	private double principleAmount;
	private double annualRate;
	private double loanTerm;
	
	
	
	
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter principleAmount :   ");
		this.principleAmount = sc.nextDouble();
		System.out.println("enter annualRate :  ");
		this.annualRate = sc.nextDouble();
		System.out.println("enter loanTerm :  ");
		this.loanTerm = sc.nextDouble();
		
		sc.close();
	}
	
	public void calculateMonthlyPayment () {
		double numberOfMonths = this.loanTerm * 12;
		double monthlyInterestRate = this.annualRate / 12 / 100;
        double numerator = this.principleAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths);
        double denominator = Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1;
        double monthlyPayment = numerator / denominator;
        
        printRecord(numberOfMonths, monthlyInterestRate, monthlyPayment);

	}
	
	public void printRecord(double numberOfMonths, double monthlyInterestRate, double monthlyPayment) {
		System.out.printf("Number of months: %.3f%n", numberOfMonths);
		System.out.printf("Monthly interest rate: %.3f%n", monthlyInterestRate);
		System.out.printf("Monthly payment: %.3f%n", monthlyPayment);
		
	}
	

}