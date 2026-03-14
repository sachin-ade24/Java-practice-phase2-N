package java_data_structures;

import java.util.ArrayList;

public class Program_ReverseTheWordsInTheGivenString {

	public static void main(String[] args) {
		
		//1.
		String s1 = "Sachi Prince Kalpana Sachin";
		
		String[] strArr1 = s1.split(" ");
		
		for(int i=0; i<strArr1.length; i++) {
			if(i!=0) {
				System.out.print(" ");
			}
			for(int j=strArr1[i].length()-1; j>=0; j--) {
				System.out.print(strArr1[i].charAt(j));
				//if(j==0 && i!=strArr1.length-1) {
				//	System.out.print(" ");
				//}
			}
		}
		
		System.out.println();
		
		
		//2.
		String s2 = "Sachi Prince Kalpana Sachin";
		String[] strArr2 = s2.split(" ");
		
		for(int i=0; i<strArr2.length; i++) {
			StringBuilder sb1 = new StringBuilder(strArr2[i]);
			sb1.reverse();
			if(i!=strArr2.length-1) {
				sb1.append(" ");
			}
			System.out.print(sb1);
		}
		
		System.out.println();
		
		
		//3.
		String s4 = "Sachi Prince Kalpana Sachin";
		String[] strArr3 = s4.split(" ");
		ArrayList<String> strArrLst1 = new ArrayList<>();
		for(String s: strArr3) {
			strArrLst1.add(s);
		}
		System.out.println(strArrLst1);
		for(int i=0; i<strArrLst1.size(); i++) {
			for(int j=strArrLst1.get(i).length()-1; j>=0; j--) {
				System.out.print(strArrLst1.get(i).charAt(j));
				if(j==0 && i!=strArrLst1.size()-1) {
					System.out.print(" ");
				}
			}
		}

		System.out.println();
		
		
		//4.
		String s3 = "Sachi Prince Kalpana Sachin";
		int countSpaces = 0;
		
		for(int i=0; i<s3.length(); i++) {
			if(s3.charAt(i)==' ') {
				countSpaces++;
			}
		}
		System.out.println(countSpaces);//3
		
		int i1 = s3.indexOf(" ");
		int i2 = s3.indexOf(" ", i1+1);
		int i3 = s3.indexOf(" ", i2+1);
		
		String str1 = s3.substring(0, i1);
		String str2 = s3.substring(i1+1, i2);
		String str3 = s3.substring(i2+1, i3);
		String str4 = s3.substring(i3+1, s3.length());
		
		//StringBuilder sb1 = new StringBuilder(str1);
		//String f1 = sb1.reverse().toString();
		for(int j=str1.length()-1; j>=0; j--) {
			System.out.print(str1.charAt(j));
		}
		
		System.out.print(" ");
		
		//StringBuilder sb2 = new StringBuilder(str2);
		//String f2 = sb2.reverse().toString();
		for(int j=str2.length()-1; j>=0; j--) {
			System.out.print(str2.charAt(j));
		}
		
		System.out.print(" ");
		
		//StringBuilder sb3 = new StringBuilder(str3);
		//String f3 = sb3.reverse().toString();
		for(int j=str3.length()-1; j>=0; j--) {
			System.out.print(str3.charAt(j));
		}
		
		System.out.print(" ");
		
		//StringBuilder sb4 = new StringBuilder(str4);
		//String f4 = sb4.reverse().toString();
		for(int j=str4.length()-1; j>=0; j--) {
			System.out.print(str4.charAt(j));
		}
		
		//System.out.println(f1 + " " + f2 + " " + f3 + " " + f4);
		
		
		System.out.println();
	}

}
