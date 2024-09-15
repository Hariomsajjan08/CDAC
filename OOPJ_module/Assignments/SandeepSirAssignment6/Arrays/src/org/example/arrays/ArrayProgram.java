package org.example.arrays;
import java.util.Scanner;
class Array{
	
	private int[] arr;
	
	public Array (int size) {
		this.arr =new int [size];
	}
	
	public void printDefaultValues() {
		System.out.println("these are the default array values : ");
		for (int j = 0; j < arr.length; j++ ) {
			System.out.println(arr[j]+" ");
		}
		
	}
	
	public void acceptRecord(Scanner sc) {
		System.out.println("enter elements in array  : ");
		for (int i =0; i < arr.length; i++) {
			System.out.println("enter an element of an array "+i+": 			");
			arr[i]= sc.nextInt();
		}
		sc.close();
	}
	
	public void printRecord() {
		System.out.println("this is your entered array");
		for (int num : arr) {
			System.out.print(num+" ");
		}
	}
	
}



public class ArrayProgram {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array:   ");
		int size= sc.nextInt();
		Array a1 = new Array(size);
		a1.printDefaultValues();
		a1.acceptRecord(sc);
		a1.printRecord();
	}

}
