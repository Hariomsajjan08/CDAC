package org.expample.intersection;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection {

	public static void main(String[] args) {
		ArrayList<Integer> ans=new ArrayList<>();
		int arr [] = {1, 10, 5, 3, 6, 7, 2};
		int arr2 [] = {2, 5, 3};
		
		Arrays.sort(arr);
		Arrays.sort(arr2);
		
		int i =0; int j = 0;
		
		while (i < arr.length && j < arr2.length) {
			
			if (arr[i] < arr2 [j]) {
				i++;
			}
			else if (arr2[j] < arr[i]) {
				j++;
			}
			else {
				ans.add(arr[i]);
				i++;
				j++;
			}
			
		}
		
		for (int ele : ans) {
			System.out.print(ele+" ");
		}
		
		

	}

}
