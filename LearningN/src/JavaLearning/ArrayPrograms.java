package JavaLearning;

import java.util.Arrays;

public class ArrayPrograms {

	public static void main(String[] args) {
		
		int a [] = {10, 20, 30, 40, 50};
		int [] b = {1, 2, 3, 4, 5};
		int c [] = new int[5];
		int [] d = new int[5];
		
		//
		c[0] = 11;
		c[1] = 12;
		c[2] = 13;
		c[3] = 14;
		c[4] = 15;
		System.out.println(c);//[I@2752f6e2
		System.out.println(Arrays.toString(c));
		
		//
		d[0] = 60;
		d[1] = 70;
	    d[2] = 80;
		d[3] = 90;
		d[4] = 100;
		System.out.println(d);//[I@27f674d
		System.out.println(Arrays.toString(d));
		
		//
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println('\n');
		
		System.out.println(Arrays.toString(a));
		
		//
		//In arrays lowest index is always 0.
		//Consider we have an array 'a'.
		//highest index is: a.length-1
		//no. of elements in an array: a.length
		//a.length => 0 to a.length-1
		
		Object o1[] = {12, 'A', "Sac", 13.5, true};
		System.out.println(Arrays.toString(o1));
		
		
		System.out.println(o1.clone());//[Ljava.lang.Object;@5b464ce8
		
		System.out.println(a.getClass());//class [I
		
		String [] s1 = new String[4];//0 to 3 //Default value of a String: null
		int e1 [] = new int[3];//0 to 2 //Default value of a int: 0
		boolean bl [] = new boolean[2];//0 to 1 //Default value of a boolean: false
		float f1 [] = new float[4];//0 to 3 //Default value of a float: 0.0
		char c1 [] = new char[2];//0 to 1 //Default value of a char: space
		

		
	}

}
