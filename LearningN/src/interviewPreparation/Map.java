package interviewPreparation;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		capitalCities.put("Maharashtra", "Mumbai");
		capitalCities.put("Rajasthan", "Jaipur");
		capitalCities.put("Gujrat", "Ahamadabad");
		capitalCities.put("UP", "Luknow");
		capitalCities.put("Karnataka", "Bengluru");
		
		System.out.println(capitalCities);
		
		System.out.println(capitalCities.get("Maharashtra"));
		System.out.println(capitalCities.get("UP"));
		
		capitalCities.remove("UP");
		System.out.println(capitalCities);
		
		System.out.println(capitalCities.size());
		
		//Print keys
		for(String key: capitalCities.keySet()) {
			System.out.println(key);
		}
		
		System.out.println();
		
		//Print values
		for(String key: capitalCities.values()) {
			System.out.println(key);
		}
		System.out.println();
		for(String key: capitalCities.keySet()) {
			System.out.println(capitalCities.get(key));
		}
		
		System.out.println();
		
		//key-value
		for(String key: capitalCities.keySet()) {
			System.out.println(key + " - " + capitalCities.get(key));
		}
		
		System.out.println();
		
		HashMap<String, Integer> people = new HashMap<String, Integer>();
		people.put("Sachin", 36);
		people.put("Kalpana", 31);
		people.put("Prince", 04);
		people.put("Suraj", 28);
		people.put("Samarth", 01);
		
		System.out.println(people);
		
		for(String key: people.keySet()) {
			System.out.println(key + " - " + people.get(key));
		}
		
		
		//a Java program to count the frequency of each character in the given string using 
		//a Map (specifically, HashMap):
		
		String str = "I love Java and Selenium. Only Java and Selenium.";
		str = str.toLowerCase();
		str = str.replace(" ", "");
		
		HashMap<Character, Integer> charFrequency = new HashMap<Character, Integer>();
		
		for(char ch: str.toCharArray()) {
			if(ch == ' ') {
				continue;
			}
			
			if(charFrequency.containsKey(ch)) {
				charFrequency.put(ch, charFrequency.get(ch)+1);
			} else {
				charFrequency.put(ch, 1);
			}
		}
		
		System.out.println("Character Frequency:");
		
		for(HashMap.Entry<Character, Integer> entry : charFrequency.entrySet()) {
			System.out.println("'" + entry.getKey() + "': " + entry.getValue());
		}
		
	}

}
