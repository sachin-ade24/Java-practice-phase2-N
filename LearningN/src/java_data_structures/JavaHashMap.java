package java_data_structures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class JavaHashMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hashMapCltn = new HashMap<>();
		hashMapCltn.put("Pune - Kharadi", 112233);
		hashMapCltn.put("Pune - Shivaji Nagar", 332211);
		hashMapCltn.put("Pune - Hadapsar", 123456);
		hashMapCltn.put("Pune - Swargate", 232134);
		
		int index1Val = hashMapCltn.get("Pune - Kharadi");
		System.out.println(index1Val);//112233
		
		/*
		 containsKey(key): Returns true if this map contains a mapping for the specified key.
		 * */
		System.out.println(hashMapCltn.containsKey("Swargate"));//false
		System.out.println(hashMapCltn.containsKey("Pune - Swargate"));//true
		
		/*
		 containsValue(value): Returns true if this map maps one or more keys to the specified value.
		 * */
		System.out.println(hashMapCltn.containsValue(112233));//true
		
		/*
		 size(): Returns the number of key-value mappings in this map.
		 * */
		System.out.println(hashMapCltn.size());
		
		/*
		 keySet(): Returns a set view of the keys contained in this map
		 Set <String> java.util.HashMap.keySet ()
		 * */
		System.out.println(hashMapCltn.keySet());
		//[Pune - Kharadi, Pune - Swargate, Pune - Shivaji Nagar, Pune - Hadapsar]
		
		/*
		 values(): Returns a Collection view of the values contained in this map. 
		 Collection <Integer> java.util.HashMap.values ()
		 * */
		System.out.println(hashMapCltn.values());
		
		for(String k: hashMapCltn.keySet()) {
			System.out.println(k);
		}
		
		for(int i: hashMapCltn.values()) {
			System.out.println(i);
		}
		
		for(String k: hashMapCltn.keySet()) {
			System.out.println("Key: " + k + " | Value: " + hashMapCltn.get(k));
		}
		
		hashMapCltn.keySet().remove("Pune - Kharadi");
		System.out.println(hashMapCltn.keySet());
		//[Pune - Swargate, Pune - Shivaji Nagar, Pune - Hadapsar]
		hashMapCltn.values().remove(112233);
		System.out.println(hashMapCltn.values());
		//[232134, 332211, 123456]
		
		hashMapCltn.put("Pune - Kharadi", 112233);
		hashMapCltn.remove("Pune - Kharadi");
		hashMapCltn.put("Pune - Kharadi", 112233);
		System.out.println(hashMapCltn);
		
		HashMap<String, Integer> hashMapCln = new HashMap<>();
		hashMapCltn.put("Pimpri", 455678);
		hashMapCltn.put("Chinchwad", 455679);
		
		hashMapCltn.putAll(hashMapCln);
		System.out.println(hashMapCltn);
		/*
		 {Chinchwad=455679, Pune - Kharadi=112233, Pune - Swargate=232134, 
		Pune - Shivaji Nagar=332211, Pimpri=455678, Pune - Hadapsar=123456}
		 * */
		
		/*
		 isEmpty(): boolean java.util.HashMap.isEmpty ()
		 Returns true if this map contains no key-value mappings.
		 * */
		System.out.println(hashMapCltn.isEmpty());//false
		
		
		/*
		 Integer java.util.HashMap.putIfAbsent (String key, Integer value)
		 If the specified key is not already associated with a value (or is mapped to null) 
		 associates it with the given value and returns null, else returns the current value.
		 * */
		hashMapCltn.putIfAbsent("Beed", 431122);
		System.out.println(hashMapCltn);
		/*
		 {Chinchwad=455679, Pune - Kharadi=112233, Pune - Swargate=232134, 
		 Pune - Shivaji Nagar=332211, Pimpri=455678, Beed=431122, Pune - Hadapsar=123456}
		 * */
		
		/*
		 Integer java.util.HashMap.replace (String key, Integer value)
		 Replaces the entry for the specified key only if it is currently mapped to some value.
		 * */
		hashMapCltn.replace("Beed", 432211);
		System.out.println(hashMapCltn);
		
		/*
		 Integer java.util.HashMap.replace (String key, Integer value)
		 Replaces the entry for the specified key only if it is currently mapped to some value.
		 * */
		hashMapCltn.replace("Beed", 432211, 432121);
		System.out.println(hashMapCltn);

		System.out.println("==========================");
		
		//=================================================================================
		
		/*IMPORTANT*/
		
		//1.
		Set<Entry<String, Integer>> st1 = hashMapCltn.entrySet();
		System.out.println(st1);
		/*
		 [Chinchwad=455679, Pune - Kharadi=112233, Pune - Swargate=232134, 
		 Pune - Shivaji Nagar=332211, Pimpri=455678, Beed=431122, Pune - Hadapsar=123456]
		 * */
		
		for(Entry<String, Integer> s: st1) {
			System.out.println(s);
		}
		
		Object[] obj1 = st1.toArray();
		System.out.println(Arrays.toString(obj1));
		/*
		 [Chinchwad=455679, Pune - Kharadi=112233, Pune - Swargate=232134, 
		 Pune - Shivaji Nagar=332211, Pimpri=455678, Beed=431122, Pune - Hadapsar=123456]
		 * */
		for(Object o: obj1) {
			System.out.println(o);
		}
		
		
		//2.
		String str = hashMapCltn.toString();
		//System.out.println(str.replaceAll("[{}]", ""));
		String u = str.replaceAll("[{}]", "");
		String[] strArr = u.split(", ");
		System.out.println(Arrays.toString(strArr));
		
		
		//3.
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 25);
        hashMap.put("Jane", 30);
        hashMap.put("Jim", 35);
        int i = 0;
		for(Map.Entry<String, Integer> entry: hashMap.entrySet()) {
			if(i<hashMap.size()) {
				System.out.println(i+1 + ". " + entry.getKey() + ": " + entry.getValue());
				i++;
			}
		}
		
		hashMap.clear();
		System.out.println(hashMap);//{}
		
		
		//Update the value:
		HashMap<String, String> names = new HashMap<>();
		names.put("Sachin", " Ade");
		names.put("Kalpana", " Rathod");
		names.put("Supriya", "Jadhav");
		System.out.println(names);
		//{Kalpana= Rathod, Supriya=Jadhav, Sachin= Ade}
		
		names.put("Supriya", "Wadate");
		System.out.println(names);
		//{Kalpana= Rathod, Supriya=Wadate, Sachin= Ade}
	}

}
