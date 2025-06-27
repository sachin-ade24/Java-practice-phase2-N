package Array;

public class ArrayIntialization {

	public static void main(String[] args) {

		//1.
		int[] arr;
		arr = new int[5];  // Array of size 5

		//2.
		int[] arr2 = new int[5];  // Declaring and initializing an array of size 5
		
		//3.
		int[] arr3 = {1, 2, 3, 4, 5};  // Directly initializing with values

		//4.
		int[] arr4 = new int[]{1, 2, 3, 4, 5};  // Explicitly using `new int[]`
		
		for(int i=0; i<arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		System.out.println();
		for(int i: arr4) {
			System.out.println(i);
		}

	}

}
