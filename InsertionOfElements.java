package array;

public class InsertionOfElements {
	// create local variable
	int count = 0;
	public static void main(String[] args) {
		
		
		InsertionOfElements insert = new InsertionOfElements();
		int [] a = new int[5];
		System.out.println("insertion of elements into an array from zero");
		insert.insertFromZero(a, 0);
		
		System.out.println();
		
		// insertion from N
		for(int i=0;i<a.length;i++) {
		insert.insertionFrom_N(a, i+1);
		}
		System.out.println("insertion of elements into an array from N");
		insert.print(a);
		
		System.out.println();
		// insertion at start
		System.out.println("insertion of elements into an array from start");
		insert.insertAtStart(a, 20);
		insert.print(a);
		
		System.out.println();
		// insertion at position
		System.out.println("insertion of elements into an array from position");
		insert.insertAtPosition(a, 3, 40);
		insert.print(a);
		
	}
	
	// insertion of elements into an array from zero
	public void insertFromZero(int a[], int val) {
		
		for(int i=0;i<a.length;i++) {
			a[i]=i;
		}
	}
	
	// insertion of elements into an array from N
	public void insertionFrom_N(int a[], int val) {
		 
			a[count++]=val;
	}
	
	// insertion of element into an array at start
	public  void insertAtStart(int a[], int val) {
		for(int i=a.length-1;i>0;i--) {
			a[i]=a[i-1];
		}
		a[0]=val;
	}
	//insertion of element into an array at position
	public void insertAtPosition(int a[], int position, int val) {
		for(int i=count-1;i>position;i--) {
			a[i]=a[i-1];
		}
		a[position] = val;
	}
	public void print(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
