package org.example.Discount;
import java.util.*;

public class DiscoutFind {
	
	private float originalPrice;
	private float discountRate ;
	private float discountAmount;
	private float finalPrice;

	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("original price :   ");
		this.originalPrice =  sc.nextFloat();
		System.out.println("discountRate :   ");
		this.discountRate = sc.nextFloat();
		sc.close();
		
	}
	
	public void  calculateDiscount() {
		 discountAmount = this.originalPrice * (this.discountRate / 100) ;
		 finalPrice = this.originalPrice - this.discountAmount; 
	}
	
	public void printRecord() {
		System.out.println("fianl price after discount :   "+finalPrice);
	}

}
