package array;

import java.util.Scanner;

public class FindIndex {

	public static void main(String[] args) {
		int [] arr = {4,5,78,21,45,4};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num value : ");
		int num = sc.nextInt();
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]==num) {
				System.out.println("Index number of value : "+i);
			}
		}

	}

}
