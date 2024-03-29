package array;
import java.util.*;

/* 
 * Print duplicate elements present in array
 * 
 * Input = {1,5,4,2,1,4,7}
 * output = {1,4}
 * 
 * we are going to use set data structure 
 * 
 * Set is an unordered collection of objects in which Duplicate values cannot be stored 
 * Set id an interface and it is implemented by HashSet, LindedHashSet, or TreeSet class
 * 
 *
 */
public class DuplicateElements {
	public static void main(String[] args) {
		int [] arr = {1,5,4,2,1,4,7};
		Set <Integer> uniqueNumber = new HashSet <> ();
		boolean isDuplicateExist = false ;
		
		for (int i = 0; i<arr.length; i++)
		{
			if(uniqueNumber.contains(arr[i]))
			{
				isDuplicateExist = true;
				System.out.println("Duplicate Element " + arr[i]);// 1,4
			}
			else
			{
				// 1,5,4,2,7
				uniqueNumber.add(arr[i]);
			}
		}
		if (isDuplicateExist==false)
		{
			System.out.println("Duplicate elements are not found...");
		}

	}
	
	

}
