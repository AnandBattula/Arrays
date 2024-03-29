package array;

import java.util.Scanner;

public class FindPeakElement {
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int size = sc.nextInt();
		int [] array = new int[size];
		System.out.println("Enter into the elements");
		for(int i = 0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}*/
		int array[] = { 1, 3, 20, 4, 1, 0 };
		int n = array.length;
		System.out.print("Index of a peak point is " + findPeak(array, n));
		findPeak(array,n);
	}
		public static int findPeak(int [] array, int n) {
			/* n =array.length;
			if (n == 1)
	            return 0;
	        if (array[0] >= array[1])
	            return 0;
	        if (array[n - 1] >= array[n - 2])
	            return n - 1;
	            */
		for(int i = 1;i<array.length;i++) {
			if(array[i] >= array[i-1] && array[i] >= array[i+1]) {
				return array[i];
			}
		}
		return 0;
		
	}

}
