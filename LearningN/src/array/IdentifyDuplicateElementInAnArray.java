package array;

import java.util.ArrayList;

public class IdentifyDuplicateElementInAnArray {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 5, 3, 4, 5, 4, 5, 0, 100, 100, 100, 100};
		int count;
		ArrayList<Integer> al =  new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			count=0;
			for(int j=0; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>=2 && !al.contains(arr[i])) {
				al.add(arr[i]);
				System.out.println(arr[i] + " occurred " + count + " times.");
				if(arr[i]==arr[i+1]) {
					System.out.println(arr[i] + " is a adjacent duplicate number.");
				}
			}
		}
		/*
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i) + " is a duplicate number.");
		}
		*/
		for(int n: al) {
			System.out.println(n + " is a duplicate number.");
		}
		
		
		//================================================================================
		
		String[] strArr = {"Sachin", "Kalpana", "Prince", "Sachi", "Sachi", "Prince", "Prince"};
		int counter;
		ArrayList<String> strArrLst = new ArrayList<>();
		for(String st:  strArr) {
			strArrLst.add(st);
		}
		System.out.println(strArrLst);
		//[Sachin, Kalpana, Prince, Sachi, Sachi, Prince]
		ArrayList<String> newStrArrLst = new ArrayList<>();
		for(int j=0; j<strArrLst.size(); j++) {
			counter=0;
			for(int k=0; k<strArrLst.size(); k++) {
				if(strArrLst.get(j)==strArrLst.get(k)) {
					counter++;
				}
			}
			if(counter>=2 && !newStrArrLst.contains(strArrLst.get(j))) {
				newStrArrLst.add(strArrLst.get(j));
				System.out.println(strArrLst.get(j) + " occurred " + counter + " times.");
				if(strArrLst.get(j)==strArrLst.get(j+1)) {
					System.out.println(strArrLst.get(j) + " is a adjacent duplicate String.");
				}
			} else if(counter>=2 && strArrLst.get(j)==strArrLst.get(j+1)) {
				System.out.println(strArrLst.get(j) + " is a adjacent duplicate String.");
				break;
			}
		}
		for(String s: newStrArrLst) {
			System.out.println(s + " is a duplicate String.");
		}
		
	}
}
