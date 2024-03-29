package array;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int arr [] = new int [size];
		System.out.println("Enter elements : ");
		for(int i = 0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		//int arr[] = {2,4,5,7,8};
		int sum = 0;
		for(int i = 0; i<arr.length;i++) {
			sum = sum + arr[i];
		}
		System.out.println("sum of the array :"+sum);
		double avg = sum/arr.length;
		System.out.println("Averge of Array : "+avg);
	}

}
