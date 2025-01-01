package JavaLearning;

import java.util.Arrays;

public class ArraysInterviewPrograms {

	public static void main(String[] args) {
		
		int a [] = {1, 2, 3, 4, 5}, i;
		//Print elements in an Array
		for(i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("=========================");
		//Print elements in an Array in reverse order
		for(i=a.length-1; i>=0 ; i--) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("=========================");
		
		//==============================================================================
		//Even no.
		int b[] = {333, 3, 34, 10, 4, 55, 1000};
		for(i=0; i<=b.length-1; i++) {
			if(b[i]%2==0) {
				System.out.println(b[i] + " ");
			}
		}
		System.out.println("=========================");
		//Odd no.
		for(i=0; i<=b.length-1; i++) {
			if(b[i]%2!=0) {
				System.out.println(b[i] + " ");
			}
		}
		
		System.out.println("=========================");
		
		// Largest no. in an Array
		// int b[] = {333, 3, 34, 10, 4, 55, 1000};
		int j = b[b.length-1];
		//if you initialize 'j' with any bigger number than the biggest array element,
		//it will return the value of 'j' only.
		for(i=0; i<=b.length-1; i++) {
			if(b[i]>j) {
				j=b[i];
			}
		}
		System.out.println(j + " is the largest number in the given array.");//1000
		System.out.println(Arrays.toString(b));
		
		// Smallest no.
		for(i=0; i<=b.length-1; i++) {
			if(b[i]<j) {
				j=b[i];
			}
		}
		System.out.println(j + " is the smallest number in the given array.");//3
		System.out.println(Arrays.toString(b));
		
		System.out.println("=========================");
		
		//Java Program to sort the elements of an array in ascending order
		//int b[] = {333, 3, 34, 10, 4, 55, 1000};
		int k, n;
		for(i=0; i<=b.length-1; i++) {
			for(k=i+1; k<=b.length-1; k++) {
				if(b[i]>b[k]) {
					n=b[i];
					b[i]=b[k];
					b[k]=n;
				}
			}
			System.out.println(b[i]);
		}
		System.out.println(Arrays.toString(b));//[3, 4, 10, 34, 55, 333, 1000]
		
		//Java Program to sort the elements of an array in descending order
		for(i=0;i<=b.length-1;i++) {
			for(k=i+1;k<=b.length-1;k++) {
				if(b[i]<b[k]) {
					n=b[i];
					b[i]=b[k];
					b[k]=n;
				}
			}
			System.out.println(b[i]);
		}
		System.out.println(Arrays.toString(b));//[1000, 333, 55, 34, 10, 4, 3]
		
		System.out.println("=========================");
		
		//print the duplicate no. of an array
		int ct=0;
		int c [] = {1, 2, 4, 4, 9, 7, 9};
		for(i=0;i<c.length;i++) {
			for(k=i+1;k<c.length;k++) {
				if(c[i]==c[k]) {
					System.out.println(c[i]);
					ct++;
				}
			}
		}
		System.out.println(ct);//2
		System.out.println();
		String d[] = {"Tom", "Pom", "Tom", "Sam"};
		for(i=0;i<d.length;i++) {
			for(k=i+1; k<d.length; k++) {
				if(d[i].equals(d[k])) {
					System.out.println(d[i]);//Tom
				}
			}
		}
		
		System.out.println("=========================");
		
		//Given an array, the task is to cyclically rotate the array clockwise by one time.
		int z[] = {1, 2, 3, 4, 5};
		int t=z[z.length-1];
		for(i=z.length-1; i>0; i--) {
			z[i]=z[i-1];
		}
		z[0]=t;
		System.out.println(Arrays.toString(z));
		
		System.out.println("=========================");
		//Array Sorting - Ascending order
		int arr[] = {1, 2, 2, 1, 3, 5, 4};
		int ae;
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
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
		
		System.out.println("=========================");
		
		//arr1[] = {1, 2, 3, 4, 5};
		ae=0;
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					ae++;
				}
			}
		}
		System.out.println(ae);
		
		

	}

}
