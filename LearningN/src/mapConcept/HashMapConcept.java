package mapConcept;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {

		//K-V pair
		HashMap<String, Integer> empMap = new HashMap<String, Integer>();
		
		//put:
		empMap.put("nitin", 10);
		empMap.put("ravi", 20);
		empMap.put("pooja", 90);
		empMap.put("naveen", 20);
		empMap.put("pavithra", 30);
		empMap.put("radha", 50);
		empMap.put("radha", 60);
		empMap.put("deb", 60);
		empMap.put(null, 5);
		empMap.put(null, 7);
		empMap.put("peter", null);
		
		//get:
		System.out.println(empMap.get("ravi"));//20
		System.out.println(empMap.get("tom"));//null
		System.out.println(empMap.get("radha"));//60 --> gives the latest value
		System.out.println(empMap.get("deb"));//60
		System.out.println(empMap.get(null));//5
		System.out.println(empMap.get(null));//7 --> gives the latest value
		System.out.println(empMap.get("peter"));//null
		
		System.out.println(empMap);
		//{deb=60, null=7, nitin=10, peter=null, ravi=20, naveen=20, pooja=90, radha=60, pavithra=30}
		
	}

}
