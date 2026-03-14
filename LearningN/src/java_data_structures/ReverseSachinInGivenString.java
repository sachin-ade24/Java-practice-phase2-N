package java_data_structures;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseSachinInGivenString {

	public static void main(String[] args) {
		
		//1.
		String s1 = "Ade Sachin Baburao";
		
		String[] strArr = s1.split(" ");
		
		for(int i=0; i<strArr.length; i++) {
			for(int j=strArr[i].length()-1; j>=0; j--) {
				if(strArr[i].equals("Sachin")) {
					System.out.print(strArr[i].charAt(j));
				}
			}
		}
		
		System.out.println();
		
		//2.
		String s2 = "Ade Sachin Baburao";
		String[] stAr1 = s2.split(" ");
		String myName = "";
		for(int i=0; i<stAr1.length; i++) {
			if(stAr1[i].equals("Sachin")) {
				myName = stAr1[i];
			}
		}
		for(int j=myName.length()-1; j>=0; j--) {
			System.out.print(myName.charAt(j));
		}
		
		System.out.println();
		
		//3.
		String s4 = "Ade Sachin Baburao";
		String[] stAr4 = s4.split(" ");
		String myNm = "";
		for(int i=0; i<stAr4.length; i++) {
			if(stAr4[i].equals("Sachin")) {
				myNm = stAr4[i];
			}
		}
		String[] stAr5 = myNm.split("");
		for(int j=stAr5.length-1; j>=0; j--) {
			System.out.print(stAr5[j]);
		}
		
		System.out.println();
		
		//4.
		String s3 = "Ade Sachin Baburao";
		String[] stAr2 = s3.split(" ");
		String myNme = "";
		for(int i=0; i<stAr2.length; i++) {
			if(stAr2[i].equals("Sachin")) {
				myNme = stAr2[i];
			}
		}
		String[] stAr3 = myNme.split("");
		ArrayList<String> arrLst = new ArrayList<>();
		for(int j=0; j<stAr3.length; j++) {
			arrLst.add(stAr3[j]);
		}
		Collections.reverse(arrLst);
		for(int k=0; k<arrLst.size(); k++) {
			System.out.print(arrLst.get(k));
		}
		
	}

}
