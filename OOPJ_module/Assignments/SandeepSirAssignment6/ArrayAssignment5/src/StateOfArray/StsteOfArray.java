package StateOfArray;

import java.util.Arrays;
import java.util.Scanner;

class Array{
	int [] arr;
	
	public Array(int n) {
		this.arr = new int[n];
	}
	
	public void acceptReacord (Scanner sc) {
		System.out.println("enter elements in array  : ");
		for (int i =0; i < arr.length; i++) {
			System.out.println("enter an element of an array "+i+": 			");
			arr[i]= sc.nextInt();
		}
		sc.close();
	}
	
	public void printRecord() {
		System.out.println(Arrays.toString(this.arr));
	}
}
public class StsteOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Array a1 = new Array(5);
		
		a1.acceptReacord(sc);
		a1.printRecord();

	}

}
