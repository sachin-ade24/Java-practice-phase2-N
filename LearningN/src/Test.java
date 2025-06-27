import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		
		/*
		HashMap<String, Integer> num = new HashMap<String, Integer>();
		
		num.put("First", 1);
		num.put("Second", 2);
		num.put("Third", 3);
		num.put("Fourth", 4);
		num.put("Fifth", 5);
		
		
		ArrayList<Integer> valueList = new ArrayList<Integer>();
		
		valueList.addAll(num.values());
		System.out.println(valueList);
		
		Collections.sort(valueList);
		
		System.out.println(valueList);
		*/
		
		String s = "My name is Sachin and I like Java and Selenium.";
		
		String input = s.toLowerCase().replaceAll("[.\s]", "");//[.,\s]
		
		
		char[] charArr = input.toCharArray();
		//System.out.println(Arrays.toString(c));
		
		HashMap<Character, Integer> charFreq = new HashMap<Character, Integer>();
		
		for(char ch: charArr) {
			if(charFreq.containsKey(ch)) {
				charFreq.put(ch, charFreq.get(ch)+1);
			}else {
				charFreq.put(ch, 1);
			}
		}
		
		for(HashMap.Entry<Character, Integer> entry:  charFreq.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		

	}

}
