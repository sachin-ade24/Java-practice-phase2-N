package java_data_structures;

import java.util.LinkedList;

public class JavaLinkedListMethods {
	
	

	public static void main(String[] args) {
		
		//The LinkedList class is a collection which can contain many objects of the same type, 
		//just like the ArrayList.
		
		//1.
		/*
		 * getFirst(): Returns the first item in the list.
		 
		 * getLast(): Returns the last item in the list.
		 * */
		LinkedList<String> lt1 = new LinkedList<>();
		lt1.add("Himalaya Toothpaste");
		lt1.add("Patanjali Toothpaste");
		lt1.add("Babool Toothpaste");
		lt1.add("Vicco Toothpaste");
		String s1 = lt1.getFirst();
		System.out.println(s1);
		String s2 = lt1.getLast();
		System.out.println(s2);
		
		
		//2.
		/*
		 * offer(element e): Adds the specified element as the tail (last element) of this list.
		 * 
		 * offerFirst(element e): Inserts the specified element at the front of this list.
		 * 
		 * offerLast(element e): Inserts the specified element at the end of this list.
		 * */
		LinkedList<String> lt2 = new LinkedList<>();
		lt2.add("Cipla");
		lt2.add("Sun Pharma");
		lt2.add("Dr. Reddy's Lab");
		lt2.add("Lupin");
		System.out.println(lt2);//[Cipla, Sun Pharma, Dr. Reddy's Lab, Lupin Ltd]
		lt2.offer("Mankind Pharma");
		System.out.println(lt2);//[Cipla, Sun Pharma, Dr. Reddy's Lab, Lupin, Mankind Pharma]
		lt2.offerLast("Cipla");
		System.out.println(lt2);
		//[Cipla, Sun Pharma, Dr. Reddy's Lab, Lupin, Mankind Pharma, Cipla]
		lt2.offerFirst("Abbott");
		System.out.println(lt2);
		//[Abbott, Cipla, Sun Pharma, Dr. Reddy's Lab, Lupin, Mankind Pharma, Cipla]

		
		//3.
		/*
		 * peek(): Retrieves, but does not remove, the head (first element) of this list.
		 * 
		 * peekFirst(): Retrieves, but does not remove, the first element of this list, or 
		   returns null if this list is empty.
		 * 
		 * peekLast(): Retrieves, but does not remove, the last element of this list, or 
		   returns null if this list is empty.
		 * */
		LinkedList<String> lt3 = new LinkedList<>();
		lt3.add("TCS");
		lt3.add("Infosys");
		lt3.add("LTI");
		lt3.add("Zensar");
		String s3 = lt3.peek();
		System.out.println(s3);
		String s4 = lt3.peekFirst();
		System.out.println(s4);
		String s5 = lt3.peekLast();
		System.out.println(s5);
		
		
		//4.
		/*
		 * poll(): Retrieves and removes the head (first element) of this list.
		 * 
		 * pollFirst(): Retrieves and removes the first element of this list,
		   or returns null if this list is empty.
		 * 
		 * pollLast(): Retrieves and removes the last element of this list, 
		   or returns null if this list is empty.
		 * */
		LinkedList<String> lt4 = new LinkedList<>();
		lt4.add("Delhi");
		lt4.add("Chandigarh");
		lt4.add("Jammu & Kashmir");
		lt4.add("Puducherry");
		lt4.add("Delhi");
		System.out.println(lt4);//[Delhi, Chandigarh, Jammu & Kashmir, Puducherry, Delhi]
		System.out.println(lt4.size());//5
		String s6 = lt4.poll();
		System.out.println(s6);//Delhi
		System.out.println(lt4);
		System.out.println(lt4.size());//4
		String s7 = lt4.pollFirst();
		System.out.println(s7);//Chandigarh
		System.out.println(lt4);
		System.out.println(lt4.size());//3
		String s8 = lt4.pollLast();
		System.out.println(s8);//Delhi
		System.out.println(lt4);//[Jammu & Kashmir, Puducherry]
		System.out.println(lt4.size());//2
		
		
		//5.
		/*
		 * remove(): Retrieves and removes the head (first element) of this list.
		 * Returns: The head of this list
		 * 
		 * removeFirst(): Removes and returns the first element from this list.
		 * 
		 * removeLast(): Removes and returns the last element from this list.
		 * 
		 * removeFirstOccurrence(): Removes the first occurrence of the specified element in 
		   this list (when traversing the list from head to tail). If the list does not contain 
		   the element, it is unchanged.
		 * 
		 * removeLastOccurrence(): Removes the last occurrence of the specified element in this 
		   list (when traversing the list from head to tail). If the list does not contain the 
		   element, it is unchanged.
		 * */
		LinkedList<String> lt5 = new LinkedList<>();
		lt5.add("Silicon");
		lt5.add("Germanium");
		lt5.add("Gallium Arsenide");
		lt5.add("Gallium Nitride");
		lt5.add("Silicon");
		System.out.println(lt5);//[Silicon, Germanium, Gallium Arsenide, Gallium Nitride, Silicon]
		System.out.println(lt5.size());//5
		String s9 = lt5.remove();
		System.out.println(s9);//Silicon
		System.out.println(lt5);//[Germanium, Gallium Arsenide, Gallium Nitride, Silicon]
		System.out.println(lt5.size());//4
		String s10 = lt5.removeFirst();
		System.out.println(s10);//Germanium
		System.out.println(lt5);//[Gallium Arsenide, Gallium Nitride, Silicon]
		System.out.println(lt5.size());//3
		String s11 = lt5.removeLast();
		System.out.println(s11);//Silicon
		System.out.println(lt5);//[Gallium Arsenide, Gallium Nitride]
		System.out.println(lt5.size());//2
		lt5.addFirst("Silicon");
		lt5.add(1, "Germanium");
		lt5.addLast("Silicon");
		System.out.println(lt5.size());//5
		System.out.println(lt5);
		//[Silicon, Germanium, Gallium Arsenide, Gallium Nitride, Silicon]
		lt5.removeFirstOccurrence("Silicon");
		//System.out.println(lt5.removeFirstOccurrence("Silicon"));//true
		System.out.println(lt5);//[Germanium, Gallium Arsenide, Gallium Nitride, Silicon]
		System.out.println(lt5.size());//4
		lt5.add("Germanium");
		System.out.println(lt5);
		//[Germanium, Gallium Arsenide, Gallium Nitride, Silicon, Germanium]
		lt5.removeLastOccurrence("Germanium");
		System.out.println(lt5);
		//[Germanium, Gallium Arsenide, Gallium Nitride, Silicon]
		
		
		//6.
		
		
		
		
		
		
		
	}

}
