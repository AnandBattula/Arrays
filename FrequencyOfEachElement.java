package array;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyOfEachElement {
	public static void main(String[] args) {
		System.out.println("character frequencies...........");
		characterFrequency();
		System.out.println("integer frequencies...........");

		integerFrequency();
		
		System.out.println("word frequencies...............");
		wordFrequency();
		System.out.println();
		usingMap();

	}
	// string
	public static void characterFrequency() {
		//Initialize array 
				String s="iamanand";
				char [] arr=s.toCharArray();
				
		        //Array fr will store frequencies of element  
				int[] fr = new int[arr.length];
				int visited=-1;
				
				for(int i=0; i<arr.length; i++) {
					int count =1;
					for(int j=i+1; j<arr.length; j++) {
						if(arr[i]==arr[j]) {
							count++;
							fr[j] = visited;
						}
					}
					if(fr[i]!=visited) {
						fr[i]=count;
						
					}
				}
				for(int i=0; i<fr.length; i++) {
					if(fr[i]!=visited) {
						System.out.println(" "+arr[i]+"  |  "+fr[i]);
					}
				}
	}
				// integer
				
				public static void integerFrequency() {
					//Initialize array 
							
							int[] arr = {1,2,8,3,2,2,2,5,1};
							
					        //Array fr will store frequencies of element  
							int[] fr = new int[arr.length];
							int visited=-1;
							
							for(int i=0; i<arr.length; i++) {
								int count =1;
								for(int j=i+1; j<arr.length; j++) {
									if(arr[i]==arr[j]) {
										count++;
										fr[j] = visited;
									}
								}
								if(fr[i]!=visited) {
									fr[i]=count;
									
								}
							}
							for(int i=0; i<fr.length; i++) {
								if(fr[i]!=visited) {
									System.out.println(" "+arr[i]+"  |  "+fr[i]);
								}
							}
	}
				// words
				public static void wordFrequency() {

					//Initialize array 
							String[] arr= {"java", "python", "sql", "c++", "python", "java", "sql", "java", "java", "c++","python"};
							
							
					        //Array fr will store frequencies of element  
							int[] fr = new int[arr.length];
							int visited=-1;
							
							for(int i=0; i<arr.length; i++) {
								int count =1;
								for(int j=i+1; j<arr.length; j++) {
									if(arr[i]==arr[j]) {
										count++;
										fr[j] = visited;
									}
								}
								if(fr[i]!=visited) {
									fr[i]=count;
									
								}
							}
							for(int i=0; i<fr.length; i++) {
								if(fr[i]!=visited) {
									System.out.println(" "+arr[i]+"  |  "+fr[i]);
								}
							}
				
				}
				public static void usingMap() {
					
					Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
					int[] arr = {1,2,8,3,2,2,2,5,1};
					for(int i:arr) {
						if(map.containsKey(i)){
							map.put(i, 1+1);
						}
						else {
							map.put(i, 1);
						}
								
					}
					for(Entry<Integer,Integer>entry:map.entrySet()) {
						if(entry.getValue()>=1) {
							System.out.println(entry.getKey()+" | "+entry.getValue());
						}
					}

					
				}
				
				
				/*String str = "aadvdrdsfder";
				char str1 [] = str.toCharArray();
				Map<Character, Integer> map = new LinkedHashMap<>();
				for(char ch:str1) {
					map.put(ch,map.containsKey(ch)?map.get(ch)+1:1);
				
				}
				for(Entry<Character,Integer>entry:map.entrySet()) {
					if(entry.getValue()>1) {
						System.out.print(entry.getKey());
					}
				}*/
				

}
