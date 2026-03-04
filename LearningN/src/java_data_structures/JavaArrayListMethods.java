package java_data_structures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaArrayListMethods {

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<>();
		
		//1.
		//add(element): Appends the specified element to the end of this list.
		l1.add(0);
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(3);
		l1.add(4);
		System.out.println(l1);//[0, 1, 2, 3, 3, 4]
		
		
		//2.
		//add(): 
		//Inserts the specified element at the specified position in this list
		//(optional operation). Shifts the element currently at that position(if any) and 
		//any subsequent elements to the right (adds one to their indices).
		l1.add(6, 5);
		System.out.println(l1);//[0, 1, 2, 3, 3, 4, 5]
		
		
		//3.
		//addAll(Collection c): Add items from one list into another
		//'c' collection containing elements to be added to this list
		List<Integer> l2 = new ArrayList<>();
		l2.addAll(l1);
		System.out.println(l2);//[0, 1, 2, 3, 3, 4, 5]
		l2.add(7);
		System.out.println(l2);//[0, 1, 2, 3, 3, 4, 5, 7]
		
		
		//4.
		//addAll(index, Collection c):
		/*
		 Inserts all of the elements in the specified collection into this list at the specified 
		 position (optional operation). Shifts the element currently at that position (if any) 
		 and any subsequent elements to the right (increases their indices). The new elements 
		 will appear in this list in the order that they are returned by the specified 
		 collection's iterator. The behavior of this operation is undefined if the specified 
		 collection is modified while the operation is in progress.
		 * 
		 * */
		List<Integer> l3 = new ArrayList<>();
		l3.add(10);
		l3.add(14);
		System.out.println(l3);//[10, 14]
		l3.addAll(1, l2);
		System.out.println(l3);//[10, 0, 1, 2, 3, 3, 4, 5, 7, 14]
		
		/*
		 * IMPORTANT NOTE: addAll()
		   The Definition and Usage:
		   The addAll() method adds all of the items from a collection to the list.
		   If an index is provided then the new items will be placed at the specified index, pushing 
		   all of the following elements in the list ahead.
		   If an index is not provided then the new items will be placed at the end of the list.
		 * 
		 * 
		 * */
		

		//5.
		//clear(): Remove all items from a list.
		List<String> strs = new ArrayList<>();
		strs.clear();
		System.out.println(strs);//[]
		//Nothing happens here, it just gives you an empty array --> [], 
		//I mean if you don't have any element in your collection it does not throw an exception
		strs.add("Sachin");
		strs.add("Kalpana");
		strs.add("Prince");
		strs.add("Sachi");
		System.out.println(strs);//[Sachin, Kalpana, Prince, Sachi]
		strs.clear();
		System.out.println(strs);//[]
		
		
		//6.
		//clone(): Create a copy of a list.
		/*
		 * Definition and Usage:
		   The clone() method returns a copy of the ArrayList as an Object.
		   This creates a "shallow" copy, which means that copies of objects in the list 
		   are not created, instead the list has references to the same objects that are 
		   in the original list.
		 * */
		//Option1:
		List<String> strs2 = new ArrayList<>(strs);
		System.out.println("===========================");
		System.out.println(strs2);//[]
		                 //OR
		//Option2:
		ArrayList<String> strs3 = new ArrayList<String>();
		ArrayList<String> strs4 = (ArrayList)strs3.clone();
		
		
		//7.
		//contains(): Check if an item exists in a list.
		/*
		 * 
		 Definition and Usage:
		 The contains() method returns true if an item exists in a list and false otherwise.
		 Note: Since the return type is Object, it must be type casted in order to use it as 
		 an ArrayList as shown in the example above.
		 * */
		List<Integer> l4 = new ArrayList<>();
		l4.add(15);
		l4.add(20);
		l4.add(5);
		l4.add(10);
		System.out.println(l4);//[15, 20, 5, 10]
		Collections.sort(l4);
		System.out.println(l4);//[5, 10, 15, 20]
		System.out.println(l4.contains(10));//true
		System.out.println(l4.contains(100));//false
		
		
		//8.
		//ensureCapacity(): Increase the capacity of a list.
		/*
		 * Definition and Usage:
		   The ensureCapacity() method increases the capacity of a list to a specified amount, 
		   if necessary.
		   
		   This method does not have a visible effect but it can make code more efficient.
		   
		   When methods such as add() and addAll() are called, if the capacity of a list is 
		   not large enough then some extra work is done to add enough space for the new items.
		    
		   It takes a bit of time to do this, so having this happen with every add() call is 
		   not ideal.
		   
		   If you know approximately how many items you are going to add, the ensureCapacity() 
		   method allows you to increase the capacity of the list just once for multiple add() 
		   calls.
		 * */
		ArrayList<Integer> l5 = new ArrayList<>();
		System.out.println(l5.size());//0
		l5.ensureCapacity(15);
		for(int i=1; i<=15; i++) {
			l5.add(i);
		}
		System.out.println(l5);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
		System.out.println(l5.size());//15
		
		
		//9.
		//forEach():
		/*
		 Use a lambda expression in the ArrayList's forEach() method to print every item in the 
		 list.
		 
		 Definition and Usage:
		 The forEach() method performs an action on every item in a list. The action can be 
		 defined by a lambda expression that is compatible with the accept() method of Java's 
		 Consumer interface.
		 * */
		ArrayList<Integer> l6 = new ArrayList<>();
		l6.add(20);
		l6.add(21);
		l6.add(22);
		l6.add(23);
		l6.add(23);
		l6.add(24);
		l6.forEach((intr) -> {System.out.println(intr);});
		
		
		//10.
		//get(index): Returns the element at the specified position in this list.
		List<String> l7 = new ArrayList<>();
		l7.add("Pune");
		l7.add("Sambhaji Nagar");
		l7.add("Mumbai");
		l7.add("Kolhapur");
		System.out.println(l7);//[Pune, Sambhaji Nagar, Mumbai, Kolhapur]
		System.out.println(l7.get(3));//Kolhapur
		System.out.println(l7.get(0));//Pune
		System.out.println(l7.get(l7.size()-1));//Kolhapur
		
		
		//11.
		//indexOf(element):
		//Syntax: public int indexOf(Object item)
		//Returns the index of the first occurrence of the specified element in this list, 
		//or -1 if this list does not contain the element
		List<String> l8 = new ArrayList<>();
		l8.add("Physics");
		l8.add("Chemistry");
		l8.add("Mathematics");
		l8.add("Biology");
		System.out.println(l8);
		System.out.println(l8.indexOf("Mathematics"));//2
		System.out.println(l8.indexOf("Maths"));//-1
		System.out.println(l8.get(l8.indexOf("Biology")));//Biology
		
		
		//12.
		//isEmpty(): Returns true if this list contains no elements.
		List<String> l9 = new ArrayList<>();
		l9.add("Aa");
		l9.add("Bb");
		l9.add("Cc");
		l9.add("Dd");
		System.out.println(l9);
		System.out.println(l9.isEmpty());//false
		l9.clear();
		System.out.println(l9.isEmpty());//true
	}

}
