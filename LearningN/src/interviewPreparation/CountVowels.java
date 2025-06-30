package interviewPreparation;

import java.util.ArrayList;
import java.util.HashMap;

public class CountVowels {

	public static void main(String[] args) {
		
        String s = "I love Java and Selenium";

        String[] s1 = s.toLowerCase().split(" ");
        ArrayList<String> v = new ArrayList<String>();

        // Store all words in the ArrayList
        for (String str : s1) {
            v.add(str);
        }

        System.out.println(v); // optional, prints list of words

        // Loop through each word
        for (String word : v) {
            HashMap<Character, Integer> vowelCount = new HashMap<>();

            // Loop through each character of the word
            for (char c : word.toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    //vowelCount.put(c, vowelCount.getOrDefault(c, 0) + 1);
                	if(vowelCount.containsKey(c)) {
                		vowelCount.put(c, vowelCount.get(c) + 1);
                	}else {
                		vowelCount.put(c, 1);
                	}
                }
            }

            // Print the result for the current word
            System.out.println("Word: " + word);
            for (HashMap.Entry<Character, Integer> entry : vowelCount.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
            System.out.println();
        
        }

	}

}
