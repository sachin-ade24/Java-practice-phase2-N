package StringConcept;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
	
	public static void main(String[] args) {
        String str = "apple"; // Input string

        // Outer loop to iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the current character
            int count = 0; // Initialize frequency counter
            
            // Check if the character was already counted
            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) {
                continue; // Skip if already counted
            }

            // Inner loop to count occurrences of the character
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            // Print the character and its frequency
            System.out.println(ch + " : " + count);
        }
        
        //===========================================================
        
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Iterate through each character in the string
        for (char ch : str.toCharArray()) {
            // Update the frequency count in the map
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Print each character and its frequency
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
    }

}
