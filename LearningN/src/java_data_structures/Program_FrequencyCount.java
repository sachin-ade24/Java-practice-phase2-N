package java_data_structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program_FrequencyCount {

	public static void main(String[] args) {
		
		  //1.
		  String s1 = "Sachi Prince Kalpana Sachin";
		  String[] strArr1 = s1.split("");
		  
		  ArrayList<String> strArrLst1 = new ArrayList<>();
		  for(int i=0; i<strArr1.length; i++) {
			  strArrLst1.add(strArr1[i]);
		  }
		  
		  ArrayList<String> strArrLst2 = new ArrayList<>();
		  for(int j=0; j<strArrLst1.size(); j++) {
			  if(!strArrLst2.contains(strArrLst1.get(j))) {
				  strArrLst2.add(strArrLst1.get(j));
				  System.out.println("The frequency of " + strArrLst1.get(j) + " is: " + 
	                         Collections.frequency(strArrLst1, strArrLst1.get(j)));
			  };
		  }
		  
		  /*
		   * 
		    The frequency of S is: 2
			The frequency of a is: 5
			The frequency of c is: 3
			The frequency of h is: 2
			The frequency of i is: 3
			The frequency of   is: 3
			The frequency of P is: 1
			The frequency of r is: 1
			The frequency of n is: 3
			The frequency of e is: 1
			The frequency of K is: 1
			The frequency of l is: 1
			The frequency of p is: 1
		   * 
		   * */
		  
		  System.out.println();
		  
		  //2.
		  String s2 = "Sachi Prince Kalpana Sachin";
		  char[] strToCharArray = s2.toCharArray();
		  System.out.println(Arrays.toString(strToCharArray));
		  
		  ArrayList<Character> strArrLst3 = new ArrayList<>();
		  for(int i=0; i<strToCharArray.length; i++) {
			  strArrLst3.add(strToCharArray[i]);
		  }
		  
		  ArrayList<Character> strArrLst4 = new ArrayList<>();
		  for(int j=0; j<strArrLst3.size(); j++) {
			  if(!strArrLst4.contains(strArrLst3.get(j))) {
				  strArrLst4.add(strArrLst3.get(j));
				  System.out.println("The frequency of " + strArrLst3.get(j) + " is: " + 
	                         Collections.frequency(strArrLst3, strArrLst3.get(j)));
			  };
		  }
		  
		  /*
		   * 
		    The frequency of S is: 2
			The frequency of a is: 5
			The frequency of c is: 3
			The frequency of h is: 2
			The frequency of i is: 3
			The frequency of   is: 3
			The frequency of P is: 1
			The frequency of r is: 1
			The frequency of n is: 3
			The frequency of e is: 1
			The frequency of K is: 1
			The frequency of l is: 1
			The frequency of p is: 1
		   * 
		   * */
		  
		  
		  //Frequency Count using HashMap:
		  int[] intArray = {1, 0, 7, 9, 0, 1, 7};
		  HashMap<Integer, Integer> hshMp = new HashMap<>();
		  for(int i1=0; i1<intArray.length; i1++) {
			  hshMp.put(intArray[i1], hshMp.getOrDefault(intArray[i1], 0)+1);
		  }
		  System.out.println(hshMp);		  
		  
		  
		  //a Java program to count the frequency of each character in the given string using 
		  //a Map (specifically, HashMap):
		  
		  //1.
		  String str = "I love Java and Selenium. Only Java and Selenium.";
		  String[] strArr = str.split(" ");
		  HashMap<String, Integer> wordHashMap = new HashMap<>();
		  for(String s: strArr) {
			  wordHashMap.put(s, wordHashMap.getOrDefault(s, 0)+1);
		  }
		  System.out.println(wordHashMap);
		  
		  //2.
		  String str1 = "I love Java and Selenium. Only Java and Selenium.";
		  char[] charArray = str1.toCharArray();
		  TreeMap<Character, Integer> treeMap1 = new TreeMap<>();
		  for(char c: charArray) {
			  treeMap1.put(c, treeMap1.getOrDefault(c, 0)+1);
		  }
		  System.out.println(treeMap1);
		  /*
		   { =8, .=2, I=1, J=2, O=1, S=2, a=6, d=2, e=5, i=2, l=4, m=2, n=5, o=1, u=2, v=3, y=1}
		   * */
		  System.out.println(treeMap1.entrySet());
		  /*
		   [ =8, .=2, I=1, J=2, O=1, S=2, a=6, d=2, e=5, i=2, l=4, m=2, n=5, o=1, u=2, v=3, y=1]
		  */
		  for(Map.Entry<Character, Integer> entry: treeMap1.entrySet()) {
			  System.out.println("The frequency of character '" + entry.getKey() + "' is: " + entry.getValue());
		  }
		  
		  
	}

}
