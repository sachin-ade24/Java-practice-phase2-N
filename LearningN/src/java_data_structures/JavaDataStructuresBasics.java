package java_data_structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class JavaDataStructuresBasics {

	public static void main(String[] args) {
		
		/*
		 * 
		 Java Data Structures:
		 
		 Data structures are ways to store and organize data so you can use it efficiently.
			
		 An array is an example of a data structure, which allows multiple elements to be stored 
		 in a single variable.
			
		 Java includes many other data structures as well, in the java.util package. 
		 Each is used to handle data in different ways.
		 Some of the most common are:
		 - ArrayList
		 - HashSet
		 - HashMap
		 
		 * */
		
		
		/*
		 ArrayList: 
		 An ArrayList is a re-sizable array that can grow as needed.
		 It allows you to store elements and access them by index.
		 * */
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("TATA Safari");
		cars.add("TATA Harrier");
		cars.add("TATA Nexon");
		cars.add("TATA Sierra");
		System.out.println(cars);//[TATA Safari, TATA Harrier, TATA Nexon, TATA Sierra]
		
		
		/*
		 HashSet:
         A HashSet is a collection where every element is unique - no duplicates are allowed.
		 * */
		
		HashSet<String> animals = new HashSet<String>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Mouse");
		animals.add("Cow");
		System.out.println(animals);//[Mouse, Cat, Cow, Dog]
		
		
		/*
		 HashMap:
		 A HashMap stores key-value pairs, which are great when you want to store values and 
		 find them by a key (like a name or ID)
		 * */
		
		HashMap<String, Integer> cityPincode = new HashMap<String, Integer>();
		cityPincode.put("Majalgaon", 431131);
		cityPincode.put("JP Nagar Phase 4, Bangalore", 560078);
		cityPincode.put("Kharadi, Pune", 411014);
		cityPincode.put("Kolhapur", 416012);
		System.out.println(cityPincode);
		//{Kharadi, Pune=411014, Kolhapur=416012, JP Nagar Phase 4, Bangalore=560078, Majalgaon=431131}
		
		
		/*
		 * 
		 Data Structures Overview:
		 
		 | **Data Structure** | **Stores**       | **Keeps Order?** | **Allows Duplicates?**            | **Best For**                     |
		 | ------------------ | ---------------- | ---------------- | --------------------------------- | -------------------------------- |
		 | **ArrayList**      | Ordered elements | Yes              | Yes                               | Accessing elements by index      |
		 | **HashSet**        | Unique elements  | No               | No                                | Avoiding duplicates, fast checks |
		 | **HashMap**        | Key–value pairs  | No               | Yes (values allowed, keys unique) | Fast lookup by key               |

		 
		 * */
		
		
		/*
		 * 
		 Iterators:
		 When learning about data structures, you will often hear about iterators too.
		 An iterator is a way to loop through elements in a data structure.
		 It is called an "iterator" because "iterating" is the technical term for looping.
		 * */
		
		ArrayList<String> mobileBrands = new ArrayList<String>();
		mobileBrands.add("Sony");
		mobileBrands.add("Nokia");
		mobileBrands.add("Samsung");
		mobileBrands.add("Motorola");
		mobileBrands.add("Lava");
		System.out.println(mobileBrands);//[Sony, Nokia, Samsung, Motorola, Lava]
		
		//Iterating through an ArrayList:
		//Option1:
		Iterator<String> itr = mobileBrands.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		//Option2:
		for(String str: mobileBrands) {
			System.out.println(str);
		}
		
		
	}

}
