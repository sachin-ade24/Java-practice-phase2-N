//Java_24_1

package StringConcept;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		
		// String should be written in double quotes
		// String comparison ==> use '.equals(expectedOrActualString)' 
		
		String str = "Hi, this is my Java code and I am so happy.";
		String newStr = "Hi";
		
		// String is the Array of all characters
		// Internally behaves like Array
		
		// So, here index of 'H' is 0, index of 'i' is 1, 
		// index of ',' is 2, index of ' ' is 3 and so on..
		
		// How to calculate the the no. of character present in a String 
		// i.e. the length of String
		
		System.out.println(str.length());//43
		
		System.out.println(str.charAt(0));//H
		System.out.println(str.charAt(2));//,
		System.out.println(str.charAt(3));// 
		System.out.println(str.charAt(str.length()-1));//.
		// System.out.println(str.charAt(str.length()));// Run-time Exception
		// Exception: StringIndexOutOfBoundsException ==> SIOB
		// System.out.println(str.charAt(-1));// Run-time Exception
		// Exception: StringIndexOutOfBoundsException ==> SIOB
		
		
		
		//==========================================================================================
		// Not from Naveen sir's videos
		System.out.println(str.codePointAt(16));//97
		// at index 16 ==> 'a' is present. It will give you ASCII value of 'a' i.e. 97
		System.out.println(str.codePointAt(0));//72
		System.out.println(str.codePointBefore(1));//72
		// It will go to 1st index and then to index before 1st i.e 0th index and
		// It will give you ASCII value of 'H' i.e. 72
		System.out.println(str.codePointBefore(str.length()));//46
		System.out.println(str.codePointCount(0, 2));//2 ==> will count from 0 to 1
		// It returns no. of characters between (startIndex, endIndex-1)
		System.out.println(str.codePointCount(0, str.length()));//43
		
		if(str.codePointCount(0, str.length()) == str.length()) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}//true
		
		System.out.println(newStr.codePointAt(1));//105
		System.out.println(newStr.hashCode());//2337
		// 72*31^(2-1) + 105*31^(2-2) + s(2-1) = 72*31 + 105 = 2337
		// Returns a hash code for this string. 
		// The hash code for a String object is computed as 
		// s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
		// using int arithmetic, where s[i] is the ith character of the string, 
		// n is the length of the string, 
		// and ^ indicates exponentiation.
		// (The hash value of the empty string is zero.)
		System.out.println(str.compareTo(newStr));
		
		// Lexicographical Comparison of two strings
		// I am going to reverse the newStr first
		StringBuilder sb = new StringBuilder(newStr);
		System.out.println(newStr);
		System.out.println(sb);//Hi
		// sb.replace(0, 2, "ty");
		// System.out.println(sb);//ty
		// The replace() method of the StringBuilder class allows you to replace 
		// a portion of the StringBuilder content with a specified string. 
		// The method modifies the original StringBuilder object.
		System.out.println(sb.reverse());//iH
		// System.out.println(sb.reverse().toString());//iH
		System.out.println(sb);//iH
		System.out.println(newStr);//Hi
		
		//System.out.println(str.toCharArray());
		char[] ch = str.toCharArray();
		// toCharArray(): Converts this string to a new character array.
		// a newly allocated character array whose length is the length of 
		// this string and whose contents are initialized to contain 
		// the character sequence represented by this string.
		System.out.println(ch);
		System.out.println(Arrays.toString(ch));
		
		//==========================================================================================
		
		// 1. Reverse the string using for loop
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		// Reverse the string using for each loop
	    int count = str.length()-1;
		for(char s : str.toCharArray()) {
			s=str.charAt(count);
			System.out.print(s);
			count--;
		}
		
		System.out.println();
		System.out.println("===============================================================================");
		System.out.println();
		
		// 2. for loop for returning a specific character (occurrence of char) index 
		int countChar=0;
		for(int j=0; j<=str.length()-1; j++) {
			if(str.charAt(j)=='a') {
				countChar++;
				System.out.println(j);
			}
		}
		System.out.println("The no. of chars: " + countChar);
		System.out.println("===============================================================================");
		
		// 3. for each loop for returning a specific character (occurrence of char) index
		// Hi, this is my Java code and I am so happy.
		// 3.1 With int data type
		countChar = 0;
		int countSpecificChar = 0;
		for(int k : str.toCharArray()) {
			do {
				k=countChar;
				if(k<=str.length()-1) {
					if(str.charAt(k)=='m' ) {
						System.out.println(k);
						countSpecificChar++;
					}
					countChar++;
				}
			} while (countChar==str.length()-1);
		}
		System.out.println("The final count of the specific char is: " + countSpecificChar);
		
		// 3.2 With char data type
		countChar = 0;
		countSpecificChar = 0;
		for(char m : str.toCharArray()) {
			m = str.charAt(countChar);
			if(m=='a') {
				System.out.println(str.indexOf(m, countChar));
				countSpecificChar++;
			}
			countChar++;
		}
		System.out.println("The final count of the specific char is: " + countSpecificChar);
		//====================================================================================================
		System.out.println("===============================================================================");
		System.out.println(str);
		
		
		
		// From sir's video
		System.out.println(str.indexOf('H'));//0
        System.out.println(str.indexOf('i'));//1 ==> First occurrence of 'i'
		
		System.out.println(str.indexOf('i', 2));//6 ==> 2nd occurrence of 'i'
		// Returns the index within this string of the first occurrence 
		// of the specified character, starting the search at the specified index.
		System.out.println(str.indexOf('i', 7));//9 ==> 3rd occurrence of 'i'
		
		// Don't use hard coded values
		System.out.println(str.indexOf('i', str.indexOf('i')+1));
		//6 ==> 2nd occurrence of 'i'
		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i')+1)+1));
		//9 ==> 3rd occurrence of 'i'
		
		// Fifth occurrence of 'a'
		System.out.println("Fifth Occurrence: " + str.indexOf('a', str.indexOf('a', str.indexOf('a', str.indexOf('a', str.indexOf('a')+1)+1)+1)+1));
		
		//index of String
		System.out.println(str.indexOf("Java"));//15
		// Returns the index of the first occurrence of the specified substring, 
		// or -1 if there is no such occurrence.
		
		System.out.println(str.indexOf("java"));//-1
		// If substring is not present in the string, it will give -1.
		System.out.println(str.indexOf('z'));//-1
		// If char is not present in the string, it will give -1.
		
		
		//trim()
		String s1 = "   Welcome ";
		System.out.println(s1.trim());//Welcome
		// Returns a string whose value is this string, 
		// with all leading and trailing space removed
		
		String s2 = " We l come   ";
		System.out.println(s2.trim());//we l come
	    //removes spaces from beginning and after the end of the String
		
		String s3 = null;
		for(int l=0; l<s2.length(); l++) {
			if(s2.trim().contains(" ")) {
				s3 = s2.replace(" ", "");
			}
		}
		System.out.println(s3);//Welcome
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
