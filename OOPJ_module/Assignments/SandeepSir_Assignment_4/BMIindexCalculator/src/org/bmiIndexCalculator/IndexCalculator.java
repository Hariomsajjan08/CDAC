package org.bmiIndexCalculator;

public class IndexCalculator {
	private float weight;
	private float height;
	private float index;
	private String str;
	

	public float getWeight() {
		return weight;
	}


	public void setWeight(float weight) {
		this.weight = weight;
	}


	public float getHeight() {
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}
	
	public void calculateIndex() {
		index = this.weight / (this.height * this.height);
		
	}
	public void classifyWeigntCategory() {
		if (index < 18.5) {
            str = "you have underweight";
        } else if (index >= 18.5 && index < 24.9) {
            str ="you have Normal weight";
        } else if (index >= 24.9 && index < 29.9) {
            str = "you have Overweight";
        } else {
            str= "you are Obese";
        }
	}
	public String toString() {
		String str1 = str;
		return str1;
	}
		
}
