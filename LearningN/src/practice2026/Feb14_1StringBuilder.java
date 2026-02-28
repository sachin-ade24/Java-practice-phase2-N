package practice2026;

public class Feb14_1StringBuilder {
	
	public static String updateText(String s, int subStringIndex) {
		String str = s.replace(s.substring(subStringIndex), "");
		return str;
	}

	public static void main(String[] args) {
		
		System.out.println(updateText("Java Selenium", "Java Selenium".indexOf(" ")));//Java
		System.out.println("Java Selenium".replace(" Selenium", ""));//Java

		byte b[] = {65, 66, 67, 68};
		String strb = new String (b);
		System.out.println(strb);//ABCD
		
		char c[] = {'J', 'a', 'v', 'a'};
		String sc = new String (c);
		System.out.println(sc);//Java
		
		//StringBuilder is Mutable
		String str = "Hello";
		StringBuilder strbldr = new StringBuilder(str);
		strbldr.append(" world!");
		System.out.println(strbldr);//Hello world!
		
		//Constructor of StringBuilder
		//1 Empty builder (default capacity = 16)
		StringBuilder sb1 = new StringBuilder();
		System.out.println(sb1.capacity());//16
		/*
		 * int java.lang.AbstractStringBuilder.capacity ()
		   Returns the current capacity. The capacity is the number of characters 
		   that can be stored (including already written characters), beyond which 
		   an allocation will occur.
 		 *
		 * */
		
		//2️ With String
		StringBuilder sb2 = new StringBuilder("Java");
		System.out.println(sb2.length());//4
		System.out.println(sb2.capacity());//20 --> (16 + 4)
		
		//3 With capacity
		StringBuilder sb3 = new StringBuilder(50);
		System.out.println(sb3.length());//0
		System.out.println(sb3.capacity());//50
		
//=======================================================================================
		
		//**Most Important StringBuilder Methods**//
		
		//1. append(): Adds text at the end
		sb2.append(" | Selenium");
		sb2.append(" | " + 2026);
		System.out.println(sb2);//Java | Selenium | 2026
		/*
		 * Highlights:
		 * ✔ Accepts any data type
		   ✔ Returns same object (method chaining possible)
		 * */
		
		/*
		 * StringBuilder java.lang.StringBuilder.append (String str)
		   @IntrinsicCandidate
		   Appends the specified string to this character sequence. 
		 * */
		
		//System.out.println(sb2.length());//0 to 21 ==> 22
		sb2.delete(4, sb2.length());//start deleting from 4th index to index-1
		//System.out.println(sb2.length());//0 to 3 ==> 4
		
		
		//2. insert(): Inserts at specific index
		//sb2.insert(sb2.length()+1, "Selenium");
		//Exception in thread "main" 
		//java.lang.StringIndexOutOfBoundsException: Range [5, 4) out of bounds for length 4
		
		//sb2.insert(sb2.length(), "Selenium");
		//System.out.println(sb2);//JavaSelenium
		
		//sb2.insert(0, "Selenium");//SeleniumJava
		//System.out.println(sb2.indexOf("Java"));//8
		
		sb2.insert(sb2.length(), " Selenium");//Java Selenium
		System.out.println(sb2);
		
		StringBuilder sb4 = new StringBuilder("JavaScript");
		sb4.insert(sb4.indexOf("Script"), " Playwright ");
		System.out.println(sb4);//Java Playwright Script
		/*
		 * StringBuilder java.lang.StringBuilder.insert (int offset, String str)
		   Inserts the string into this character sequence.
		 * */		
		
		//3. delete(): Deletes characters between indexes
		StringBuilder sb5 = new StringBuilder("Java Selenium");
		sb5.delete(4, 13);//Java
		System.out.println(sb5);
		sb5.insert(sb5.length(), " Selenium");//Java Selenium
		System.out.println(sb5);
		sb5.delete(sb5.indexOf(" "), sb5.length());//Java
		System.out.println(sb5);
		/*
		 * StringBuilder java.lang.StringBuilder.delete (int start, int end)
		   Removes the characters in a substring of this sequence. The substring begins 
		   at the specified start and extends to the character at index end - 1 or to the 
		   end of the sequence if no such character exists. If start is equal to end, no changes 
		   are made.
		 * */	
		
		//4. deleteCharAt(): Deletes a single character
		StringBuilder sb6 = new StringBuilder("Javaaa");
		sb6.deleteCharAt(4);
		System.out.println(sb6);//Javaa
		sb6.deleteCharAt(4);
		System.out.println(sb6);//Java
		/*
		 * StringBuilder java.lang.StringBuilder.deleteCharAt (int index)
		 * Removes the char at the specified position in this sequence. 
		   This sequence is shortened by one char.
		 * */
		
		//5. replace(): Replaces part of string
		StringBuilder sb7 = new StringBuilder("Playwright Java");
		sb7.replace(sb7.indexOf("Java"), sb7.length(), "JavaScript");
		System.out.println(sb7);//Playwright JavaScript
		/*
		 * StringBuilder java.lang.StringBuilder.replace (int start, int end, String str)
		 * Replaces the characters in a substring of this sequence with characters in the 
		   specified String. The substring begins at the specified start and extends to the 
		   character at index end - 1 or to the end of the sequence if no such character exists. 
		   First the characters in the substring are removed and then the specified String is 
		   inserted at start. (This sequence will be lengthened to accommodate the specified 
		   String if necessary.)
		 * */
		
		//6. reverse()
		StringBuilder sb8 = new StringBuilder("Automation");
		sb8.reverse();
		System.out.println(sb8);//noitamotuA
		
		for(int i=sb8.length()-1; i>=0; i--) {
			System.out.print(sb8.charAt(i));
		}//Automation
		System.out.println();
		
		//7. charAt():
		StringBuilder sb9 = new StringBuilder("TypeScript");
		System.out.println(sb9.charAt(0));//T
		System.out.println(sb9.charAt(sb9.length()-1));//t
		/*
		 * char java.lang.AbstractStringBuilder.charAt (int index)
		 * Returns the char value in this sequence at the specified index.
		   The first char value is at index 0, the next at index 1, and so on, 
		   as in array indexing. 
		 * The index argument must be greater than or equal to 0, and less than the length 
		   of this sequence. 
		 * */
		
		//8. setCharAt(): Replaces a character
		//The character at the specified index is set to ch.
		StringBuilder sb10 = new StringBuilder("Python");
		
		//sb10.setCharAt(6, '1');
		//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 6 out of 
		//bounds for length 6
		
		sb10.setCharAt(5, 'N');//PythoN
		System.out.println(sb10);
		//sb10.setCharAt(sb10.length()-1, '1');
		
		sb10.setCharAt(sb10.length()-1, 'n');//Python
		System.out.println(sb10);
		/*
		 * void java.lang.AbstractStringBuilder.setCharAt (int index, char ch)
		 * The character at the specified index is set to ch. This sequence is altered to 
		   represent a new character sequence that is identical to the old character sequence, 
		   except that it contains the character ch at position index. 
		 * The index argument must be greater than or equal to 0, and less than the length of 
		   this sequence.
		 * */
		
		sb10.insert(0, "1. ");//1. Python
		System.out.println(sb10);
		
		sb10.deleteCharAt(0);
		
		//9. substring(): 
		// Important note: Returns String, not StringBuilder
		StringBuilder sb11 = new StringBuilder("Selenium");
		System.out.println(sb11.substring(1));//elenium
		System.out.println(sb11);//Selenium
		/*
		 * String java.lang.AbstractStringBuilder.substring (int start)
		 * Returns a new String that contains a subsequence of characters currently contained 
		   in this character sequence. The substring begins at the specified index and extends 
		   to the end of this sequence.
		 * */
		
		//10. toString(): Converts to String
		StringBuilder sb12 =  new StringBuilder("Testing");
		String sb = sb12.toString();//Testing
		System.out.println(sb.getClass());//class java.lang.String
		System.out.println(sb12.getClass());//class java.lang.StringBuilder
		
		//11. capacity():
		StringBuilder sb13 = new StringBuilder("Language");
		System.out.println(sb13.capacity());//24
		sb13.delete(1, sb13.length());//L
		System.out.println(sb13);
		System.out.println(sb13.capacity());//24
		
	}

}
