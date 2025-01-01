package Array;

import java.util.ArrayList;
import java.util.List;

public class countDuplicateNosInArray {
	
	public static List<Integer> countDuplicateNos(int[] ar) {
		//{2, 10, 10, 100, 2, 10, 11, 2, 11, 2}
		int c=0;
		List<Integer> filter = new ArrayList<Integer>();
		for(int i=0; i<ar.length; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]==ar[j]) {
					if(!filter.contains(ar[i])) {
						filter.add(ar[i]);
					}
				}
			}
			//for(int k=0; k<=filter.size()-1; k++) {
				//if(filter.get(k)==ar[i]) {
					//if(ar[i]==filter.get(0)) {
						//c++;
					//}
				//}
			//}
		}
		System.out.println(c);
		return filter;
	}
	
	public static void countImmediateDuplicateNo(int[] ar) {
		int c=0;
		for(int i=0; i<ar.length; i++) {
			if(i+1<ar.length) {
				if(ar[i]==ar[i+1]) {
					c++;
				}
			}
		}
		System.out.println("Number of duplicate elements are: " + c);
	}

	public static void main(String[] args) {
		int arr[] = {2, 10, 10, 100, 2, 10, 11, 2, 11, 2};
		List<Integer> duplicate = countDuplicateNos(arr);
		for(int g : duplicate) {
			System.out.println(g);
		}
		System.out.println("The no. of the duplicate elements: " + duplicate.size());
	}

}
