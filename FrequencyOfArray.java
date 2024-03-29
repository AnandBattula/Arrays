package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FrequencyOfArray {
	public static void main(String[] args) {
		frequencyArray();
	}
	public static void frequencyArray(){
		
		int arr[] = {45,78,45,12,78,45,12,96};
		Map<Integer,Integer> map = new HashMap<>();
		for(Integer array:arr) {
			if(map.containsKey(array)) {
				map.put(array, map.get(array)+1);
			}
			else {
				map.put(array, 1);
			}
		}
		// print array
		Set<Map.Entry<Integer,Integer>> entrySet =map.entrySet();
		for(Entry<Integer, Integer> entry:entrySet) {
			if(entry.getValue()>=0) {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
		
	}

}
