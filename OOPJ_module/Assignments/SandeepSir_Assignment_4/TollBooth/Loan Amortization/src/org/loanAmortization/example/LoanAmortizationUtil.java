package org.loanAmortization.example;

import java.util.Scanner;

public class LoanAmortizationUtil {
    public void acceptRecord(LoanAmortizationCalculator calculator) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Principal amount: ");
        double principalAmount = sc.nextDouble();

        System.out.println("Interest rate: ");
        double interestRate = sc.nextDouble();

        System.out.println("Loan terms: ");
        double loanTerm = sc.nextDouble();

        calculator = new LoanAmortizationCalculator(principalAmount, interestRate, loanTerm);
        calculator.calculateMonthlyPayment(this);
    }

    public void printRecord(double monthlyPayment, double totalPayment) {
        System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
        System.out.printf("Total Payment: %.2f\n", totalPayment);
    }
}