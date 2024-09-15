package org.CompoundInterestCalculator;

public class CompoundInterestCalculator {
	private double principalAmount;
	private int noOfCompounds;
	private double annualInterestRate;
	private double noOfYears;
	private double futureValue;
	private double totalInterest;
	
	public double getPrincipalAmount() {
		return principalAmount;
	}
	public void setPrincipalAmount(double principalAmount) {
		this.principalAmount = principalAmount;
	}
	public int getNoOfCompounds() {
		return noOfCompounds;
	}
	public void setNoOfCompounds(int noOfCompounds) {
		this.noOfCompounds = noOfCompounds;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public double getNoOfYears() {
		return noOfYears;
	}
	public void setNoOfYears(double noOfYears) {
		this.noOfYears = noOfYears;
	}

	public void CalculateInterest() {
		if (noOfCompounds == 0) {
			System.out.println("Number of compounds cannot be zero.");
			return;
		}
		
		double rate = annualInterestRate / 100;
		this.futureValue = principalAmount * Math.pow((1 + rate / noOfCompounds), (noOfCompounds * noOfYears));
		
		totalInterest = this.futureValue - this.principalAmount;
	}
	
	@Override
	public String toString() {
		return String.format("Future value is: %.2f | Total interest is: %.2f", futureValue, totalInterest);
	}
}
