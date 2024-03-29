package array;

import java.util.Collections;

public class Min_Max_Sum {
	public static void main(String[] args) {
		int[] arr = {1,5,3,2,4};
		
		// sorting from smallest to largest
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			int sum = 0;
			for(int k=0; k<arr.length;k++) {
				sum = sum+arr[i];
			}
			System.out.println(sum);
		}
		
		// hacker rank code
		
		/*
		  public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        Collections.sort(arr);
        long sum = 0;
        for(int i=0; i<arr.size();i++){
            sum = sum + arr.get(i);
        }
        long low_sum = sum - arr.get(arr.size()-1);
        long high_sum = sum - arr.get(0);
        System.out.println(low_sum+" "+high_sum);

		 
		 
		 */
		
	}

}
