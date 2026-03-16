package java_data_structures;

import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class JavaTreeMap {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> bestCities = new TreeMap<>();
		bestCities.put(0, "Solapur");
		bestCities.put(1, "Pune");
		bestCities.put(2, "Sambhaji Nagar");
		bestCities.put(3, "Kolhapur");
		bestCities.put(4, "Solapur");
		bestCities.put(5, "Ahilya Nagar");
		bestCities.put(6, "Solapur");
		
		System.out.println(bestCities);
		//{0=Solapur, 1=Pune, 2=Sambhaji Nagar, 3=Kolhapur, 4=Solapur, 5=Ahilya Nagar, 6=Solapur}
		
		/*
		 Entry <Integer, String> java.util.TreeMap.firstEntry ():
		 Returns a key-value mapping associated with the least key in this map, or null 
		 if the map is empty.
		 * */
		Entry<Integer, String> entryFirstCity = bestCities.firstEntry();
		System.out.println(entryFirstCity);//0=Solapur
		
		
		/*
		 Entry <Integer, String> java.util.TreeMap.lastEntry ():
		 Returns a key-value mapping associated with the greatest key in this map, or null 
		 if the map is empty.
		 * */
		Entry<Integer, String> entryLastCity =  bestCities.lastEntry();
		System.out.println(entryLastCity);//6=Solapur
		
		
		/*
		 Integer java.util.TreeMap.firstKey (): Returns the first (lowest) key currently in 
		 this map.
		 * */
		int firstCityKey = bestCities.firstKey();
		System.out.println(firstCityKey);//0
		
		
		/*
		 Integer java.util.TreeMap.lastKey (): Returns the last (highest) key currently in 
		 this map.
		 * */
		int lastCityKey = bestCities.lastKey();
		System.out.println(lastCityKey);//6
		
		
		/*
		 boolean java.util.TreeMap.containsKey (Object key):
		 Returns true if this map contains a mapping for the specified key.
		 * */
		System.out.println(bestCities.containsKey(0));
		
		
		/*
		 boolean java.util.TreeMap.containsValue (Object value):
		 Returns true if this map maps one or more keys to the specified value.
		 * */
		System.out.println(bestCities.containsValue("Solapur"));
		
		
		/*
		 NavigableMap <Integer, String> java.util.TreeMap.descendingMap (): 
		 Returns a reverse order view of this map.
		 * */
		NavigableMap<Integer, String> bestCitiesDescending = bestCities.descendingMap();
		System.out.println(bestCitiesDescending);
		//{6=Solapur, 5=Ahilya Nagar, 4=Solapur, 3=Kolhapur, 2=Sambhaji Nagar, 1=Pune, 0=Solapur}
		
		
		/*
		 NavigableSet <Integer> java.util.TreeMap.descendingKeySet ():
		 Returns a reverse order navigable set view of the keys in this map.
		 * */
		NavigableSet<Integer> bestCitiesKeySet = bestCities.descendingKeySet();
		for(int i: bestCitiesKeySet) {
			System.out.println(i);
		}
		
		
		/*
		 Set <Entry <Integer, String>> java.util.TreeMap.entrySet ():
		 Returns a Set view of the mappings contained in this map. 
		 * */
		Set<Entry<Integer, String>> bestCitiesEntrySet= bestCities.entrySet();
		for(Entry<Integer, String> citiesSet: bestCitiesEntrySet) {
			System.out.println(citiesSet.getKey()+ ": " + citiesSet.getValue());
		}
		
		//or
		
		for(Map.Entry<Integer, String> entry: bestCities.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		
		/*
		 Entry <Integer, String> java.util.TreeMap.ceilingEntry (Integer key):
		 Returns a key-value mapping associated with the least key greater than or equal to 
		 the given key, or null if there is no such key.
		 * */
		Entry <Integer, String> kvCeilingEntry = bestCities.ceilingEntry(2);
		System.out.println(kvCeilingEntry);//2=Sambhaji Nagar
		
		
		/*
		 Integer java.util.TreeMap.ceilingKey (Integer key):
		 Returns the least key greater than or equal to the given key, or null if there is 
		 no such key.
		 * */
		int bestCitiesCeilingKey = bestCities.ceilingKey(5);
		System.out.println(bestCitiesCeilingKey);//5
		
		
		/*
		 Entry <Integer, String> java.util.TreeMap.floorEntry (Integer key)
		 Returns a key-value mapping associated with the greatest key less than or equal to 
		 the given key, or null if there is no such key.
		 * */
		Entry<Integer, String> kvFloorEntry = bestCities.floorEntry(4);
		System.out.println(kvFloorEntry);//4=Solapur
		
		
		/*
		 Entry <Integer, String> java.util.TreeMap.floorEntry (Integer key)
		 Returns a key-value mapping associated with the greatest key less than or equal to 
		 the given key, or null if there is no such key.
		 * */
		int bestCitiesFloorKey = bestCities.floorKey(3);
		System.out.println(bestCitiesFloorKey);//3
		
		
		/*
		 Entry <Integer, String> java.util.TreeMap.higherEntry (Integer key):
		 Returns a key-value mapping associated with the least key strictly greater than 
		 the given key, or null if there is no such key.
		 * */
		Entry<Integer, String> citiesHigherEntry = bestCities.higherEntry(5);
		System.out.println(citiesHigherEntry);//6=Solapur
		
		
		/*
		 Entry <Integer, String> java.util.TreeMap.lowerEntry (Integer key):
		 Returns a key-value mapping associated with the greatest key strictly less than 
		 the given key, or null if there is no such key.
		 * */
		Entry<Integer, String> citiesLowerEntry = bestCities.lowerEntry(5);
		System.out.println(citiesLowerEntry);//4=Solapur
		
		
		/*
		 Integer java.util.TreeMap.higherKey (Integer key):
		 Returns the least key strictly greater than the given key, or null if there is no 
		 such key.
		 * */
		int citiesHigherKey = bestCities.higherKey(2);
		System.out.println(citiesHigherKey);//3
		
		
		/*
		 Integer java.util.TreeMap.higherKey (Integer key):
		 Returns the least key strictly greater than the given key, or null if there is no 
		 such key.
		 * */
		int citiesLowerKey = bestCities.lowerKey(2);
		System.out.println(citiesLowerKey);//1
		
		/*
		 Entry <Integer, String> java.util.TreeMap.pollFirstEntry ():
		 Removes and returns a key-value mapping associated withthe least key in this map, 
		 or null if the map is empty.
		 * */
		System.out.println(bestCities.pollFirstEntry());//0=Solapur
		System.out.println(bestCities);
		
		
		/*
		 Entry <Integer, String> java.util.TreeMap.pollLastEntry ():
		 Removes and returns a key-value mapping associated with the greatest key in this map, 
		 or null if the map is empty.
		 * */
		System.out.println(bestCities.pollLastEntry());
		System.out.println(bestCities);
		
		
		/*
		 String java.util.TreeMap.remove (Object key):
		 Removes the mapping for this key from this TreeMap if present.
		 * */
		bestCities.put(0, "Solapur");
		bestCities.remove(4);
		System.out.println(bestCities);
		//{0=Solapur, 1=Pune, 2=Sambhaji Nagar, 3=Kolhapur, 5=Ahilya Nagar}
		
		
		/*
		 String java.util.TreeMap.replace (Integer key, String value):
		 Replaces the entry for the specified key only if it is currently mapped to some value.
		 * */
		bestCities.put(4, "Solapur");
		bestCities.replace(4, "Beed");
		System.out.println(bestCities);
		//{0=Solapur, 1=Pune, 2=Sambhaji Nagar, 3=Kolhapur, 4=Beed, 5=Ahilya Nagar}
		
	}

}
