package JavaSessions;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {
		
		int i[] = {10, 20, 30, 40};// 0 to 3 ==> 4
		
		System.out.println(i.length);// 4
		System.out.println(i[0]);// 10
		System.out.println(i[i.length-1]);// 40
		System.out.println(Arrays.toString(i));// [10, 20, 30, 40]
		// System.out.println(i[i.length]);// AIOB: ArrayIndexOutOfBoundsException
		
		// Another way to declare an array (already completed in previous lecture)
		int q[] = new int[4];// here 4 is the length of an array
		System.out.println(Arrays.toString(q));// [0, 0, 0, 0]
		
		String browser[] = {"chrome", "firefox", "ie", "edge"};
		System.out.println(browser);// [Ljava.lang.String;@4c203ea1
		System.out.println(Arrays.toString(browser));// [chrome, firefox, ie, edge]
		
		Object emp[] = {"Ravi", 30, 12.33, 'm', true};
		System.out.println(Arrays.toString(emp));// [Ravi, 30, 12.33, m, true]
		
		// Another way of initializing an array
		int k[] = new int[] {10, 20, 30, 40};// another way of declaring an array
		System.out.println(Arrays.toString(k));// [10, 20, 30, 40]
		// int k[] = new int[4] {10, 20, 30, 40}; // not allowed
		// as soon asyou mention length in the square brackets of an array,
		// it will start giving you an error
		

	}

}
