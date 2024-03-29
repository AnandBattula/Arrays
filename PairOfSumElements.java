package array;

public class PairOfSumElements {
	public static void main(String[] args) {
		int [] arr = {30,45,78,32,25,50};
		int num = 75;
		for(int i = 0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==num) {
					System.out.println(arr[i]+"+"+arr[j]+"="+num);
				}
			}
		}
	}

}
