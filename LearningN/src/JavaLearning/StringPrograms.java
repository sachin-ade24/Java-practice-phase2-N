package JavaLearning;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPrograms {

	public static void main(String[] args) {
		
		String str = "Hi, this is my Java code and I am so happy.";
		
		// Find the no. of characters in the String
		System.out.println("The no. of the characters present in the above String: "
		 + (str.length()-1));// 42
		
		// Find index of the given character
		System.out.println(str.indexOf('J'));//15
		// Find the first occurrence of a character
		System.out.println(str.indexOf('a', 0));//16
		// It returns index (int)
		// Find the second occurrence of a character
		System.out.println(str.indexOf('a', 17));//18
		// But above value is a hard coded value
		// Note: For second occurrence start from 'firstOccurrenceIndex + 1'
		// Find the 'nth' occurrence of a character
		// n=2
		System.out.println(str.indexOf('a', (str.indexOf('a', 0))+1));//18
		System.out.println(str.indexOf('a', (str.indexOf('a'))+1));//18
		// n=5
		System.out.println(str.indexOf('a', str.indexOf('a', str.indexOf('a', str.indexOf('a', str.indexOf('a', 0)+1)+1)+1)+1));
		//38
		System.out.println(str.indexOf('a', str.indexOf('a', str.indexOf('a', str.indexOf('a', str.indexOf('a')+1)+1)+1)+1));
		//38
		
		
		// Find the character at some index
		System.out.println(str.charAt(0));//H
		System.out.println();
		//for(int i=0; i<=str.length()-1; i++) {
		//	System.out.println(str.charAt(i));
		//}
		for(int i=0; i<=str.length()-1; i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println("\n");
		
		
		// Find ASCII values of the characters
		System.out.println(str.codePointAt(0));//72
		for(int i=0; i<str.length(); i++) {
			System.out.println("The unicode for " + "'" + str.charAt(i) + "'" + " is: " + str.codePointAt(i));
		}
		
		System.out.println(str.codePointBefore(1));//72
		System.out.println(str.codePointBefore(43));//46 ==> '.'
		
		System.out.println("\n");
		
		//
		System.out.println("===================================");
		char c = '.';
		int i1 = (char)c;
		System.out.println(i1);//46
		System.out.println("===================================");
		
		
		// compareTo:
		String str1 = "Hi";
		System.out.println(str.compareTo(str1));//41
		// H -> 72, i -> 105
		// , -> 44, no char -> 0
		// So, after ',' lexicographical comparison result => 44-0=44. Comparison
		// stops here.
		// Output will be positive in the above case.
		// 43-2=41
		// Comparison stops at 'Hi'. 'Hi' has 2 chars. So, total chars of 'str' is 43.
		// total chars of 'str1' is 2. So, 43-2 =41.
		System.out.println("===================================");
		
		
		// concat: String concatenation
		System.out.println(str.concat(" " + str1 + "."));//
		
		
		// compareToIgnoreCase:
		String a = "Sachin";
		String b = "Kalpana";
		System.out.println(a.compareToIgnoreCase(b));//8
		// First compares 'S' with 'K': K is at 11th location in the alphabets and S
		// is at 19th.
		// So, 19-11=8
		System.out.println(b.compareToIgnoreCase(a));//-8
		System.out.println(b.compareToIgnoreCase(b));//0
		
		
		System.out.println("===================================");
		
		// contains
		System.out.println(a.contains("S"));//true
		System.out.println(a.contains("Sad"));//false
		System.out.println(a.contains("in"));//true
		System.out.println(a.contains("ch"));//true
		System.out.println(str.contains("Java"));//true

		
		System.out.println("===================================");
		
		// contentEquals:
		System.out.println(a.contentEquals(b));//false
		//The result is true if and only if this String represents 
		//the same sequence of char values as the specified sequence.
		System.out.println(a.contentEquals("Sa"));//false
		System.out.println("Sachin".contentEquals(a));//true
		
		
		// contentEquals with StringBuffer
		StringBuffer sb = new StringBuffer(a);
		System.out.println(sb);//Sachin
		System.out.println(a);//Sachin
		// System.out.println(sb.equals(a));//false
		System.out.println(a.contentEquals(sb));//true
		System.out.println(b.contentEquals(sb));//false
		
		
		// endsWith:
		System.out.println(a.endsWith("n"));//true
		System.out.println(a.endsWith("in"));//true
		System.out.println(a.endsWith(b));//false
		
		
		// equalsIgnoreCase:
		System.out.println(a.equalsIgnoreCase("sAcHIn"));//true
		System.out.println("sachin".equalsIgnoreCase(a));//true
		System.out.println(b.equalsIgnoreCase("KALPANA"));//true
		
		
		// equals:
		System.out.println(a.equals(b));//false
		System.out.println(a.equals("sachin"));//false
		System.out.println(a.equals("Sachin"));//true
		
		
		// isBlank
		System.out.println(a.isBlank());//false
		System.out.println("".isBlank());//true
		System.out.println(" ".isBlank());//true
		System.out.println("          ".isBlank());//true
		
		
		// isEmpty
		System.out.println(a.isEmpty());//false
		System.out.println("".isEmpty());//true
		System.out.println(" ".isEmpty());//false
		System.out.println("          ".isEmpty());//false
		
		
		//lastIndexOf:
		System.out.println(str.lastIndexOf('a'));//38 ==> Last index of a
		System.out.println(str.indexOf('a'));//16 ==> First index of a
		System.out.println(str.lastIndexOf("this"));//4
		System.out.println(str.indexOf("this"));//4
		System.out.println(str.lastIndexOf("i"));//9
		System.out.println(str.indexOf("a", 0));//16 ==> First index of a
		
		
		// length:
		System.out.println(a.length());//6
		System.out.println(b.length());//7
		
		
		// matches:
		String s = "SacKal2418";
		System.out.println(str.matches("Java"));//false
		System.out.println(str.matches(".*,.*"));//true
		System.out.println(str.matches(".*,"));//false
		System.out.println(str.matches(",.*"));//false
		System.out.println(str.matches("H.*"));//true
		// Check whether the string starts with "H"
		System.out.println(str.matches("^H.*"));//true
		System.out.println(str.matches("^Hi,.*"));//true
		System.out.println(str.matches(".*Java.*"));//true
        System.out.println(str.matches("\\d"));//false
        System.out.println(s.matches("\\d"));//false
        System.out.println(s.matches(".*\\d"));//true
		System.out.println("===================================");
        System.out.println(str.matches(".*."));//true
        System.out.println(str.matches(".*"));//true
        System.out.println(str.matches(".*\\."));//true
        System.out.println(a.matches(".*."));//true
		System.out.println("===================================");
        //"Hi, this is my Java code and I am so happy."
        System.out.println(str.matches("[a-zA-z,\\,\\s\\.]+"));//true
        System.out.println(str.matches("\\w+\\,(\\s\\w+)*\\."));//true
        String s4 = "1234, @ _ - ' I am an electronics engineer...";
        System.out.println(s4.matches(".*\\."));//true
		System.out.println("===================================");
        String s5 = "Hello world. I am Sachin. I am working in an Tax and Audit firm.";
        String sub = s5.substring(s5.indexOf('I'), s5.indexOf('.', s5.indexOf('.')+1)+1);
        System.out.println(sub);//I am Sachin.
        String sub1 = s5.substring(s5.indexOf('I'), s5.indexOf('I')+1);
        System.out.println(sub1);//I
        int c1=0;
        for(int i=0; i<s5.length(); i++) {
        	if(s5.charAt(i)=='o') {
        		System.out.println(s5.charAt(i));
        		c1++;
        	}
        }
        System.out.println(c1);
        // "([Ia-z]\\s)*\\." ==>.
        // "[A-Z]" ==>returns capital letters
        // "[A-Z]\\s" ==>returns 'I '
        // "[I][\\s,a-zA-Z]+[n]\\." ==>//I am Sachin.
        // "[a-zA-Z,\\s]+[n]\\." ==>//I am Sachin.
        String r = "[\\s,a-zA-Z]+[n]\\.";//I am Sachin.
        Pattern pat = Pattern.compile(r);
		Matcher mat = pat.matcher(s5);
		while(mat.find()) {
			System.out.println(mat.group().trim());
		}
		System.out.println("===================================");
		System.out.println();
		String s6 = "Hello world. I am Sachin. My email id is sachin_a24@gmail.com";
		String r1 = "([a-zA-Z0-9@_]+\\.[a-z]+)";
		Pattern p1  = Pattern.compile(r1);
		Matcher m1 = p1.matcher(s6);
		if(m1.find()) {
			System.out.println(m1.group());//sachin_a24@gmail.com
			//System.out.println(m1.group().replace(".", ""));//Sachin
			//pattern for Sachin is: "[A-Z][a-z]+\\."
			//System.out.println(m1.group());//Sachin
			//pattern for above Sachin is: "[A-Z][a-z]+[n]"
			//pattern for sachin_a24@gmail.com is: "([a-zA-Z0-9@_]+\\.[a-z]+)"
		}
		System.out.println("===================================");
		System.out.println(s6.substring(s6.lastIndexOf('s'), s6.lastIndexOf('m')+1));
		//sachin_a24@gmail.com
		System.out.println(s6.substring(s6.indexOf('S'), s6.indexOf('n')+1));
		//Sachin
        for(int i=0; i<s6.length(); i++) {
        	if(s6.charAt(i)=='S') {
        		if(s6.charAt(i+1)=='a')
        			if(s6.charAt(i+2)=='c') {
        				if(s6.charAt(i+3)=='h') {
        					if(s6.charAt(i+4)=='i') {
        						if(s6.charAt(i+5)=='n') {
        							System.out.println(s6.substring(i, i+6));//Sachin
        						}
        					}
        				}
        			}
        	}
        }
        for(int i=0; i<s6.length(); i++) {
        	if(s6.contains("Sachin")) {
        		System.out.println("Sachin");
        		break;
        	}
        }
		System.out.println("===================================");
		
		// regionMatches:
        System.out.println(str.regionMatches(0, str1, 0, 2));//true
        //boolean regionMatches(int toffset, String other, int ooffset, int len):==>
        //toffset: The starting index of the substring in the first string.
        //other: The second string to compare.
        //ooffset: The starting index of the substring in the second string.
        //len: The number of characters to compare.
		System.out.println(a.regionMatches(1, b, 1, 1));//true
		System.out.println(a.regionMatches(true, 0, "SaChIN", 0, 5));//true
		String s3 = "Hi. My name is sachin.";
		System.out.println(s3.indexOf('s', s3.indexOf('s')+1));//15
		System.out.println(s3.regionMatches(true, s3.indexOf('s', s3.indexOf('s')+1), a, 0, 5));//true
		System.out.println(s3.regionMatches(true, s3.indexOf("sachin"), a, 0, 5));//true

        
		//lastIndexOf:
		String str2 = "My name is name. His name is game.";
		System.out.println(str2.length());//34
		System.out.println(str2.lastIndexOf('s'));//27
		System.out.println(str2.lastIndexOf("name"));//21
		System.out.println(str2.lastIndexOf('e', str.length()-1));//32
		System.out.println(str2.lastIndexOf("game", str2.lastIndexOf('.')));//29
		System.out.println(str2.lastIndexOf("game", str2.indexOf('.')));//-1
		System.out.println(str2.indexOf('.', str2.indexOf('.')+1));//33
		System.out.println(str2.lastIndexOf("game", str2.indexOf('.', str2.indexOf('.')+1)));//29
        
        
        //repeat(int count):
		System.out.println(str2.repeat(3));
		//My name is name. His name is game.My name is name. His name is game.My name is name. His name is game.

		
		//replace, replaceAll, replaceFirst
		String str3 = "Sachin@123#$";
		System.out.println(str3.replace('@', '#'));
		System.out.println(str3.replace("@123#", "!*"));//Sachin!*$
		System.out.println(str3.replace("Sachin", "*"));//*@123#$
		System.out.println(str3.replaceAll("[A-Za-z]+", "*"));//*@123#$
		System.out.println(str3.replaceAll("[@#$0-9]+", " Ade"));//Sachin Ade
		System.out.println(str3.replaceFirst("[a-z]", "_"));//S_chin@123#$
		System.out.println(str3.replaceFirst("[a-z]+", "BA"));//SBA@123#$
		
		
		//startsWith:
		System.out.println(str3.startsWith("S"));//true
		System.out.println(str3.startsWith("Sachin"));//true
		System.out.println(str3.startsWith("Sachin", 0));//true
		String str4 = "Sachin is a QA Engineer.";
		System.out.println(str4.startsWith("QA", str4.indexOf("QA")));//true
		
		
		//strip():
		String str5 = "  S ach in    ";
		System.out.println(str5.strip());//S ach in
		System.out.println(str5.replace(" ", ""));//Sachin
		System.out.println(str5.stripLeading());//S ach in    
		System.out.println(str5.stripTrailing());//  S ach in
		
		
		//Count the spaces in the String
		String str6 = "      S   a         c h   in";
		int c2 = 0;
		for(int j=0; j<str6.length(); j++) {
			if(str6.charAt(j)==' ') {
				c2++;
			}
		}
		System.out.println(c2);//22
		//Reverse the String
		for(int k=str6.length()-1; k>=0; k--) {
			System.out.print(str6.charAt(k));//ni   h c         a   S      
		}
		System.out.println();
		//Count the alphabets occurring repeatedly
		String str7 = "AAaa ssSS edt dddd tt xzxzyt";
		for(int i=0; i<str7.length(); i++) {
			if((i+1)<str7.length()&&(i+2)<str7.length()&&(i+3)<str7.length()) {
				if((str7.charAt(i)==str7.charAt(i+1))){
					if((str7.charAt(i) == str7.charAt(i+2))) {
						i=i+2;
					}else {
						System.out.println(str7.charAt(i));
					}
				}
			}
		}
		
		
		System.out.println("========================================");
		//String str = "Hi, this is my Java code and I am so happy.";
		
		//System.out.println(str.chars());
		
		System.out.println(str);
		
		//toCharArray():
		System.out.println(str.toCharArray());
		char [] ch1 = str.toCharArray();
		System.out.println(Arrays.toString(ch1));
		System.out.println(Arrays.toString(str.toCharArray()));
		//Returns a string representation of the contents of the specified array.
		
		//String.valueOf(String):
		System.out.println(String.valueOf(str));// Prints the str string
		//Returns the string representation of the Object argument.
		System.out.println((String.valueOf(ch1)));
		// Returns the string representation of the char array argument. 
		// The contents of the character array are copied; 
		// subsequent modification of the character array does not affect the returned string.
		System.out.println(Arrays.toString((String.valueOf(ch1).toCharArray())));
		
		
		//
		System.out.println(str.substring(4));
		//this is my Java code and I am so happy.
		System.out.println(str.substring(str.indexOf("and"), str.indexOf(".")));
		//and I am so happy
		//It does not include the last endIndex char or String.
		System.out.println(str.subSequence(str.lastIndexOf(','), str.indexOf('.')));
        //, this is my Java code and I am so happy
		System.out.println(str.toLowerCase());
		//hi, this is my java code and i am so happy.
		System.out.println(str.toUpperCase());
		//HI, THIS IS MY JAVA CODE AND I AM SO HAPPY.
		System.out.println(str.getClass());
		//class java.lang.String
		System.out.println(str.toString());
		//Hi, this is my Java code and I am so happy.
		System.out.println(ch1.toString());//[C@3cda1055
		System.out.println(str);
		

	
		
	}

}
