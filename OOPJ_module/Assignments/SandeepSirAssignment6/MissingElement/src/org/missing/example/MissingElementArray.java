package org.missing.example;

public class MissingElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {1,2,3,5,6,7,8};
		
		int n = arr.length +1;
		
		int originalSum = n*(n+1)/2;
		
		int actualSum = 0;
		for (int num : arr) {
			actualSum += num;
		}
		
		int missingNum = originalSum - actualSum;
		
		System.out.println(missingNum+" this is the missing num in an array");

	}

}
