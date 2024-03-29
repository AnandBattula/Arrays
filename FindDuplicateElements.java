package array;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicateElements {
	public static void main(String[] args) {
		int [] arr = {10,10,5,2,7,2};
		String [] stringArr = {"java","python","sql","python","html","java"};
		//printDuplicates(arr);
		usingHashMap(arr);
		//duplicateStrings(stringArr);
		
	}
	public static void printDuplicates(int arr[]) {
		for(int i = 0; i<arr.length;i++) {
			
			for(int j = i+1; j<arr.length;j++) {
				if(arr[i]!=arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}
	public static void usingHashMap(int arr []) {
	HashMap<Integer, Integer> map = new LinkedHashMap<>();

	        for (int i = 0; i < arr.length; i++) {
	            if (map.containsKey(arr[i])) {
	               // int count = map.get(arr[i]);
	                //System.out.println(count);
	                map.put(arr[i], 1 + 1);
	            } else {
	                map.put(arr[i], 1);
	            }
	        }

	        for (Map.Entry<Integer, Integer>entry:map.entrySet()) {
	            if (entry.getValue() >= 1) {
	               System.out.println(entry.getKey());
	            	// System.out.println(en + " is a duplicate element with count " + map.get(i));
	            }
	        }
	    
	}
	public static void duplicateStrings(String stringArr []) {
		HashMap<String, Integer> map = new LinkedHashMap<>();

		        for (int i = 0; i < stringArr.length; i++) {
		            if (map.containsKey(stringArr[i])) {
		               // int count = map.get(arr[i]);
		                //System.out.println(count);
		                map.put(stringArr[i], 1 + 1);
		            } else {
		                map.put(stringArr[i], 1);
		            }
		        }

		        for (Entry<String, Integer> entry:map.entrySet()) {
		            if (entry.getValue() > 1) {
		               System.out.println(entry.getKey());
		            	// System.out.println(en + " is a duplicate element with count " + map.get(i));
		            }
		        }
	}


}
