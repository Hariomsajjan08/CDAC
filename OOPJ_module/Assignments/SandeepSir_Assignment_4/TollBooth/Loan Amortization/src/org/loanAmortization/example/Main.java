package org.loanAmortization.example;

public class Main {
    public static void main(String[] args) {
        LoanAmortizationUtil obj1 = new LoanAmortizationUtil();
        obj1.acceptRecord(new LoanAmortizationCalculator(0, 0, 0));
    }
}