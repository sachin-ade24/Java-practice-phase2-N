package java_strings;

import java.util.Arrays;

public class JavaString_Basics_Methods {

	public static void main(String[] args) {
		
		/*
		 Java Strings: Strings are used for storing text. 
		 A String variable contains a collection of characters surrounded by double quotes ("").
		 * */
		
		String greeting = "Hello";
		System.out.println(greeting);
		
		
		String s1 = "Sachin Ade";
		
		/*
		 charAt(int index): The charAt() method returns the character at the specified index 
		 in a string.
		 
		 char java.lang.String.charAt (int index):
		 Returns the char value at the specified index. An index ranges from 0 to length() - 1. 
		 The first char value of the sequence is at index 0, the next at index 1,and so on, as 
		 for array indexing. 
		 * */
		char c1 = s1.charAt(0);
		System.out.println(c1);//S
		
		
		/*
		 String java.lang.String.concat (String str):
		 Concatenates the specified string to the end of this string.
		 
		 The concat() method appends (concatenate) a string to the end of another string.
		 * */
		String s2 = "Sachi Ade";
		String s3 = s2.concat(", " + s1);
		System.out.println(s3);
		
		
		/*
		 boolean java.lang.String.contains (CharSequence s)
		 Returns true if and only if this string contains the specified sequence of char values.

		 The contains() method checks whether a string contains a sequence of characters.
		 Returns true if the characters exist and false if not.
		 * */
		String s4 = "Prince Ade";
		boolean b1 = s4.contains("P");
		System.out.println(b1);//true
		boolean b2 = s4.contains("in");
		System.out.println(b2);//true
		System.out.println(s4.contains("e"));//true
		System.out.println(s4.contains(s4));//true
		
		
		/*
		 The contentEquals() method searches a string to find out if it contains the exact 
		 same sequence of characters in the specified string or StringBuffer.
		 Returns true if the characters exist and false if not.
		 
		 boolean java.lang.String.contentEquals (CharSequence cs):
		 Compares this string to the specified CharSequence. The result is true if and only 
		 if this String represents the same sequence of char values as the specified sequence. 
		 Note that if the CharSequence is a StringBuffer then the method synchronizes on it.
		 
		 Returns true if this String represents the same sequence of char values as the 
		 specified sequence, false otherwise.
		 * */
		String s5 = "Kalpana Rathod";
		System.out.println(s5.contentEquals("pan"));//false
		System.out.println(s5.contentEquals("Kalpana Rathod"));//true
		
		
		/*
		 copyValueOf, valueOf
		 
		 String java.lang.String.valueOf (char[] data):
		 Returns the string representation of the char array argument. The contents of the 
		 character array are copied; subsequent modification of the character array does not 
		 affect the returned string.

		 * */
		char[] charArr = {'H', 'e', 'l', 'l', 'o'};
		String s6 = "";
		s6 = String.valueOf(charArr, 0, charArr.length);
		System.out.println(s6);//Hello
		
		String s7 = "";
		s7 = String.copyValueOf(charArr);
		System.out.println(s7);//Hello
		
		String s8 = "";
		s8 =String.copyValueOf(charArr, 1, 3);
		System.out.println(s8);//ell
		
		String s9 = "";
		s9 = String.valueOf(charArr);
		System.out.println(s9);
		
		
		/*
		 endsWith(): The endsWith() method checks whether a string ends with the specified 
		 character(s).
		 
		 Tip: Use the startsWith() method to check whether a string starts with the specified 
		 character(s).
		 * */
		String s10 = "Computer Engineering";
		System.out.println(s10.endsWith("g"));//true
		System.out.println(s10.endsWith("Engineering"));//true
		System.out.println(s10.endsWith(s10));//true
		
		
		/*
		 boolean java.lang.String.equals (Object anObject):
		 Compares this string to the specified object. The result is true if and only if the 
		 argument is not null and is a String object that represents the same sequence of 
		 characters as this object.
		 
		 The equals() method compares two strings, and returns true if the strings are equal, 
		 and false if not.
		 * */
		String s11_1 = "YouTube";
		String s11_2 = "YouTube";
		String s11_3 = "UTube";
		System.out.println(s11_1.equals(s11_2));//true
		System.out.println(s11_1.equals(s11_3));//false
		
		
		/*
		 The equalsIgnoreCase() method compares two strings, ignoring lower case and upper 
		 case differences.
		 This method returns true if the strings are equal, and false if not.
		 * */
		String s11 = "youtube";
		System.out.println(s11.equalsIgnoreCase(s11_1));//true
		
		
		/*
		 void java.lang.String.getChars (int srcBegin, int srcEnd, char[] dst, int dstBegin):
		 Copies characters from this string into the destination character array.
		 
		 The getChars() method copies characters from a string to a char array.
		 * */
		char[] c3 = {'1', '2', '3', '4', '5'};
		String s12 = "Sachi Sachin";
		s12.getChars(0, 5, c3, 0);
		System.out.println(Arrays.toString(c3));
		
		
		/*
		 indexOf():
		 int java.lang.String.indexOf (String str):
		 Returns the index within this string of the first occurrence of the specified 
		 substring.
		 * */
		String s13 = "Prince Kalpana";
		int i1 = s13.indexOf("Prince");
		System.out.println(i1);//0
		System.out.println(s13.indexOf("P"));//0
		System.out.println(s13.indexOf('P'));//0
		System.out.println(s13.indexOf('p'));//10
		System.out.println(s13.indexOf("p"));//10
		
		
		/*
		 boolean java.lang.String.isEmpty (): 
		 Returns true if, and only if, length() is 0.
		 
		 boolean java.lang.String.isBlank (): 
		 Returns true if the string is empty or contains only white space code points, 
		 otherwise false.
		 * */
		String s14 = "Java Language";
		System.out.println(s14.isBlank());//false
		System.out.println(s14.isEmpty());//false
		String s15 = "";
		System.out.println(s15.isEmpty());//true
		System.out.println(s15.isBlank());//true
		String s16 = " ";
		System.out.println(s16.isEmpty());//false
		System.out.println(s16.isBlank());//true
		
		
		/*
		 String java.lang.String.join (CharSequence delimiter, CharSequence... elements):
		 Returns a new String composed of copies of the CharSequence elements joined together 
		 with a copy of the specified delimiter.
		 
		 The join() method joins one or more strings with a specified separator.
		 * */
		String s17_1 = "Science";
		String s17_2 = "Engineering";
		
		String s17_3 = String.join(" and ", s17_1, s17_2);
		System.out.println(s17_3);//Science and Engineering
		
		String mySkill1 = "UI Automation";
		String mySkill2 = "Selenium";
		String mySkill3 = "Cypress";
		String mySkill4 = "Playwright";
		String mySkill5 = "Java";
		String mySkill6 = "JavaScript";
		String mySkills = String.join(" | ", mySkill1, mySkill2, mySkill3, mySkill4, mySkill5, mySkill6);
		System.out.println(mySkills);
		//UI Automation | Selenium | Cypress | Playwright | Java | JavaScript
		
		
		/*
		 int java.lang.String.lastIndexOf (int ch):
		 Returns the index of the last occurrence of the character in the character sequence 
		 represented by this object, or -1 if the character does not occur.
		 
		 The lastIndexOf() method returns the position of the last occurrence of specified 
		 character(s) in a string.
		 Tip: Use the indexOf method to return the position of the first occurrence of 
		 specified character(s) in a string.
		 * */
		String s18 = "Prince Kalpana Sachin Ade";
		System.out.println(s18.indexOf('e'));//5
		System.out.println(s18.lastIndexOf('e'));//24
		
		
		/*
		 int java.lang.String.length ():
		 Returns the length of this string.The length is equal to the number of Uni-code code 
		 units in the string.
		 
		 The length() method returns the length of a specified string.
		 Note: The length of an empty string is 0.
		 * */
		String s19 = "Nineteen";
		System.out.println(s19.length());//8
		
		
		/*
		 boolean java.lang.String.matches (String regex):
		 Returns true if, and only if, this string matches the given regular expression.
		 
		 The matches() method searches a string for a match against a regular expression, 
		 and returns the matches.
		 * */
		String s20 = "cat|dog|fish";
		System.out.println("cat".matches(s20));//true
		System.out.println(s20.matches("|"));//false
		System.out.println("|".matches(s20));//false
		System.out.println("fish".matches(s20));//true
		String s20_1 = "[A-Za-z]+";
		System.out.println("Sachin".matches(s20_1));//true
		String s20_2 = "[A-Za-z |]+";
		System.out.println("Sa|ch| ".matches(s20_2));//true
		System.out.println(" | Sa|ch| ".matches(s20_2));//true
		String s20_3 = "[A-Za-z0-9.@| ]+";
		System.out.println("| 123abc@G1.com |".matches(s20_3));//true
		
		
		/*
		 String java.lang.String.replace (CharSequence target, CharSequence replacement): 
		 Replaces each substring of this string that matches the literal target sequence with 
		 the specified literal replacement sequence. There placement proceeds from the 
		 beginning of the string to the end, for example, replacing "aa" with "b" in the string 
		 "aaa" will result in"ba" rather than "ab".
		 
		 The replace() method searches a string for a specified character, and returns a new 
		 string where the specified character(s) are replaced.
		 * */
		String s21 = "Sac h i n";
		String s21_1 = s21.replace(" ", "");
		System.out.println(s21_1);//Sachin
		
		
		/*
		 String java.lang.String.replaceAll (String regex, String replacement):
		 Replaces each substring of this string that matches the given regular expression with 
		 the given replacement.

		 The replaceAll() method replaces all the matches of a regular expression in a string 
		 with a new substring.
		 * */
		String s22 = "I love Java.";
		String regexPat1 = "[ ]";
		String s22_1 = s22.replaceAll(regexPat1, "_");
		System.out.println(s22_1);//I_love_Java.
		String s22_2 = "sachin.ade_123@smail.com";
		String regexPat2 = "[A-Za-z0-9.@_]+";
		String s22_3 = s22_2.replaceAll(regexPat2, "I don't know.");
		System.out.println(s22_3);//I don't know.
		
		
		/*
		 String java.lang.String.replaceFirst (String regex, String replacement):
		 Replaces the first substring of this string that matches the given regular expression 
		 with the given replacement. 
		 
		 The replaceFirst() method replaces the first match of a regular expression in 
		 a string with a new substring.
		 * */
		String s23 = "S@ccessf@l people";
		String s23_1 = s23.replaceFirst("[@]", "u");
		System.out.println(s23_1);//Successf@l people
		System.out.println(s23.replaceAll("[@]", "u"));//Successful people
		
		
		/*
		 String[] java.lang.String.split (String regex):
		 The split() method splits a string into an array of substrings using a regular 
		 expression as the separator.
		 * */
		String s24 = "Mango Apple";
		String[] s24_1 = s24.split("[ ]");
		System.out.println(Arrays.toString(s24_1));//[Mango, Apple]
		String[] s24_2 = s24.split("");
		System.out.println(Arrays.toString(s24_2));//[M, a, n, g, o,  , A, p, p, l, e]
		
		
		/*
		 boolean java.lang.String.startsWith (String prefix):
		 Tests if this string starts with the specified prefix.

		 The startsWith() method checks whether a string starts with the specified character(s).
		 Tip: Use the endsWith() method to check whether a string ends with the specified character(s).
		 * */
		String s25 = "Bus Rail";
		System.out.println(s25.startsWith("B"));//true
		System.out.println(s25.startsWith("Bus"));//true
		
		
		/*
		 CharSequence java.lang.String.subSequence (int beginIndex, int endIndex):
		 Returns a character sequence that is a subsequence of this sequence. 

		 The subSequence() method returns a subsequence from the string as a CharSequence 
		 object.
		 * */
		String s26 = "abcdefgh";
		CharSequence s26_1 = s26.subSequence(0, 4);//(0, 4) --> (0, 4-1)
		System.out.println(s26_1);//abcd
		
		
		/*
		 String java.lang.String.substring (int beginIndex):
		 Returns a string that is a substring of this string. The substring begins with the 
		 character at the specified index and extends to the end of this string. 

		 The substring() method returns a substring from the string.
		 * */
		String s27 = "Electronics and Telecommunication";
		String s27_1 = s27.substring(0);
		System.out.println(s27_1);//Electronics and Telecommunication
		System.out.println(s27.substring(4));//tronics and Telecommunication
		System.out.println(s27.substring(4, 9));//troni --> (4, 9-1) --> (4, 8)
		
		
		/*
		 char[] java.lang.String.toCharArray ()
		 Converts this string to a new character array.
		 Returns:a newly allocated character array whose length is the length of this string 
		 and whose contents are initialized to containthe character sequence represented by 
		 this string.
		 
		 The toCharArray() method returns a new char array representing the contents of the 
		 string.
		 * */
		String s28 = "Information Technology";
		char[] c4 = s28.toCharArray();
		System.out.println(Arrays.toString(c4));
		//[I, n, f, o, r, m, a, t, i, o, n,  , T, e, c, h, n, o, l, o, g, y]
		
		
		/*
		 String java.lang.String.toLowerCase ():
		 Converts all of the characters in this String to lower case using the rules of the 
		 default locale. This method is equivalent to toLowerCase(Locale.getDefault()). 
		 Returns:the String, converted to lower case.
		 
		 The toLowerCase() method converts a string to lower case letters.
		 Note: The toUpperCase() method converts a string to upper case letters.
		 * */
		String s29 = "Indian Cricket Team";
		String s29_1 = s29.toLowerCase();
		System.out.println(s29_1);
		
		
		/*
		 String java.lang.String.toString (): 
		 This object (which is already a string!) is itself returned.
		 Returns: the string itself.
		 
		 The toString() method returns the string itself.
		 This method may seem redundant, but its purpose is to allow code that is treating 
		 the string as a more generalized object to know its string value without casting it 
		 to String type.
		 * */
		String s30 ="Java Strings";
		System.out.println(s30);//Java Strings
		System.out.println(s30.toString());//Java Strings
		
		
		/*
		 String java.lang.String.toUpperCase (): 
		 Converts all of the characters in this String to upper case using the rules of the 
		 default locale. This method is equivalent to toUpperCase(Locale.getDefault()).
		 Returns: the String, converted to upper case.
		 
		 The toUpperCase() method converts a string to upper case letters. 
		 Note: The toLowerCase() method converts a string to lower case letters.
		 * */
		String s31 = "JavaScript Cypress";
		String s31_1 = s31.toUpperCase();
		System.out.println(s31_1);//JAVASCRIPT CYPRESS
		
		
		/*
		 String java.lang.String.trim (): 
		 Returns a string whose value is this string, with all leading and trailing space 
		 removed, where space is definedas any character whose code point is less than or 
		 equal to 'U+0020' (the space character). 

		 The trim() method removes whitespace from both ends of a string.
		 * */
		String s32 = " S a c hin ";
		String s32_1 = s32.trim();
		System.out.println(s32_1);//S a c hin
		
		
		/*
		 String java.lang.String.strip (): 
		 Returns a string whose value is this string, with all leading and trailing white 
		 space removed.
		 * */
		String s32_2 = s32.strip();
		System.out.println(s32_2);//S a c hin
		
		String s32_3 = s32.stripLeading();
		System.out.println(s32_3);//S a c hin 
		
		String s32_4 = s32.stripTrailing();
		System.out.println(s32_4);// S a c hin
		
		
		/*
		 String java.lang.String.valueOf (char[] data): 
		 Returns the string representation of the char array argument. The contents of the 
		 character array are copied; subsequent modification of the character array does not 
		 affect the returned string.
		 
		 The valueOf() method returns the string representation of the specified value.
		 * */
		char[] c5 = {'J', 'a', 'v', 'a', ' ', 'S', 'e', 'l', 'e', 'n', 'i', 'u', 'm'};
		String s33 = String.valueOf(c5);
		System.out.println(s33);//Java Selenium
		
	}

}
