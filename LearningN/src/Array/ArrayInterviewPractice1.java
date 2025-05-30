package Array;

import java.util.Arrays;

public class ArrayInterviewPractice1 {

	public static void main(String[] args) {
		
		int[] a1 = new int[4];
		a1[0]=1;
		a1[1]=4;
		a1[2]=3;
		a1[3]=2;
		
		System.out.println(Arrays.toString(a1));
		
		System.out.println();
		
		for(int i=0; i<a1.length; i++) {
			System.out.println(a1[i]);
		}
		
		Arrays.sort(a1);
		
		System.out.println(Arrays.toString(a1));
		
		for(int i=a1.length-1; i>=0; i--) {
			System.out.println(a1[i]);
		}
		
		int [] a2 = new int[4];
		a2[2] = 2;
		System.out.println(Arrays.toString(a2));//[0, 0, 2, 0]
		
		String [] s1 = new String[5];
		s1[4] = "Sachin";
		
		System.out.println(Arrays.toString(s1));//[null, null, null, null, Sachin]
	}

}
