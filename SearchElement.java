package array;

public class SearchElement {
	int count = 0;
	public static void main(String[] args) {
		int a[] = {20, 45, 19, 46, 17, 21};
		SearchElement sl = new SearchElement();
		sl.searchValue(a, 71);
		sl.prime(a);
		
	}
	
	public void searchValue(int a[], int val) {
		count = a.length;
		for(int i=0;i<count;i++) {
			if(a[i]!=val) {
				continue;
			}
			System.out.print(a[i]+" ");
			 
		}
		System.out.println();
	}
	
	public void prime(int a[]) {
		
		for(int i=0;i<a.length;i++) {
			count=0;
			for(int j=1;j<a.length;j++) {
			   if(a[i]%a[j]==0) {
				count++;
			   }
			}
			if(count==2) {
			
			System.out.print(a[i]+" ");
		   }
		}
	}
}
