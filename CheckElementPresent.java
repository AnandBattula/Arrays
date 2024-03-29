package array;

import java.util.Scanner;

public class CheckElementPresent {
	public static void main(String[] args) {
		int arr [] = {4,5,6,9,8,7};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num ");
		int num = sc.nextInt();
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]==num) {
				System.out.println("Number is present");
			}
			else {
				System.out.println("Number is not present");
			}
		}
	}

}
