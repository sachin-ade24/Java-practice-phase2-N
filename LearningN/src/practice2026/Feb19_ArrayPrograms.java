package practice2026;

import java.util.Arrays;

public class Feb19_ArrayPrograms {

	public static void main(String[] args) {
		
		//
		int[] numbers = {1, 5, 10, 25};
		int sum = 0;
		for(int i=0; i<numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("Final sum is: " + sum);
		
		//
		int[] num = {1, 5, 10, 25};
		int sm = 0;
		for(int i: num) {
			sm += i;
		}
		System.out.println("Total sum is: " + sm);

		//
		String[] seats = {"Jenny", "Liam", "Angie", "Bo"};
		for (int i = 0; i < seats.length; i++) {
		  System.out.println("Seat number " + i + " is taken by " + seats[i]);
		}
		
		// An array storing different ages
		int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
		int k;
		for(int i=0; i<ages.length; i++) {
			for(int j=0; j<=i; j++) {
				if(ages[j]>ages[i]) {
					k=ages[i];
					ages[i]=ages[j];
					ages[j]=k;
				}
				//System.out.println(Arrays.toString(ages));
				/*
				 * 
					[20, 22, 18, 35, 48, 26, 87, 70]
					[20, 22, 18, 35, 48, 26, 87, 70]
					[20, 22, 18, 35, 48, 26, 87, 70]
					[18, 22, 20, 35, 48, 26, 87, 70]
					[18, 20, 22, 35, 48, 26, 87, 70]
					[18, 20, 22, 35, 48, 26, 87, 70]
					[18, 20, 22, 35, 48, 26, 87, 70]
					[18, 20, 22, 35, 48, 26, 87, 70]
					[18, 20, 22, 35, 48, 26, 87, 70]
					[18, 20, 22, 35, 48, 26, 87, 70]
					[18, 20, 22, 35, 48, 26, 87, 70]
					[18, 20, 22, 35, 48, 26, 87, 70]
					[18, 20, 22, 35, 48, 26, 87, 70]
					[18, 20, 22, 35, 48, 26, 87, 70]
					[18, 20, 22, 35, 48, 26, 87, 70]
					[18, 20, 22, 35, 48, 26, 87, 70]
					[18, 20, 22, 35, 48, 26, 87, 70]
					[18, 20, 22, 35, 48, 26, 87, 70]
					[18, 20, 22, 26, 48, 35, 87, 70]
					[18, 20, 22, 26, 35, 48, 87, 70]
					[18, 20, 22, 26, 35, 48, 87, 70]
					[18, 20, 22, 26, 35, 48, 87, 70]
					[18, 20, 22, 26, 35, 48, 87, 70]
					[18, 20, 22, 26, 35, 48, 87, 70]
					[18, 20, 22, 26, 35, 48, 87, 70]
					[18, 20, 22, 26, 35, 48, 87, 70]
					[18, 20, 22, 26, 35, 48, 87, 70]
					[18, 20, 22, 26, 35, 48, 87, 70]
					[18, 20, 22, 26, 35, 48, 87, 70]
					[18, 20, 22, 26, 35, 48, 87, 70]
					[18, 20, 22, 26, 35, 48, 87, 70]
					[18, 20, 22, 26, 35, 48, 87, 70]
					[18, 20, 22, 26, 35, 48, 87, 70]
					[18, 20, 22, 26, 35, 48, 87, 70]
					[18, 20, 22, 26, 35, 48, 70, 87]
					[18, 20, 22, 26, 35, 48, 70, 87]
				 * 
				 * */
			}
			//System.out.println(Arrays.toString(ages));
			/*
			 * 
			    [20, 22, 18, 35, 48, 26, 87, 70]
				[20, 22, 18, 35, 48, 26, 87, 70]
				[18, 20, 22, 35, 48, 26, 87, 70]
				[18, 20, 22, 35, 48, 26, 87, 70]
				[18, 20, 22, 35, 48, 26, 87, 70]
				[18, 20, 22, 26, 35, 48, 87, 70]
				[18, 20, 22, 26, 35, 48, 87, 70]
				[18, 20, 22, 26, 35, 48, 70, 87]
			 * */
		}
		System.out.println(Arrays.toString(ages));
		//[18, 20, 22, 26, 35, 48, 70, 87]
		
		
		/*
		 * Alternative way:
		 * 
			int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};
			int temp;
			
			for (int i = 0; i < ages.length - 1; i++) {
			    for (int j = i + 1; j < ages.length; j++) {
			        if (ages[i] > ages[j]) {
			            temp = ages[i];
			            ages[i] = ages[j];
			            ages[j] = temp;
			        }
			    }
			}
			
			System.out.println(Arrays.toString(ages));
		 * */

		
		//Create a program with a list of numbers where you want to skip negative values, 
		//but stop completely if you find a zero
		
		int[] nums = {3, -1, 7, 0, 9};
		
		//1. Traditional for loop
		for(int i=0; i<nums.length; i++) {
			if(nums[i]<0) {
				continue;
			} else if(nums[i]==0) {
				break;
			} else {
				System.out.println(nums[i]);
			}
		}
		
		//2. for each loop
		for(int n: nums) {
			if(n<0) {
				continue;
			} else if(n==0) {
				break;
			} else {
				System.out.println(n);
			}
		}
		
		//Largest number
		int[] nums1 = {45, 12, 98, 33, 27};
		int nu = nums1[0];
		for(int i=0; i<nums1.length; i++) {
			if(nu<nums1[i]) {
				nu=nums1[i];
			}
		}
		System.out.println(nu);//98

		//Smallest number
		nu = nums1[0];
		for(int i=0; i<nums1.length; i++) {
			if(nu>nums1[i]) {
				nu=nums1[i];
			}
		}
		System.out.println(nu);
	}

}
