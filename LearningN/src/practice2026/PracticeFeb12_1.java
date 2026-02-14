package practice2026;

import java.util.Arrays;

public class PracticeFeb12_1 {

	public static void main(String[] args) {
		
		String s = "I like Apple very much.. ";
		
		System.out.println(s);
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(s.length()-1));
		
		String s1 = s.replace(s.charAt(0), s.charAt(s.length()-1));
		System.out.println(s1);
		
		if(!s.equals(s1) && !s.contentEquals(s1)) {
			System.out.println("1st check --> Passed");
			if(s.trim().equals(s.strip()) || s.contains("..")) {
				System.out.println("2nd check --> Passed");
				for(int i=0; i<s.length(); i++) {
					System.out.print(s.charAt(i));
				}
				System.out.println();
				if(s.indexOf(s.charAt(s.length()-1))+1 == (s.length()-1)) {
					System.out.println("3rd check --> Passed");
				}
			}
		}
		
		System.out.println(s.indexOf('.', s.indexOf('.')+1));
		
		String str1 = "Hello";
		String str2 = "world";
		String str3 = "!!!";
		String str4 = "hElLO";
		String str5 = "Hello world!!!";
		String str6 = "";
		String str7 = " ";
		String st = "I like fruits. I like vegetables.";
		String stg = " strip trim ";
		
		str1.charAt(0);// if printed --> H
		/*
		 * char java.lang.String.charAt (int index)
		   Returns the char value at the specified index. An index ranges from 0 to length() - 1. 
		   The first char value of the sequence is at index 0, the next at index 1,and so on, 
		   as for array indexing.
		 * */
		
		str1.concat(" " + str2 + str3);// if printed --> Hello World!!!
		/*
		 * String java.lang.String.concat (String str)
		   Concatenates the specified string to the end of this string. 
		   If the length of the argument string is 0, then this String object is returned. 
		   Otherwise, a String object is returned that represents a character sequence that is 
		   the concatenation of the character sequence represented by this String object and 
		   the character sequence represented by the argument string.
		 * 
		 * */
		
		str1.contains("el");// if printed --> true
		/*
		 * boolean java.lang.String.contains (CharSequence s)
		   Returns true if and only if this string contains the specified sequence of char values
		 * 
		 * */
		
		str1.contentEquals("el");// if printed --> false
		str1.contentEquals("Hello");// if printed --> true
		/*
		 * boolean java.lang.String.contentEquals (CharSequence cs)
		   Compares this string to the specified CharSequence. The result is true if and only if 
		   this String represents the same sequence of char values as the specified sequence. 
		   Note that if the CharSequence is a StringBuffer then the method synchronizes on it. 
		 * 
		 * */
		
		str1.endsWith("o");// if printed --> true
		/*
		 * boolean java.lang.String.endsWith (String suffix)
		   Tests if this string ends with the specified suffix.
		 * 
		 * */
		
		str1.equals(str3);// if printed --> false
		/*
		 * boolean java.lang.String.equals (Object anObject)
		   Compares this string to the specified object. The result is true if and only if the 
		   argument is not null and is a String object that represents the same sequence of 
		   characters as this object. 
		 * 
		 * */
		
		str1.equalsIgnoreCase(str4);// if printed --> true
		/*
		 * boolean java.lang.String.equalsIgnoreCase (String anotherString)
		   Compares this String to another String, ignoring case considerations. 
		   Two strings are considered equal ignoring case if they are of the same length 
		   and corresponding Uni-code code points in the two strings are equal ignoring case.
		 * 
		 * */
		
		char[] c = {'A', '#', '3', 'a', ' '};
		str1.getChars(0, str1.length(), c, 0);
		System.out.println(Arrays.toString(c));// [H, e, l, l, o]
		/*
		 * void java.lang.String.getChars (int srcBegin, int srcEnd, char[] dst, int dstBegin)
		   Copies characters from this string into the destination character array.
		   The first character to be copied is at index srcBegin;the last character to be copied 
		   is at index srcEnd-1(thus the total number of characters to be copied is srcEnd-srcBegin). 
		   The characters are copied into the subarray of dst starting at index dstBeginand 
		   ending at index: dstBegin + (srcEnd-srcBegin) - 1
		 * 
		 * */
		
