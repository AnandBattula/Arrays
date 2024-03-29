package array;
// print common elements from given two arrays
import java.util.HashSet;

public class IntersectionOfArray {
	public static void main(String[] args) {
		
		int [] arr1 = {1,2,6,3,4,5};
		int [] arr2 = {3,4,5,6,7,8};
		
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i=0; i<arr1.length;i++) {
			hs.add(arr1[i]);
			
		}
		for (int i=0;i<arr2.length;i++) {
			if(hs.contains(arr2[i])) {
			System.out.print(arr2[i]+" ");
		}
	}

}
}
