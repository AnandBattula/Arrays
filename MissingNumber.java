package array;
import java.util.*;
public class MissingNumber {
	
	
	
	    public static void main(String[] args) {
	        int[] numbers = {1, 2, 3,4, 5, 6,7,9};
	        int n = numbers.length + 1;
	        int sum = (n * (n + 1)) / 2;
	        int totalSum = 0;
	        for (int i = 0; i < numbers.length; i++) {
	            totalSum += numbers[i];
	        }
	        int missing = sum - totalSum;
	        System.out.println("Missing element: " + missing);
	    }
	



}
