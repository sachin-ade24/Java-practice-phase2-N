package Array;

import java.util.Arrays;

public class ArraySorting {
	
	public static void sortArray(int[] arr){
		//Array Sorting - Ascending order
		int ae;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					ae=arr[j];
					arr[j]=arr[i];
					arr[i]=ae;
					//ae=arr[i];
					//arr[i]=arr[j];
					//arr[j]=ae;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr1[] = {1, 2, 2, 1, 3, 5, 4};
		int arr2[] = {5, 2, 4, 3, 1};

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("============================");
		
		//if sortArray is non static
		//ArraySorting ar = new ArraySorting();
		//ar.sortArray(arr);
		
		//if sortArray is static
		//sortArray(arr2);//[1, 2, 3, 4, 5]
		sortArray(arr1);//[1, 1, 2, 2, 3, 4, 5]
	}

}
