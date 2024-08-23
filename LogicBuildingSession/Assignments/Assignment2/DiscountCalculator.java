import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total purchase amount: Rs.");
        double totalPurchase = sc.nextDouble();

        double discount;
        double finalAmount;

        if (totalPurchase >= 1000) {
            discount = totalPurchase * 0.20;
        } else if (totalPurchase >= 500) {
            discount = totalPurchase * 0.10;
        } else {
            discount = totalPurchase * 0.05;
        }

        finalAmount = totalPurchase - discount;

        System.out.println("Total Purchase Amount: " + totalPurchase);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount : " + finalAmount);

        sc.close();
    }
}
