package org.DiscoutnCalculator;

import java.util.Scanner;

public class DiscountCalculatorUtil {

    Scanner sc = new Scanner(System.in);

    // This method now returns a DiscountCalculator object
    public DiscountCalculator acceptRecord() {
        System.out.print("Original price: ");
        float originalPrice = sc.nextFloat();
        System.out.print("Discount rate: ");
        float discountRate = sc.nextFloat();

        DiscountCalculator d = new DiscountCalculator(originalPrice, discountRate);
        d.calculateDiscount();  
        return d;
    }

    public void printRecord(DiscountCalculator d) {
        String str = d.toString();
        System.out.println(str);
    }
}
