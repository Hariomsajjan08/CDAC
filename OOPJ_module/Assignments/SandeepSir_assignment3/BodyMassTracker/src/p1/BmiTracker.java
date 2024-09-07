package p1;

import java.util.Scanner;

public class BmiTracker {
		private float weight;
		private float height;
		private float bmi;
		private String classification;
	


	
	public void acceptRecord () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Weight (kg) :   ");
		this.weight = sc.nextFloat();
		System.out.println("height(m) :   ");
		this.height = sc.nextFloat();
		
	}
	
	public void calculateBMI () {
		this.bmi = this.weight  / (this.height * this.height);
	}
	public void classifyBMI () {
		if (bmi < 18.5) {
			classification = "print you are underweight";
		}
		else if (bmi >= 18.5  && bmi < 24.9) {
			classification = "you are normal";
		}
		else if ( bmi >= 25 && bmi < 29.9) {
			classification = "you are overweight";
		}
		else if ( bmi >= 30) {
			classification = "you are obese";
		}
	}
	public void printRecord() {
		System.out.println(classification);
	}
}
