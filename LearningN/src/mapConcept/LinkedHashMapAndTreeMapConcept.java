package mapConcept;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapAndTreeMapConcept {

	public static void main(String[] args) {
		
		//HashMap<String, Integer> empMap = new HashMap<String, Integer>();
		//Map<String, Integer> empMap = new HashMap<String, Integer>();
		
		//LinkedHashMap --> maintains the sequence
		//Map<String, Integer> empMap = new LinkedHashMap<String, Integer>();
		Map<String, Integer> empMap = new TreeMap<String, Integer>();
		
		empMap.put("nitin", 10);
		empMap.put("ravi", 20);
		empMap.put("pooja", 90);
		empMap.put("naveen", 20);
		empMap.put("pavithra", 30);
		empMap.put("radha", 50);
		empMap.put("deb", 60);
		
		//LinkedHashMap:
		//System.out.println(empMap);
		//{nitin=10, ravi=20, pooja=90, naveen=20, pavithra=30, radha=50, deb=60}
		
		//TreeMap: gives sorted order for 'keys'
		System.out.println(empMap);
		//{deb=60, naveen=20, nitin=10, pavithra=30, pooja=90, radha=50, ravi=20}
		

	}

}
