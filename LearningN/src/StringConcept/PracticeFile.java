package StringConcept;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeFile {

	public static void main(String[] args) {

		String str = "Hi, this is my Java code and I am so happy.";
		String newStr = "Hi..bye..";
		
		System.out.println("No. of chars in 'str' is: " + str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(str.length()-1));
		//System.out.println(str.startsWith("and", str.indexOf("and")));
		System.out.println(str.startsWith("H"));
		System.out.println("================================");
		
		//
		//reverse the string without using for loop
		StringBuilder sb = new StringBuilder(newStr);
		System.out.print(sb.reverse());
		System.out.println("\n");
		
		//Other methods of the StringBuilder
		System.out.print(sb.reverse());
		System.out.println("\n");
		System.out.println(sb.delete(2, 3));
		//deletes char from index 2 to 3-1=2 --> startIndex to endIndex-1
		System.out.println("append: " + sb.append('S'));
		System.out.println("substring: " + sb.substring(4));
		System.out.println("insert int: " + sb.insert(0, 1));//(index, int)
		System.out.println("**************************************");
		System.out.println("delete int: " + sb.delete(0, 1));
		//(index, index)
		System.out.println("insert String: " + sb.insert(2, "."));
		//(index, String)
		
		//
		System.out.println(Arrays.toString(str.toCharArray()));
		
		
		System.out.println("================================");
		for(int i=0; i<=str.length()-1; i++) {
			System.out.print(str.charAt(i));
		}
		for(char c : str.toCharArray()) {
			System.out.print(c);
		}
		System.out.println("\n");
		
		//reverse the string using for loop
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println("\n");
		System.out.println("================================");
		System.out.println("================================");
		int i = 1;
		for(char c : str.toCharArray()) {
			c = str.charAt(str.length()-i);
			System.out.print(c);
			i++;
			//if(str.length()-i==1) {
			//	break;
			//}
		}
		System.out.println("\n");
		System.out.println("================================");
		
		String s = " We l come   ";
		System.out.println(s.replace(" ", ""));
		
		
		//1
		//String a = "Sachin123456789nAde";
		//String b = a.replaceAll("[0-9]", "");
		//StringBuilder sb1 = new StringBuilder(b);
		//StringBuilder r = sb1.reverse();
		//r.insert(r.indexOf("n"), "123");
		//System.out.println(r);
		
		//2
		String a = "Sachin123Ade";
		String s1 = null;
		String rp = "\\d+";
		Pattern pat = Pattern.compile(rp);
		Matcher mat = pat.matcher(a);
		if(mat.find()) {
			s1 = mat.group();
		}
		System.out.println(s1);
		StringBuilder sb2 = new StringBuilder(a.replaceAll("[0-9]", ""));
		StringBuilder rev = sb2.reverse();
		System.out.println(rev.insert(rev.lastIndexOf("n"), s1));
		
		//3
		String s2 = null;
		String g1 = "Sachin123Ade";
		String rp1 = "([A-Za-z]+\\d)";
		Pattern p1 = Pattern.compile(rp1);
		Matcher m1 = p1.matcher(g1);
		if(m1.find()) {
			s2 = m1.group();
		}
		System.out.println(s2);
		StringBuilder sb1 = new StringBuilder(s2);
		StringBuilder nsb1 = sb1.deleteCharAt(sb1.length()-1);
		System.out.println(nsb1);
		
		//
		String s3 = null;
		String rp2 = "\\d[A-Za-z]+";
		Pattern p2 = Pattern.compile(rp2);
		Matcher m2 = p2.matcher(g1);
		if(m2.find()) {
			s3 = m2.group();
		}
		System.out.println(s3);
		StringBuilder sb3 = new StringBuilder(s3);
		StringBuilder nsb3 = sb3.deleteCharAt(0);
		System.out.println(nsb3);
		
		System.out.println(nsb3+s1+nsb1);
		
		//
		String a1 = "Sachin123Ade";
		//String regex = "(\\w+)(\\d+)(\\w+)";
		String regex = "([A-Za-z]+)(\\d+)([A-Za-z]+)";
		String swapped = a1.replaceAll(regex, "$3$2$1");
        System.out.println("Original string: " + a1);
        System.out.println("Swapped string: " + swapped);
        
        //
		System.out.println("================================");
		
		//String str = "Hi, this is my Java code and I am so happy.";
		
		System.out.println(str.indexOf("H"));
		System.out.println(str.indexOf("code"));
		System.out.println(str.indexOf('a', 0));//16
		System.out.println(str.indexOf('a', 0)+1);//17 --> v
		System.out.println(str.indexOf('a', str.indexOf('a', 0)+1));//18
		System.out.println(str.indexOf("a", str.indexOf('a', str.indexOf('a', 0)+1)+1));
		System.out.println(str.indexOf('m', str.indexOf('a', str.indexOf('a', str.indexOf('a', str.indexOf('a')+1)+1)+1)));
		//32
		
		System.out.println("==================================\n");
		
		//character frequency count
		String S="apple";
		
		for(int j=0; j<S.length(); j++) {
			char ch = S.charAt(j);
			int count = 0;
			boolean isAlreadyCounted = false;
			for(int k=0; k<j; k++) {
				if(S.charAt(k)==ch) {
					isAlreadyCounted = true;
					break;
				}
			}
			if(isAlreadyCounted) {
				continue;
			}
			for(int k=0; k<S.length(); k++) {
				if(S.charAt(k)==ch) {
					count++;
				}
			}
			System.out.println(ch + ": " + count);
		}

	}

}
