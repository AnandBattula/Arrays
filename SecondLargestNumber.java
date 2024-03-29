package array;



public class SecondLargestNumber {
	
	public static int secondLargest(int arr[], int total) {
		
		int temp;
		
		for(int i = 0; i < total; i++) {
			
			for(int j = i+1; j<total; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
		return arr[total-2];
		
	}
	public static void main(String[] args) {
		int arr [] = {5, 1, 3, 9, 9, 4, 7};
		System.out.println(secondLargest(arr, 6));
	}

}
