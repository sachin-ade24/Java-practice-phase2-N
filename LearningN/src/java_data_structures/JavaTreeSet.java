package java_data_structures;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class JavaTreeSet {

	public static void main(String[] args) {
		
		TreeSet<Integer> treeSetCollection = new TreeSet<>();
		treeSetCollection.add(11);
		treeSetCollection.add(1);
		treeSetCollection.add(2);
		treeSetCollection.add(0);
		treeSetCollection.add(3);
		treeSetCollection.add(4);
		
		/*
		 ceiling(Element e): Returns the least element in this set greater than or equal to 
		 the given element, or null if there is no such element.
		 * */
		System.out.println(treeSetCollection.ceiling(10));//11
		
		/*
		 floor(Element e): Returns the greatest element in this set less than or equal to 
		 the given element, or null if there is no such element.
		 * */
		System.out.println(treeSetCollection.floor(10));//4
		
		/*
		 higher(Element e): Returns the least element in this set greater than the given 
		 element, or null if there is no such element.
		 * */
		System.out.println(treeSetCollection.higher(11));//null
		
		/*
		 lower(Element e): Returns the greatest element in this set strictly less than the 
		 given element, or null if there is no such element.
		 * */
		System.out.println(treeSetCollection.lower(11));//4
		
		/*
		 first(): Returns the first (lowest) element currently in this set.
		 * */
		System.out.println(treeSetCollection.first());//0
		
		/*
		 last(): Returns the last (highest) element currently in this set.
		 * */
		System.out.println(treeSetCollection.last());//11
		
		System.out.println(treeSetCollection);//[0, 1, 2, 3, 4, 11]
		int i1Pf = treeSetCollection.pollFirst();
		//Retrieves and removes the first (lowest) element,or returns null if this set is empty.
		System.out.println(i1Pf);
		System.out.println(treeSetCollection);//[1, 2, 3, 4, 11]
		int i2Pl = treeSetCollection.pollLast();
		//Retrieves and removes the last (highest) element,or returns null if this set is empty.
		System.out.println(i2Pl);
		System.out.println(treeSetCollection);//[1, 2, 3, 4]
		
		NavigableSet<Integer> n1 = treeSetCollection.descendingSet();
		System.out.println(n1);//[4, 3, 2, 1]
		
		System.out.println("==================================================");
		
		Iterator<Integer> it1 = treeSetCollection.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println();
		
		Iterator<Integer> it2 = treeSetCollection.descendingIterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		System.out.println("==================================================");
		
		
		TreeSet<String> treeSetCtn = new TreeSet<>();
		treeSetCtn.add("Z");//Highest <-- pollLast()
		treeSetCtn.add("Aa");
		treeSetCtn.add("Bb");
		treeSetCtn.add("Cc");
		treeSetCtn.add("Dd");
		treeSetCtn.add("A");//Lowest <-- pollFirst()
		System.out.println(treeSetCtn);
		String str1Pf = treeSetCtn.pollFirst();
		System.out.println(str1Pf);
		System.out.println(treeSetCtn);
		String str2Pl = treeSetCtn.pollLast();
		System.out.println(str2Pl);
		System.out.println(treeSetCtn);
		
		HashSet<Integer> hashSetCollection = new HashSet<>();
		hashSetCollection.add(91);
		hashSetCollection.add(10);
		hashSetCollection.add(20);
		hashSetCollection.add(30);
		hashSetCollection.add(40);
		hashSetCollection.add(9);
		System.out.println(hashSetCollection);
		//hashSetCollection.pollFirst(); --> Not Allowed
		//hashSetCollection.pollLast(); --> Not Allowed
		
		LinkedHashSet<Integer> linkedHashSetCollection = new LinkedHashSet<>();
		linkedHashSetCollection.add(100);
		linkedHashSetCollection.add(200);
		linkedHashSetCollection.add(300);
		linkedHashSetCollection.add(400);
		
		//linkedHashSetCollection.pollFirst(); --> Not Allowed
		//linkedHashSetCollection.pollLast(); --> Not Allowed

	}

}
