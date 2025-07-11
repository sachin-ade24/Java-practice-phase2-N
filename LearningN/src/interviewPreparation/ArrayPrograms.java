package interviewPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ArrayPrograms {

	public static void main(String[] args) {

		//Eliminate duplicate characters from the string
		String str = "aababdbccdddefghefg";
	        String[] s = str.split("");
	        System.out.println(Arrays.toString(s));
	        //ArrayList<String> arrList =  new ArrayList<String>();
	        Set<String> newSet = new HashSet<String>();
	        for(String sr: s){
	          newSet.add(sr);
	        }
	        System.out.println(newSet);     
	        String result = String.join("", newSet);  
	        System.out.println(result);
		
		
		//Find number of vowels in the given string -- Wipro interview question
		
		//Approach2
		char[] arr = {'A', 'E', 'I', 'O', 'U'};
		String str1 = "SACHIN BABURAO ADE";
		int counter = 0;
		for(int i=0; i<str1.length(); i++) {
			for(int j=0; j<arr.length; j++) {
				if(str1.charAt(i)==arr[j]) {
					counter++;
				}
			}
		}
		System.out.println(counter);
		
		//Approach3
		ArrayList<Character> charArrayList = new ArrayList<Character>();
		int counter1 = 0;
		for(char c: arr) {
			charArrayList.add(c);
		}
		System.out.println(charArrayList);
		for(int i=0; i<str.length(); i++) {
			if(charArrayList.contains(str.charAt(i))) {
				counter1++;
			}
		}
		System.out.println(counter1);
		
		//Count duplicate no. in an array
		int arr1[] = {2, 10, 10, 100, 2, 10, 11, 2, 11, 2};		
		ArrayList<Integer> num = new ArrayList<Integer>();		
		for(int i=0; i<arr1.length; i++) {
			for(int j=i+1; j<arr1.length; j++) {
				if(arr1[i]==arr1[j]) {
					if(!(num.contains(arr1[i]))) {
						num.add(arr1[i]);
					}
				}
			}
		}
		System.out.println(num);
		
		//Rotate the array to right side
        int[] d = {11, 12, 13, 14, 15};
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i: d) {
        	arrList.add(i);
        }
        System.out.println(arrList);
        int n = 2;
        for(int i=1; i<=n; i++) {
        	int lastElement = arrList.remove(arrList.size()-1);
        	arrList.add(0, lastElement);
        }
        System.out.println(arrList);
        
      //Rotate the array to left side
      int[] z = {1, 2, 3, 4, 5};
      ArrayList<Integer> arrList1 = new ArrayList<>();
      for(int i: z) {
    	  arrList1.add(i);
      }
      System.out.println(arrList1);
      for(int i=1; i<=n; i++) {
    	  int firstElement = arrList1.remove(0);
    	  arrList1.add(firstElement);
      }
      System.out.println(arrList1);
      
      //alternate way to shift right 'n' times
      int[] arr2 = {6, 7, 8, 9, 10};
      n=2;
      for(int r=1; r<=n; r++) {
          int lastEle = arr2[arr2.length-1];
          for(int i=arr2.length-1; i>0; i--) {
        	  arr2[i]=arr2[i-1];
          }
          arr2[0]=lastEle;
      }
      System.out.println(Arrays.toString(arr2));
      
      //alternate way to shift left 'n' times
      int[] arr3 = {16, 17, 18, 19, 20};
      n=2;
      for(int r =1; r<=n; r++) {
          int firstEle = arr3[0];
          for(int i=0; i<arr3.length-1; i++) {
        	  arr3[i]=arr3[i+1];
          }
          arr3[arr3.length-1] = firstEle;
      }
      System.out.println(Arrays.toString(arr3));
      
		// Largest no. in an Array
		int b[] = {333, 3, 34, 10, 4, 55, 1000};
		int j = b[0];
		//if you initialize 'j' with any bigger number than the biggest array element,
		//it will return the value of 'j' only.
		for(int i=0; i<=b.length-1; i++) {
			if(b[i]>j) {
				j=b[i];
			}
		}
		System.out.println(j + " is the largest number in the given array.");//1000
		System.out.println(Arrays.toString(b));
		
		// Smallest no.
		for(int i=0; i<=b.length-1; i++) {
			if(b[i]<j) {
				j=b[i];
			}
		}
		System.out.println(j + " is the smallest number in the given array.");//3
		System.out.println(Arrays.toString(b));
		
		System.out.println("=========================");

		    // Adjacent duplicate numbers
		    int[] intArr = {2, 2, 3, 4, 5, 5, 7, 7, 4};
		    ArrayList<Integer> duplicateNoList = new ArrayList<Integer>();
    
		    for(int i=0; i<intArr.length-1; i++){
				if(intArr[i]==intArr[i+1]){
		        	if(!(duplicateNoList.contains(intArr[i]))){
		            	duplicateNoList.add(intArr[i]);
		            }
		        }
		    }
		    System.out.println(duplicateNoList);

		System.out.println("=========================");
		
                    //Unique numbers and remove duplicates using ArrayList
   		    int[] intArrNew = {2, 2, 3, 4, 5, 5, 7, 7, 1};
		    ArrayList<Integer> allNum = new ArrayList<Integer>();
		    ArrayList<Integer> uniqueNum =  new ArrayList<Integer>();
		    for(int i: intArrNew){
		    	allNum.add(i);
		    }
		    System.out.println(allNum);
		    
		    for(int j1: allNum){
		    	if(allNum.indexOf(j1)==allNum.lastIndexOf(j1)){
		        	uniqueNum.add(j1);
		        }
		    }
		    System.out.println(uniqueNum);

		System.out.println("=========================");
		
        //Unique numbers and remove duplicates using HashMap

		int[] intArr1 = {2, 2, 3, 4, 5, 5, 7, 7};		
		HashMap<Integer, Integer> countMap = new HashMap<>();
		ArrayList<Integer> uniqueList = new ArrayList<>();		
		// Count occurrences of each number
		for (int number : intArr1) {
			countMap.put(number, countMap.getOrDefault(number, 0) + 1);
		}		
		// Add only numbers that appear once
		for (int number : intArr1) {
			if (countMap.get(number) == 1) {
				uniqueList.add(number);
			}
		}		
		System.out.println("Unique numbers: " + uniqueList);
      
	}
}
