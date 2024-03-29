package array;

import java.util.Map;

import minimum_And_Maximum_Value.Min_And_Max_Value;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;


public class MigratoryBird {
	public static void main(String[] args) {
		int [] ar = {1,2,3,4,5,1,4,3,2,2,3,3};
		List<int[]> arr = Arrays.asList(ar);
		
		for(int i=0; i<arr.size();i++){
            ar[arr.get(i)-1]++;
        }
        int max=0,ans=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max){
                max = ar[i];
                ans = i+1;
            }
        }
        return ans;

    }
}