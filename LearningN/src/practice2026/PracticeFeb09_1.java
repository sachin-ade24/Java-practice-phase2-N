package practice2026;

import java.util.Arrays;

public class PracticeFeb09_1 {
	public static void main(String[] args) {
		
		int A[] = new int[5];
		int B[] = {1, 2, 3, 4, 5};
		
		String C[] = new String[4];
		String D[] = {"Sachin", "Kalpana", "Advik", "Sachi"};
		
		System.out.println(Arrays.toString(A));//[0, 0, 0, 0, 0]
		System.out.println(Arrays.toString(B));//[1, 2, 3, 4, 5]
		System.out.println(Arrays.toString(C));//[null, null, null, null]
		System.out.println(Arrays.toString(D));//[Sachin, Kalpana, Advik, Sachi]
		
		//Object Array:
		Object Arr[] = {"Sachin", 37, 'M', 18.5f};
		System.out.println(Arrays.toString(Arr));
		
		Object OA1[] = new Object[5];
		Object OA2[] = new Object[] {"Sachin", 37, 'M', 18.5f, true};
		System.out.println(Arrays.toString(OA1));
		System.out.println(Arrays.toString(OA2));
		
		//One more way to declare an array
		int E[] = new int[] {1, 2, 3, 4, 5};
		System.out.println(E.length);//5				
		
	}
}
