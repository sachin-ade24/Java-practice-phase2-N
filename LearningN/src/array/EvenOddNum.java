package array;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenOddNum {

	public static void main(String[] args) {
		
		//1. Only using a for loop
		int[] intArr = {22, 45, 56, 78, 99};
		for(int num: intArr) {
			if(num%2==0) {
				System.out.println(num);
			}
		}
		
		
		//2. Using ArrayList and for loops
		int[] intArray = {22, 45, 56, 78, 99};
		ArrayList<Integer> intArrLstAll = new ArrayList<>();
		for(int i: intArray) {
			intArrLstAll.add(i);
		}
		System.out.println(intArrLstAll);
		intArrLstAll.removeIf(num -> num%2!=0);
		System.out.println(intArrLstAll);
		for(int n: intArrLstAll) {
			System.out.println(n);
		}
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
		
		//3.
		int[] intAr = {22,45,56,78,99};

		Arrays.stream(intAr)
		      .filter(num -> num % 2 == 0)
		      .forEach(System.out::println);
		
		
		
		
		
		
		
		

	}

}
