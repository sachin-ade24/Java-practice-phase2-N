package java_data_structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class JavaArrayListMethods {
	
	static String[] strArray = {"Solid", "Liquid", "Gas", "Plasma", "Bose-Einstein Condensate"};

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<>();
		
		//1.
		//add(element e): Appends the specified element to the end of this list.
		l1.add(0);
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(3);
		l1.add(4);
		System.out.println(l1);//[0, 1, 2, 3, 3, 4]
		
		
		//2.
		//add(int index, element e): 
		//Inserts the specified element at the specified position in this list
		//(optional operation). Shifts the element currently at that position(if any) and 
		//any subsequent elements to the right (adds one to their indices).
		l1.add(6, 5);
		System.out.println(l1);//[0, 1, 2, 3, 3, 4, 5]
		
		
		//3.
		//addAll(Collection c): Add items from one list into another
		//'c' collection containing elements to be added to this list
		List<Integer> l2 = new ArrayList<>();
		l2.add(7);
		l2.addAll(l1);
		System.out.println(l2);//[7, 0, 1, 2, 3, 3, 4, 5]
		l2.add(7);
		System.out.println(l2);//[7, 0, 1, 2, 3, 3, 4, 5, 7]
		
		
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
		//Syntax: public boolean contains(Object item)
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
		//Syntax: public boolean isEmpty()
		List<String> l9 = new ArrayList<>();
		l9.add("Aa");
		l9.add("Bb");
		l9.add("Cc");
		l9.add("Dd");
		System.out.println(l9);
		System.out.println(l9.isEmpty());//false
		l9.clear();
		System.out.println(l9.isEmpty());//true
		
		
		//13.
		//iterator(): The iterator() method returns an Iterator for the list.
		//Syntax: public Iterator iterator()
		List<String> l10 = new ArrayList<>();
		l10.add("Bus");
		l10.add("Car");
		l10.add("Truck");
		l10.add("Container");
		System.out.println(l10);
		Iterator<String> it = l10.iterator();
		//Returns an iterator over the elements in this list in proper sequence.
		while(it.hasNext()) {
			//hasNext(): Returns true if the iteration has more elements.
			System.out.println(it.next());
			//next(): Returns the next element in the iteration.
		}
		
		
		//14.
		//lastIndexOf():The lastIndexOf() method returns the position of the last occurrence of a value 
		//in the list. If the item is not found in the list then it returns -1.
		/*
		 Returns the index of the last occurrence of the specified element in this list, or -1 
		 if this list does not contain the element.More formally, returns the highest index i 
		 such that Objects.equals(o, get(i)),or -1 if there is no such index.
		 * */
		//Syntax: public int lastIndexOf(Object item)
	    List<String> l11 = new ArrayList<>();
	    l11.add("Volvo");
	    l11.add("Ford");
	    l11.add("BMW");
	    l11.add("Ford");
	    l11.add("TATA");
	    int lstInx1 = l11.lastIndexOf("Ford");
	    int lstInx2 = l11.indexOf("Ford");
	    System.out.println(lstInx2);//1
	    System.out.println(lstInx1);//3
	    
	    
		//15.
	    //listIterator(): The listIterator() method returns a ListIterator for the list.
	    //Syntax: public ListIterator listIterator()
	    List<String> l12 = new ArrayList<>();
	    l12.add("CPU");
	    l12.add("Display");
	    l12.add("Keyboard");
	    l12.add("Mouse");
	    l12.add("Webcam");
	    System.out.println(l12);
	    ListIterator<String> lit = l12.listIterator();
	    while(lit.hasNext()) {
	    	System.out.println(lit.next());
	    }
	    while(lit.hasPrevious()) {
	    	//hasPrevious(): Returns true if this list iterator has more elements when 
	    	//traversing the list in the reverse direction. 
	    	//(In other words,returns true if previous would return an element rather than 
	    	//throwing an exception.)
	    	System.out.println(lit.previous());
	    	//previous(): Returns the previous element in the list and moves the cursor position  
	    	//backwards. This method may be called repeatedly to iterate through the list 
	    	//backwards, or intermixed with calls to next to go back and forth.
	    	//(Note that alternating calls to next and previous will return the same element 
	    	//repeatedly.)
	    }
	    
	    
	    //16.
	    //remove():
	    /*
	     The remove() method removes an item from the list, either by position or by value. 
	     If a position is specified then this method returns the removed item. 
	     If a value is specified then it returns true if the value was found and false 
	     otherwise.If a value is specified and multiple elements in the list have the same 
	     value then only the first one is deleted.
	     
	     If the list contains integers and you want to delete an integer based on its value 
	     you will need to pass an Integer object.
	     
	     Syntax:
	     1. public DataType remove(int index)
	        DataType -->  refers to the data type of items in the list.
	     2. public boolean remove(Object item)
	     * */
	    List<String> l13 = new ArrayList<>();
	    l13.add("Java");
	    l13.add("JavaScript");
	    l13.add("Python");
	    l13.add("Ruby");
	    l13.add("Python");
	    l13.add("C");
	    System.out.println(l13);
	    String removedEle1 = l13.remove(5);
	    System.out.println(removedEle1);
	    System.out.println(l13);
	    boolean b = l13.remove("Python");
	    //Removed the first occurred element
	    System.out.println(b);//true
	    System.out.println(l13);
	    
	    List<Integer> l14 = new ArrayList<>();
	    l14.add(5); 
	    l14.add(1);
	    l14.add(45);
	    l14.add(1);
	    l14.add(15);
	    System.out.println(l14.remove(1));
	    System.out.println(l14);//[5, 45, 1, 15]
	    
	    
	    //17.
	    //removeAll(Collection c): The removeAll() method removes all items from a list which  
	    //belong to a specified collection.
	    //Syntax: public boolean removeAll(Collection items)
	    List<String> l15 = new ArrayList<>();
	    l15.add("Times of India");
	    l15.add("Hindustan Times");
	    l15.add("The Hindu");
	    l15.add("The Indian Express");
	    System.out.println(l15);//[Times of India, Hindustan Times, The Hindu, The Indian Express]
	    List<String> l16 = new ArrayList<>();
	    l16.add("Lokmat");
	    l16.add("The Hindu");
	    l16.add("The Indian Express");
	    System.out.println(l16);//[Lokmat, The Hindu, The Indian Express]
	    l15.removeAll(l16);
	    System.out.println(l15);//[Times of India, Hindustan Times]
	    
	    
	    //18.
	    //removeIf():
	    //Syntax: public boolean removeIf(Predicate condition)
	    //Removes all of the elements of this collection that satisfy the given predicate.
	    /*
	     The removeIf() method removes all elements from this list for which a condition is 
	     satisfied. The condition can be defined by the return value of a lambda expression 
	     that is compatible with the test() method of Java's Predicate interface.
	     * */
	    List<String> l17 = new ArrayList<>();
	    l17.add("Maharashtra");
	    l17.add("Karnataka");
	    l17.add("Telangana");
	    l17.add("Gujrat");
	    l17.removeIf(str -> !(str.contains("a")));
	    System.out.println(l17);//[Maharashtra, Karnataka, Telangana, Gujrat]
	    l17.removeIf(str -> str.contains("a"));
	    System.out.println(l17);//[]
	    
	    List<Integer> l17_1 = new ArrayList<>();
	    l17_1.add(1);
	    l17_1.add(2);
	    l17_1.add(3);
	    l17_1.add(4);
	    l17_1.removeIf(i -> i%2!=0);
	    System.out.println(l17_1);//[2, 4]

	    
	    //19.
	    //replaceAll():
	    //Syntax: public void replaceAll(UnaryOperator operator)
	    /*
	     The replaceAll() method replaces every item in a list with the result of performing 
	     an operation on the item. The operation can be defined by a lambda expression that 
	     is compatible with Java's UnaryOperator interface.
	     * */
	    List<String> l18 = new ArrayList<>();
	    l18.add("Chrome");
	    l18.add("Safari");
	    l18.add("Edge");
	    l18.add("Firefox");
	    System.out.println(l18);
	    l18.replaceAll(str -> str.concat(" Browser"));
	    System.out.println(l18);//[Chrome Browser, Safari Browser, Edge Browser, Firefox Browser]
	    
	    List<Integer> l18_1 = new ArrayList<>();
	    l18_1.add(10);
	    l18_1.add(20);
	    l18_1.add(30);
	    l18_1.add(40);
	    l18_1.replaceAll(num -> num+10);
	    System.out.println(l18_1);//[20, 30, 40, 50]

	    
	    //20.
	    //retainAll(): 
	    //Removes all items from a list which do not belong to a specified collection.
	    List<String> l19 = new ArrayList<>();
	    l19.add("Addition");
	    l19.add("Subtraction");
	    l19.add("Multiplication");
	    l19.add("Division");
	    
	    List<String> l19_1 = new ArrayList<>();
	    l19_1.add("Multiplication");
	    l19_1.add("Addition");
	    l19_1.add("Modulo");
	    
	    l19.retainAll(l19_1);
	    System.out.println(l19);//[Addition, Multiplication]
	    
	    l19.removeAll(l19_1);
	    System.out.println(l19);//[]
	    
	    
	    //21.
	    //set():
	    //Syntax: public DataType set(int index, DataType item)
	    /*
	     replaces an item at a specified position in the list and returns the item that 
	     was previously at that position.
	     * */
	    List<String> l20 = new ArrayList<>();
	    l20.add("Airtel");
	    l20.add("Jio");
	    l20.add("Tata Docomo");
	    l20.add("Idea");
	    l20.add("Vodafone");
	    l20.set(2, "VI");
	    //l20.set(l20.indexOf("Tata Docomo"), "VI");
	    System.out.println(l20);//[Airtel, Jio, VI, Idea, Vodafone]
	    
	    
	    //22.
	    //size(): The size() method indicates how many elements are in the list.
	    System.out.println(l20.size());//5
	    
	    
	    //23.
	    //sort():
	    //Syntax: public void sort(Comparator compare)
	    /*
	     The sort() method sorts items in the list. A Comparator can be used to compare pairs 
	     of elements. The comparator can be defined by a lambda expression which is compatible 
	     with the compare() method of Java's Comparator interface.
	     
         If null is passed into the method then items will be sorted naturally based on their 
         data type (e.g. alphabetically for strings, numerically for numbers). Non-primitive 
         types must implement Java's Comparable interface in order to be sorted without 
         a comparator.
	     * */
	    l20.sort(null);
	    System.out.println(l20);//[Airtel, Idea, Jio, VI, Vodafone]
	    
	    
	    //24.
	    //subList():
	    //Syntax: public List sublist(int start, int end)
	    /*
	     returns a new list (referred to as a sublist) which contains the items of the list 
	     between two indices.
	     
	     Returns a view of the portion of this list between the specified fromIndex, 
	     inclusive, and toIndex, exclusive.
	     * */
	    List<String> l21 = new ArrayList<>();
	    l21.add("Samsung TV");
	    l21.add("Sony TV");
	    l21.add("LG TV");
	    l21.add("MI TV");
	    l21.add("Motorola TV");
	    System.out.println(l21.subList(1, 3));//[Sony TV, LG TV]
	    //subList(fromIndex, toIndex-1)
	    
	    
	    //25.
	    //toArray():
	    //Syntax:
	    //1. public Object[] toArray()
	    //2. public DataType[] toArray(DataType[] array)
	    /*
	     The toArray() method returns an array containing all of the items in the list.
	     * */
	    //example1:
	    List<String> l22 = new ArrayList<>();
	    l22.add("Resistor");
	    l22.add("Capacitor");
	    l22.add("Inductor");
	    l22.add("Insulator");
	    //1. Object Array
	    Object strgArr[] = l22.toArray();
	    System.out.println(strgArr);//[Ljava.lang.Object;@681a9515
	    //2. String DataType Array
	    String[] strArr = new String[4];
	    strArr = l22.toArray(strArr);
	    System.out.println(Arrays.toString(strArr));
	    //[Resistor, Capacitor, Inductor, Insulator]
	    
	    //example2:
	    List<Object> fruits = new ArrayList<>();
	    fruits.add("Mango");
	    fruits.add("Apple");
	    fruits.add("Papaya");
	    fruits.add("Guava");
	    fruits.add("Watermelon");
	    
	    Object[] objectArr = fruits.toArray();
	    System.out.println(Arrays.deepToString(objectArr));
	    //[Mango, Apple, Papaya, Guava, Watermelon]
	    
	    //example3:
	    String[] chemicals = {"NaCl", "H2O2", "H2SO4", "HCl"};
	    System.out.println(Arrays.toString(chemicals));
	    //[NaCl, H2O2, H2SO4, HCl]
	    List<String> chemList = new ArrayList<>();
	    for(int i=0; i<chemicals.length; i++) {
	    	chemList.add(chemicals[i]);
	    }
	    System.out.println(chemList);
	    //[NaCl, H2O2, H2SO4, HCl]
	    
	    
	    ArrayList<String> strArrLst = new ArrayList<>();
	    strArrLst.add("Marathi");
	    strArrLst.add("Hindi");
	    strArrLst.add("Lamani");
	    strArrLst.add("English");
	    
	    
	    ArrayList<String> myArrayList = ArrayToArrayListConversion.arrayToArrayList(strArray);
	    System.out.println(myArrayList);
	    //[Solid, Liquid, Gas, Plasma, Bose-Einstein Condensate]
	}

}
