package array;

public class factorial {
	public static void main(String[] args) {
		int [] arr = { 1,2,3,4,5,6,7,8,9};
		
		int fact  = arr[0];
		for(int i = 0; i<arr.length;i++) {
			int count = 0;
			int fact1  = 0;

			for(int j = 1; j<arr.length; j++) {
				if(i%j==0) {
					//fact = fact *arr[j];
					count++;
				}
			}
			if(count==2) {
				//System.out.println(fact=i);
						fact=i;		
				//System.out.println(prime);

				
			}
			//System.out.println(fact1);

						
		}
		System.out.println(fact);
		
	}

}
