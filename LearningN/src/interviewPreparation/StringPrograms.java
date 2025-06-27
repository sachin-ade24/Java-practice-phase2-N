package interviewPreparation;

import java.util.ArrayList;
import java.util.HashMap;

public class StringPrograms {

	public static void main(String[] args) {
		
		String s = "I like Java and Selenium";
		
		//System.out.println(s.length());//24
		
		s = s.replace("Java", "word");
		s = s.replace("Selenium", "Java");
		s = s.replace("word", "Selenium");
		System.out.println(s);
		
		/*
		for(int i=0; i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		*/
		
		/*
		for(int i=s.length()-1; i>=0; i--) {
			System.out.println(s.charAt(i));
		}
		*/
		
		/*
		for(char i: s.toCharArray()) {
			System.out.println(i);
		}
		*/
		
		//System.out.println();
		
		String s1 = "Hi, Java is awesome and I like Java, Selenium and JavaScript.";
		
		String input = s1.toLowerCase().replaceAll("[,.]", "");
		System.out.println(input);
		
		HashMap<String, Integer> wordFreq = new HashMap<>();
		
		for(String str: input.split(" ")) {
			if(wordFreq.containsKey(str)) {
				wordFreq.put(str, wordFreq.get(str)+1);
			} else {
				wordFreq.put(str, 1);
			}
		}
		
		/*
		for(HashMap.Entry<String, Integer> entry: wordFreq.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		*/
		for (var entry : wordFreq.entrySet()) {
		    System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		String str = "My name is Sachin and I am an engineer.";
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		
		System.out.println(str.indexOf("a"));
		System.out.println(str.indexOf("a", 5));//12
		System.out.println(str.indexOf("e", str.indexOf("e")+1));
		System.out.println(str.indexOf("a", str.indexOf("a", str.indexOf("a", str.indexOf("a", str.indexOf("a")+1)+1)+1)+1));//12
		
		
		
	}

}
