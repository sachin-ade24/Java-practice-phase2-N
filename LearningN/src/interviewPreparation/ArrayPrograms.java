package interviewPreparation;

import java.util.ArrayList;

public class ArrayPrograms {

	public static void main(String[] args) {
		
		//Find number of vowels in the given string -- Wipro interview question
		
		//Approach2
		char[] arr = {'A', 'E', 'I', 'O', 'U'};
		String str = "SACHIN BABURAO ADE";
		int counter = 0;
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<arr.length; j++) {
				if(str.charAt(i)==arr[j]) {
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