		str1.toCharArray();
		System.out.println(str1.toCharArray());//Hello
		System.out.println(Arrays.toString(str1.toCharArray()));//[H, e, l, l, o]
		/*
		 * char[] java.lang.String.toCharArray ()
		   Converts this string to a new character array.
		   Returns:a newly allocated character array whose length is the length of this string 
		   and whose contents are initialized to contain the character sequence represented by 
		   this string.
		 * 
		 * */
		
		str1.indexOf(101);//101 --> e --> 1
		System.out.println(str1.indexOf(101));//1
		/*
		 * int java.lang.String.indexOf (int ch)
		   Returns: the index of the first occurrence of the character in the character sequence 
		            represented by this object, or -1 if the character does not occur.
		 * 
		 * */
		
		str5.indexOf(str1);//str1 --> Hello --> H: 0
		System.out.println(str1.indexOf(str1));//0
		/*
		 * int java.lang.String.indexOf (String str)
		   Returns the index within this string of the first occurrence of the specified 
		   substring. 
		 * 
		 * */
		
		s.indexOf(' ', 2);
		/*
		 * int java.lang.String.indexOf (int ch, int fromIndex)
		   Returns the index within this string of the first occurrence of the specified 
		   character, starting the search at the specified index. 
		 
		 * Parameters:ch a character (Unicode code point).fromIndex the index to start the 
		   search from.
		   
		 * Returns:the index of the first occurrence of the character in the 
		   character sequence represented by this object that is greater than or equal to 
		   fromIndex, or -1if the character does not occur.
		 * */
		
		System.out.println(str6.isBlank());//true
		System.out.println(str7.isBlank());//true
		/*
		 * boolean java.lang.String.isBlank ()
		   Returns true if the string is empty or contains only white space code points, 
		   otherwise false.
		 * 
		 * */
		
		System.out.println(str6.isEmpty());//true
		System.out.println(str7.isEmpty());//false
		/*
		 * boolean java.lang.String.isEmpty ()
		   Returns true if, and only if, length() is 0.
 		 *
		 * */
		
		str1.length();
		/*
		 * int java.lang.String.length ()
		   Returns the length of this string.
		   The length is equal to the number of Unicode code units in the string.
 		 *
		 * */
		
		System.out.println(str1.lastIndexOf("l"));//3
		/*
		 * int java.lang.String.lastIndexOf (String str)
		 * Parameters:str the substring to search for.
		 * Returns:the index of the last occurrence of the specified substring, 
		   or -1 if there is no such occurrence.
 		 *
		 * */
		
		System.out.println(st.lastIndexOf("like", st.length()-1));//17
		/*
		 * int java.lang.String.lastIndexOf (String str, int fromIndex)
		 * Parameters: 
		   str --> the substring to search for. 
		   fromIndex --> the index to start the search from.
		 * Returns: the index of the last occurrence of the specified substring, 
		   searching backward from the specified index, or -1 if there is no such occurrence.
 		 *
		 * */
		
		stg.strip();
		/*
		 * String java.lang.String.strip ()
		   Returns a string whose value is this string, with all leading and trailing 
		   white space removed.
 		 *
		 * */
		
		stg.stripLeading();
		/*
		 * String java.lang.String.stripLeading ()
		   Returns a string whose value is this string, with all leading white space removed.
 		 *
		 * */
		
		stg.stripTrailing();
		/*
		 * String java.lang.String.stripTrailing ()
		   Returns a string whose value is this string, with all trailing white space removed. 
 		 *
		 * */
		
		stg.trim();
		/*
		 * String java.lang.String.trim ()
		   Returns a string whose value is this string, with all leading and trailing space 
		   removed, or this string if it has no leading or trailing space. 
 		 *
		 * */
		
		str5.repeat(5);
		/*
		 * String java.lang.String.repeat (int count)
		   Returns a string whose value is the concatenation of this string repeated count times. 
		   If this string is empty or count is zero then the empty string is returned.
 		 *
		 * */
		
		str5.replace("Hello", "world");
		/*
		 * String java.lang.String.replace (CharSequence target, CharSequence replacement)
		   Replaces each substring of this string that matches the literal target sequence 
		   with the specified literal replacement sequence. There placement proceeds from 
		   the beginning of the string to the end, for example, replacing "aa" with "b" in 
		   the string "aaa" will result in"ba" rather than "ab".
 		 *
		 * */
		
