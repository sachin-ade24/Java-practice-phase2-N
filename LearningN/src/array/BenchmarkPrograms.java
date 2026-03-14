package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

//import java.util.Arrays;

public class BenchmarkPrograms {

	public static void main(String[] args) {

		//1. Array
		int [] a = {5, 3, 0, 2, 0, 7, 1, 4, 0};
		int b;
		for(int i=0; i<=a.length-1; i++) {
			for(int j=i+1; j<=a.length-1; j++) {
				//System.out.println("a[i] is: " +a[i] + " a[j] is: " + a[j]);
				if(a[i]>a[j]) {
					b=a[i];
					a[i]=a[j];
					a[j]=b;
				}
				//System.out.println("for " + i +"th index " + a[i] + " " + Arrays.toString(a));
				if(a[i]==0) {
					b = a[i];
					a[i] = a[j];
					a[j]=b;
				}
			}
			System.out.println(a[i]);
		}
		
//		//2. String
//		String s = "Hello world";
//		StringBuilder sb = new StringBuilder(s);
//		StringBuilder reverseSb = sb.reverse();
//		String reverseSbStr = reverseSb.toString();
//		String r1 = "([A-Za-z]+)(\\s)([A-Za-z]+)";
//		String newString = reverseSbStr.replaceAll(r1, "$3$2$1");
//		System.out.println(newString);
		
		
		//2. ArrayList
		int[] c = {5, 3, 0, 2, 0, 7, 1, 4, 0};
		Arrays.sort(c);
		ArrayList<Integer> arrLst = new ArrayList<>();
		ArrayList<Integer> arrLstZero = new ArrayList<>();
		for(int i=0; i<c.length; i++) {
			if(c[i]!=0) {
				arrLst.add(c[i]);
			} else {
				arrLstZero.add(c[i]);
			}
		}
		arrLst.addAll(arrLstZero);
		System.out.println(arrLst);
		
		
		//3.
		int[] arr = {5,3,0,2,0,7,1,4,0};

		Arrays.sort(arr);
		System.out.println("The largest number is: " + arr[arr.length-1]);
		System.out.println("The smallest number is: " + arr[0]);

		int index = 0;

		for(int i=0;i<arr.length;i++){
		    if(arr[i]!=0){
		        arr[index++] = arr[i];
		    }
		}

		while(index < arr.length){
		    arr[index++] = 0;
		}

		System.out.println(Arrays.toString(arr));
		
		
		//4.
		
		
		
	}

}
