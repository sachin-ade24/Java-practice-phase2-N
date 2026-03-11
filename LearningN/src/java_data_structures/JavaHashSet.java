package java_data_structures;

import java.util.HashSet;

public class JavaHashSet {

	public static void main(String[] args) {
		
		/*
		 * 
		 1) HashSet in Java implements the Set interface of the Collections Framework.
		 
		 2) It is used to store the unique elements, and it doesn't maintain any specific order 
		    of elements.
		    - HashSet does not allow duplicate elements.
		    - Uses HashMap internally which is an implementation of hash table data structure.
		    - Also implements Serializable and Cloneable interfaces.
		    - HashSet is not thread-safe. To make it thread-safe, synchronization is needed 
		      externally.
				 
		 3) Capacity of HashSet:
		    Capacity refers to the number of buckets in the hash table. The default capacity of a 
		    HashSet is 16 and the load factor is 0.75.
		    
		 4) When the number of elements exceeds the capacity automatically increases (resizes) 
		    to maintain performance.
			- new capacity = old capacity × 2
			
			Load Factor:
			Load Factor is a measure that controls how full the HashSet can get before resizing. 
			- Default Load Factor = 0.75. 
			If the number of elements exceeds the threshold, the capacity is doubled.
			- Threshold = capacity × load factor
			
		 5) Constructors of HashSet class: To create a HashSet, we need to create an object of 
		 the HashSet class. The HashSet class consists of various constructors that allow the 
		 possible creation of the HashSet. The following are the constructors available in this 
		 class.

		 1. HashSet():
		    Creates a new empty HashSet with default capacity (16) and load factor (0.75).
		    
		    HashSet<String> set = new HashSet<>();
		 * 
		 * */
		HashSet<String> hashSet1 = new HashSet<>();
		hashSet1.add("Aa");
		hashSet1.add("Bb");
		hashSet1.add("Aa");
		hashSet1.add("Cc");
		hashSet1.add("Dd");
		System.out.println(hashSet1);
		//[Aa, Bb, Cc, Dd]
		
		 /*
		  * 
		  2. HashSet(int initialCapacity): Creates an empty HashSet with the specified initial 
		  capacity and default load factor (0.75).
		  
		  HashSet<Type> set = new HashSet<>(int initialCapacity);
		  * */
		 HashSet<String> hashSet2 = new HashSet<>(19);
		 hashSet2.add("aA");
		 hashSet2.add("bB");
		
		 /*
		  * 
		  3. HashSet(int initialCapacity, float loadFactor): Creates an empty HashSet with the 
		  given initial capacity and load factor.
		  
		  HashSet<Type> set = new HashSet<>(int initialCapacity, float loadFactor);
		  * */
		 HashSet<String> hashSet3 = new HashSet<>(20, 1);
		 hashSet3.add("aa");
		 hashSet3.add("bb");
		 
		 /*
		  * 
		  4. HashSet(Collection<? extends E> c): Creates a new HashSet containing the elements 
		  of the specified collection (removes duplicates automatically).
		  
		  HashSet<Type> set = new HashSet<>(c);
		  * */
		 HashSet<String> hashSet4 = new HashSet<>(hashSet1);
		 hashSet4.add("aA");
		 System.out.println(hashSet4);
		 //[Aa, Bb, Cc, Dd, aA]
	}

}
