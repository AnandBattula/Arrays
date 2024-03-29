package array;

import java.util.HashSet;
import java.util.Set;

public class CountPairElements {
	public static void main(String[] args) {
		
	
	
	int [] a = {10,10,20,30,30,20,50,10,10};
	
	Set<Integer> set = new HashSet<Integer>();
	int count = 0;
	for(int i=0;i<a.length;i++) {
		if(set.contains(a[i])) {
			count++;
			set.remove(a[i]);
		}
		else {
			set.add(a[i]);
		}
		
	}
	System.out.println(count);
	}

}
