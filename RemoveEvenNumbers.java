package array;

public class RemoveEvenNumbers {
	public static void printArray(int [] arr)
	{
		int n = arr.length; // 5
		for(int i = 0; i<n; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static int[] removeEven(int [] arr)
	{
		int oddCount = 0; // 1  // 2 // 3
		for(int i =0; i<arr.length; i++)
		{
			if(arr[i]%2!=0)
			{
				oddCount++;
			}
			
		}
		int [] result = new int[oddCount]; // size is = 3
		int idx = 0;
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]%2!=0)
			{
				result [idx] = arr[i];
				idx++;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int [] arr = {5, 6, 7, 9, 10, 2};  // 5, 7, 9
		printArray(arr);
		int [] result = removeEven(arr);
		printArray(result);
		
	}

}
