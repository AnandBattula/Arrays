package org.youtude.array;

public class Missing_array {

	public static void main(String[] args) {
		int a[]= {3,6,5,8,4,2,23,2,2};
		int b[]= {3,5,4,2,2,2\b//**};
		
		for(int i =0;i<a.length;i++)
		{
			boolean status=true;
			for(int j=0 ; j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					status=false;
					break;
				}
			}
			if(status)
			{
				System.out.println(a[i]);
			}
		}
		
		
	}

}
