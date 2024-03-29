package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertToArrayList {
	public static void main(String[] args) {
		String arr[] = {"anand", "battula", "yadav"};
		
		// way-1
		List list = Arrays.asList(arr);
		System.out.println(list);
		
		// way-2
		ArrayList al = new ArrayList<>();
		Collections.addAll(al,arr);
		System.out.println(al);
		
		// way-3
		ArrayList al1 = new ArrayList<>();

		for(String s: arr) {
			al1.add(s);
		}
		System.out.println(al1);
		
	}

}
