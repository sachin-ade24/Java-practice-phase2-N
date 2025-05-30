package StringConcept;

import java.util.regex.Pattern;

public class StringInterviewPractice {

	public static void main(String[] args) {
		
//		String s1 = "aab ccp ddee mnmn abcpdemn";
		
//		for(int i=0; i<s1.length(); i++) {
//			
//			//char ch = s1.charAt(i);
//			
//			int count = 0;
//			boolean alreadyCounted = false;
//			
//			for(int j=0; j<i; j++) {
//				if(s1.charAt(j)==s1.charAt(i)) {
//					alreadyCounted = true;
//				}
//			}
//			
//			if(alreadyCounted) {
//				continue;
//			}
//			
//			for(int j=0; j<s1.length(); j++) {
//				if(s1.charAt(j)==s1.charAt(i)) {
//					count++;
//				}
//			}
//			
//			System.out.println(s1.charAt(i) + ": " + count);
//		}
//
		
//		String s2 = "Apple";
//		String s3 = "Apple";
//		String s4 = "apple juice";
//		String s5 = "apple";
//		String s6 = "  Welc ome   ";
//		
//		System.out.println(s2.length());
//		System.out.println(s2.charAt(s2.length()-1));
//		
//		System.out.println(s2.lastIndexOf('p'));
//		System.out.println(s2.contains("ppl"));
//		
//		System.out.println(s2.startsWith("A"));
//		System.out.println(s2.startsWith("App"));
//		System.out.println(s2.endsWith("e"));
//		
//		System.out.println(s2.equals(s3));
//		System.out.println(s2.equalsIgnoreCase(s5));
//		
//		System.out.println("".isBlank());//true
//		System.out.println(" ".isBlank());//true
//		System.out.println("".isEmpty());//true
//		System.out.println(" ".isEmpty());//false
//		
//		System.out.println(s2.indexOf("e"));
//		System.out.println(s2.indexOf('p', s2.indexOf('p')+1));
//		
//		System.out.println(s6.trim());//Welc ome
//		System.out.println(s6.strip());//Welc ome
//		System.out.println(s6.stripLeading());//Welc ome   
//		System.out.println(s6.stripTrailing());//  Welc ome
//		
//		System.out.println(s2.substring(2));
//		System.out.println(s2.substring(2, 5));
//		
//		//reverse a string
//		String str = "My name is Sachin.";
//		for(int i=str.length()-1; i>=0; i--) {
//			System.out.print(str.charAt(i));
//		}
//		
//		System.out.println();
//		
//		StringBuffer sb = new StringBuffer(str);
//		System.out.println(sb);
//		System.out.println(sb.reverse());
		
		//substring, append
//		//System.out.println(sb.substring(3));
//		System.out.println(sb.append(sb));

		
		//Array simple program
//		char[] arr1 = {'a', 'b', 'c', 'd'};
//		
//		for(int i=0; i<arr1.length; i++) {
//			System.out.print(arr1[i]);
//		}
		
//		System.out.println();
//		
//		String str1 = "My name is Sachin.";
//		String[] word = str1.split(" ");
//		
//		StringBuilder reversed = new StringBuilder();
//		
//		System.out.println(reversed);//empty
//		
//		for(int i=word.length-1; i>=0; i--) {
//			reversed.append(word[i]);
//			if(i!=0) {
//				reversed.append(" ");
//			}
//		}
//		System.out.println(reversed.toString());
		
		
		//Reverse a String with a single word
//		String str1 = "Sachin";
//		String[] str1Arr = str1.split("");
//		
//		StringBuilder reverse = new StringBuilder();
//		for(int i=str1Arr.length-1; i>=0; i--) {
//			reverse.append(str1Arr[i]);
//		}
//		System.out.println(reverse.toString());
		
		
		String strg = "..geeks..for.geeks.";
		System.out.println(strg.replaceAll("^\\.+|\\.$", ""));
//		String[] newArr = strg.split("\\.");
//		StringBuilder revStrg = new StringBuilder();
//		for(int i=newArr.length-1; i>=0; i--) {
//			revStrg.append(newArr[i]);
//			if(i!=0) {
//			revStrg.append(".");
//			}
//		}
//		System.out.println(revStrg.toString());
//		String newString1 = revStrg.toString();
//		String newString2 = newString1.replaceAll("\\.+", ".");
//		System.out.println(newString2.replaceAll("\\.$", ""));
		
		//regex pattern
		String email = "test@example.com";
		System.out.println(Pattern.matches("[a-z]+@[a-z]+\\.[a-z]+", email));
	}

}
