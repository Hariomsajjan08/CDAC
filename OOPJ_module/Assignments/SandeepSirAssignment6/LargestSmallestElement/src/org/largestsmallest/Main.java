package org.largestsmallest;



public class Main {
	
	public static void main(String[] args) {
		int [] arr = {10,20,50,12,34,25};
		
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("largest element in array is :  "+max);
		System.out.println("smallest element in array is :  "+min);

	}

}
