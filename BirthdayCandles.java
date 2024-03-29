package array;

/* 
 * input : 3,1,2,3
 * output : count highest element : 2
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BirthdayCandles {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("original list :"+list);
		Collections.sort(list);
		int size = list.size();
		int maxElement = list.get(size-1);
		int count = 1;
		for(int i=size-2;i>=0;i--) {
			if(list.get(i)!=maxElement) {
				break;
			}
			else {
				count++;
			}
		}
		System.out.println("count highest element: "+ count);
	}

}
