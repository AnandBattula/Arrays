package array;

import java.util.Scanner;

public class RemoveSpecificElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int arr [] = new int[5];
		System.out.println("Enter elements : ");
		for(int i = 0 ; i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter remove element : ");
		int remove = sc.nextInt();
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]!=remove) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}

}
