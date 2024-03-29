package array;

public class FindPrimeNumbers {
	public static void main(String[] args) {
		int arr [] = {10, 20, 7, 5, 9, 13, 17};
		
		int sum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			
			int count = 0;
			for(int j = 1 ; j <= arr[i]; j++) {
				if(arr[i]%j==0) {
					count++;
				}
				
			}
			
			if(count==2) {
			  sum = sum + arr[i];
			}
			
		}
		System.out.println("sum of the all prime numbers :" + sum);
	}

}
