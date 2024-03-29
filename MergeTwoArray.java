package org.youtude.array;

import java.util.Scanner;

public class MergeTwoArray {
	public int[] merge(int [] arr1, int [] arr2, int n, int m)
	{
		int [] result = new int[n+m];
		int i=0; // traverse arr1
		int j=0;
		int k=0;
		
		//boundary conditions
		while(i<n && i<m)
		{
			if(arr1[i] < arr2[j])
			{
				result[k] = arr1[i];
				i++;
			}
			else
			{
				result[k] = arr2[j];
				j++;
			}
			k++;
		}
		while(i<n)
		{
			result[k] = arr1[i];
			i++;
			k++;
		}
		while(i<m)
		{
			result[k] = arr2[j];
			j++;
			k++;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array1");
		int size1 = sc.nextInt();
		int [] arr1 = new int[size1];
		System.out.println("Array1......");
		for(int i = 0; i<arr1.length; i++)
		{
			System.out.println("Enter Elements");
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter size of Array2");
		int size2 = sc.nextInt();
		System.out.println("Array2.......");
		int [] arr2 = new int[size2];
		for(int i = 0; i<arr2.length; i++)
		{
			System.out.println("Enter Elements");
			arr2[i] = sc.nextInt();
		}
		int n = arr1.length;
		int m = arr2.length;
		MergeTwoArray mta = new MergeTwoArray();
		int [] result = mta.merge(arr1, arr2, n, m);
		mta.merge(result, result, n, m);
	}

}
