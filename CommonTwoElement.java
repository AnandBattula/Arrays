package array;

public class CommonTwoElement {
	public static void main(String[] args) {
		  int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
	      int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};
	      commonElementsBetweenTwoArrays(array1,array2);
	      System.out.println();
	      String[] array11 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
	      
	      String[] array21 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
	      commonElementsBetweenTwoArrays1(array11,array21);


	}
	public static void commonElementsBetweenTwoArrays(int array1[], int array2 []) {
		for(int i = 0 ;i<array1.length;i++) {
			for(int j = 0;j<array2.length;j++) {
				if(array1[i]==array2[j]) {
					System.out.println(array1[i]);
				}
			}
		}
	}
	public static void commonElementsBetweenTwoArrays1(String[] array11, String[] array21) {
		for(int i = 0 ;i<array11.length;i++) {
			for(int j = 0;j<array21.length;j++) {
				if(array11[i]==array21[j]) {
					System.out.println(array11[i]);
				}
			}
		}
	}
	

}
