package array;

import java.util.Arrays;

public class FindTwoArraysAreEqual {
	
	public static void main(String[] args) {
		
		int arr1 [] = {2,6,7,5,9};
		int arr2 [] = {7,6,2,9,5};
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(arr1 == arr2) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		
		
		
	}

}
