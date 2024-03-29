package array;

import java.util.Scanner;

public class BubblesSort {
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter elements : ");
		for(int i = 0; i<size;i++) {
			 arr[i]= sc.nextInt();
		}
		*/
		int [] arr = {0,2,4,1,5,0,6,0,8,0,9};
		for(int i = 0; i<arr.length;i++) {
			for(int j =i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}
		
	}

}
