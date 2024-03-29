package array;

public class DeleteElement {
	
	int count = 6;
	
	public static void main(String[] args) {
		
		int a[] = {12, 45, 84, 65, 47, 78};
		DeleteElement delete = new DeleteElement();
		System.out.println("print original array");
		delete.print(a);
		
		System.out.println("delete element at start");
		delete.deleteElementAtStart(a);
		
		System.out.println("delete element at end");
		delete.deleteElementFromEnd(a);
		//delete.print(a);
		
		System.out.println("delete value of array");
		delete.deleteValue(a, 47);
		//delete.print(a);
		
		System.out.println("delete element at position");
		// delete at position
		delete.deleteAtPosition(a,a.length-2);
		
		
	}
	public void deleteElementAtStart(int a[]) {
		count = a.length;
		for(int i=1;i<a.length;i++) {
			if(a[i]==i)
			return;
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public void deleteElementFromEnd(int a[]){
	    count = a.length;
		for(int i=0;i<a.length-1;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();

	}
	
	
	public void deleteValue(int a[], int val) {
		count = a.length;
		for(int i=0;i<count;i++) {
			if(a[i]==val) {
				continue ;
			}
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	//boolean status ;
	public void deleteAtPosition(int a[], int position) {
		 
		for(int i=0;i<count;i++) {
			if(i==position) {
				continue;
			}
			
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public void print(int a[]) {
		count = a.length;
		for(int i=0;i<count;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	

}
