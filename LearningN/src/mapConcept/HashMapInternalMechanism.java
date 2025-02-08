package mapConcept;

import java.util.HashMap;

public class HashMapInternalMechanism {

	public static void main(String[] args) {
		
		HashMap<String, Integer> empMap = new HashMap<String, Integer>();
		
		empMap.put("nitin", 10);
		empMap.put("ravi", 20);
		empMap.put("pooja", 90);
		empMap.put("naveen", 20);
		empMap.put("pavithra", 30);
		empMap.put("radha", 50);
		empMap.put("deb", 60);
		empMap.put(null, 5);
		
		System.out.println(empMap);
		//{deb=60, null=5, nitin=10, ravi=20, naveen=20, pooja=90, radha=50, pavithra=30}
		
		//============================================================================
		//how does the hash- works internally:
		
		
		
		//============================================================================
		
		//System.out.println(empMap.entrySet());
		//[deb=60, null=5, nitin=10, ravi=20, naveen=20, pooja=90, radha=50, pavithra=30]
	
	}

}
