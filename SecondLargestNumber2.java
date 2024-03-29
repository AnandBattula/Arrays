package array;

import java.util.Arrays;

public class SecondLargestNumber2 {
	
	public static void secondLargest(int arr[]) {
		int size = arr.length;
		if(size < 2) {
			System.out.println(("Invalid input"));
			return;
		}
		Arrays.sort(arr);
		
		//System.out.println(arr[size-2]);
		
		for(int i = size-2; i>=0 ; i--) {
			if(arr[i] != arr[size-1]) {
				System.out.println("The second largest element is : "+arr[i]);
				return;
			}
		}
		
	}
	public static void main(String[] args) {
		int arr [] = {5, 1, 3, 9, 9, 4, 7, 7};
		secondLargest(arr);
	}

}
