package org.youtude.array;

public class Pract {

	public static void main(String[] args) {
		
		//int n = 1;
		//int m = 100;
		
		for(int i = 1; i <= 100 ; i++) {
			
			if (i % 3 == 0) {
				
				System.out.println("Anand");
			}
			else if (i % 5 == 0) {
				
				System.out.println("Batthula");
			}
			 else if(i % 3 == 0 && i % 5 == 0){
				System.out.println("Anand Batthula");
			}
			 else if (i % 7 ==0) {
				 System.out.println("balu");
			 }
			else {
				System.out.println(i);
			}
		}
	}
}
