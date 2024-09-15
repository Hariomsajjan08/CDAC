package org.DiscoutnCalculator;

public class DiscountCalculator {

    float originalPrice;
    float discountRate;
    float discountAmount;
    float finalPrice;

    public DiscountCalculator(float originalPrice, float discountRate) {
        this.discountRate = discountRate;
        this.originalPrice = originalPrice;
    }

    public float getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(float originalPrice) {
        this.originalPrice = originalPrice;
    }

    public float getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(float discountRate) {
        this.discountRate = discountRate;
    }

    public void calculateDiscount() {
        discountAmount = this.originalPrice * (this.discountRate / 100);
        finalPrice = this.originalPrice - discountAmount;
    }

    public String toString() {
        return discountAmount + " discount has been given for the product. " + finalPrice + " is the final price.";
    }
}