		str5.replaceAll(" ", "");
		/*
		 * String java.lang.String.replaceAll (String regex, String replacement)
		   Replaces each substring of this string that matches the given regular expression 
		   with the given replacement. 
 		 *
		 * */
		
		s.replaceFirst(" ", "");
		/*
		 * String java.lang.String.replaceFirst (String regex, String replacement)
		   Replaces each substring of this string that matches the given regular expression 
		   with the given replacement. 
 		 *
		 * */
		
		//One of the very important methods
		System.out.println(Arrays.toString(st.split(" ")));
		//[I, like, fruits., I, like, vegetables.]		
		System.out.println(Arrays.toString(str1.split("")));//[H, e, l, l, o]
		System.out.println(Arrays.toString(str1.toCharArray()));//[H, e, l, l, o]
		/*
		 * String[] java.lang.String.split (String regex)
		   Splits this string around matches of the given regular expression.
 		 *
		 * */
		
		System.out.println(Arrays.toString(str1.split("", 0)));//[H, e, l, l, o]
		System.out.println(Arrays.toString(str1.split("", 1)));//[Hello]
		System.out.println(Arrays.toString(str1.split("", 2)));//[H, ello]
		System.out.println(Arrays.toString(str1.split("", 3)));//[H, e, llo]
		System.out.println(Arrays.toString(st.split(" ", 4)));
		//[I, like, fruits., I like vegetables.]
		/*
		 * String[] java.lang.String.split (String regex, int limit)
		   Splits this string around matches of the given regular expression.
 		 *
		 * */
		
		System.out.println(str1.startsWith("H"));//true
		/*
		 * boolean java.lang.String.startsWith (String prefix)
		   Tests if this string starts with the specified prefix.
 		 *
		 * */
		
		System.out.println(str1.subSequence(0, 4));//Hell
		//Hello --> (0, 4-1) ==> (0, 3) --> 0th: H; 3rd: l;
		/*
		 * CharSequence java.lang.String.subSequence (int beginIndex, int endIndex)
		   Returns a character sequence that is a subsequence of this sequence.
 		 *
		 * */
		
		System.out.println(str1.substring(0));//Hello
		System.out.println(str1.substring(1));//ello
		/*
		 * String java.lang.String.substring (int beginIndex)
		   Returns a string that is a substring of this string. The substring begins with 
		   the character at the specified index and extends to the end of this string. 
 		 *
		 * */
		
		System.out.println(str1.substring(0, 0));//
		System.out.println(str1.substring(1, 1));//
		//System.out.println(str1.substring(1, 0));
		//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: 
		//Range [1, 0) out of bounds for length 5
		System.out.println(str1.substring(1, 2));//e
		// (1, 2) ==> (1, 2-1) ==> (1,1) ==> only one
		System.out.println(str1.substring(1, 3));//el
		System.out.println(str1.substring(0, str1.length()));//Hello
		/*
		 * String java.lang.String.substring (int beginIndex, int endIndex)
		   Returns a string that is a substring of this string. The substring begins at the 
		   specified beginIndex and extends to the character at index endIndex - 1. 
		   Thus the length of the substring is endIndex-beginIndex. 
 		 *
		 * */
		
		str1.toLowerCase();//hello
		
		str1.toUpperCase();//HELLO
		
		String str1_1 = String.join(" | ", str1);
		System.out.println(str1_1);//Hello
		
		String str5_1 = String.join(" | ", str5);
		System.out.println(str5_1);//Hello world!!!
		
		String[] strArr = {"Sachin", "Kalpana", "Prince", "Sachi"}; 
		System.out.println(String.join(" | ", strArr));//Sachin | Kalpana | Prince | Sachi
		
		String[] str5_2 = str5.split(" ");
		System.out.println(Arrays.toString(str5_2));//[Hello, world!!!]
		System.out.println(String.join(" | ", str5_2));//Hello | world!!!
		System.out.println(String.join("", str5_2));//Helloworld!!!
		System.out.println(String.join(" ", str5_2));//Hello world!!!
		
		
	}

}
