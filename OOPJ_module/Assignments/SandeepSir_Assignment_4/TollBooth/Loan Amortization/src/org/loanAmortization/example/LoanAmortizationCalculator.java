package org.loanAmortization.example;

public class LoanAmortizationCalculator {
    private double principalAmount;
    private double interestRate;
    private double loanTerm;

    public LoanAmortizationCalculator(double principalAmount, double interestRate, double loanTerm) {
        this.principalAmount = principalAmount;
        this.interestRate = interestRate;
        this.loanTerm = loanTerm;
    }

    public double getPrincipal() {
        return principalAmount;
    }

    public void setPrincipal(double principalAmount) {
        this.principalAmount = principalAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(double loanTerm) {
        this.loanTerm = loanTerm;
    }

    public void calculateMonthlyPayment(LoanAmortizationUtil util) {
        double numberOfMonths = this.loanTerm * 12;
        double monthlyInterestRate = this.interestRate / 12 / 100;
        double numerator = this.principalAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths);
        double denominator = Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1;
        double monthlyPayment = numerator / denominator;
        double totalPayment = monthlyPayment * numberOfMonths;

        util.printRecord(monthlyPayment, totalPayment);
    }
}