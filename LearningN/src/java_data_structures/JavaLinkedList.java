package java_data_structures;

import java.util.LinkedList;
import java.util.List;

public class JavaLinkedList {

	public static void main(String[] args) {
		
		/*
		 * 
		 Java LinkedList:
		 In the previous chapter, you learned about the ArrayList class. The LinkedList class is 
		 almost identical to the ArrayList:
		 * 
		 * */

		LinkedList<String> cricketTeams = new LinkedList<String>();
		cricketTeams.add("India");
		cricketTeams.add("England");
		cricketTeams.add("Sri Lanka");
		cricketTeams.add("Australia");
		cricketTeams.add("New Zealand");
		System.out.println(cricketTeams);
		
		/*
		 * 
		 ArrayList vs. LinkedList
		 The LinkedList class is a collection which can contain many objects of the same type, 
		 just like the ArrayList.
		 
		 The LinkedList class has the same methods as ArrayList because both follow the List 
		 interface. This means you can add, change, remove, or clear elements in a LinkedList 
		 just like you would with an ArrayList.
		 
		 However, while the ArrayList class and the LinkedList class can be used in the same way, 
		 they are built very differently.

		 How the ArrayList works?
		 The ArrayList class has a regular array inside it. When an element is added, it is 
		 placed into the array. If the array is not big enough, a new, larger array is created 
		 to replace the old one and the old one is removed.
		
		 How the LinkedList works?
		 The LinkedList stores its elements in "containers." The list has a link to the first 
		 container and each container has a link to the next container in the list. To add an 
		 element to the list, the element is placed into a new container and that container is 
		 linked to one of the other containers in the list.
		 
		 When To Use?
		 Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.
		 
		 LinkedList Methods:
		 For many cases, the ArrayList is more efficient as it is common to need access to 
		 random elements in the list, but the LinkedList provides several methods to do certain 
		 operations more efficiently.
		 
		 | **Method**      | **Description**                                   | **Time Complexity (Big-O)** |
		 | --------------- | ------------------------------------------------- | --------------------------- |
		 | `addFirst()`    | Adds an element to the beginning of the list      | **O(1)**                    |
		 | `addLast()`     | Adds an element to the end of the list            | **O(1)**                    |
		 | `removeFirst()` | Removes an element from the beginning of the list | **O(1)**                    |
		 | `removeLast()`  | Removes an element from the end of the list       | **O(1)**                    |
		 | `getFirst()`    | Gets the element at the beginning of the list     | **O(1)**                    |
		 | `getLast()`     | Gets the element at the end of the list           | **O(1)**                    |


		 The var Keyword:
		 From Java 10, you can use the var keyword to declare a LinkedList variable without 
		 writing the type twice. The compiler figures out the type from the value you assign.
		 This makes code shorter, but many developers still use the full type for clarity. Since 
		 var is valid Java, you may see it in other code, so it's good to know that it exists:
		 
		 * 
		 * */
		//Without var:
		LinkedList<String> l1 = new LinkedList<String>();
		
		//With var:
		var l2 = new LinkedList<>();
		
		
		/*
		 * 
		 The List Interface:
		 Note: Sometimes you will see both List and LinkedList in Java code, like this:
		 * 
		 * */
		List<String> l = new LinkedList<>();
		
	}
	
	
	public void linkedListMethods() {
		
		/*
		 * ✅ LinkedList Methods with Time Complexity:
		 
		 | **Method**                | **Description**                 | **Return Type** | **Time Complexity (Big-O)**   |
		 | ------------------------- | ------------------------------- | --------------- | ----------------------------- |
		 | `add()`                   | Add an item to the list         | boolean / void  | **O(1)**                      |
		 | `addAll()`                | Add a collection of items       | boolean         | **O(n)**                      |
		 | `addFirst()`              | Adds an item to the beginning   | void            | **O(1)**                      |
		 | `addLast()`               | Adds an item to the end         | void            | **O(1)**                      |
		 | `clear()`                 | Remove all items                | void            | **O(n)**                      |
		 | `clone()`                 | Create a copy of the LinkedList | Object          | **O(n)**                      |
		 | `contains()`              | Check if item exists            | boolean         | **O(n)**                      |
		 | `descendingIterator()`    | Iterate in reverse order        | Iterator        | **O(1)** *(iteration = O(n))* |
		 | `element()`               | Retrieve first item             | T               | **O(1)**                      |
		 | `forEach()`               | Perform action on each item     | void            | **O(n)**                      |
		 | `get(int index)`          | Get item at index               | T               | **O(n)**                      |
		 | `getFirst()`              | Get first item                  | T               | **O(1)**                      |
		 | `getLast()`               | Get last item                   | T               | **O(1)**                      |
		 | `indexOf()`               | Find first occurrence           | int             | **O(n)**                      |
		 | `isEmpty()`               | Check if list is empty          | boolean         | **O(1)**                      |
		 | `iterator()`              | Return iterator                 | Iterator        | **O(1)** *(iteration = O(n))* |
		 | `lastIndexOf()`           | Find last occurrence            | int             | **O(n)**                      |
		 | `listIterator()`          | Return list iterator            | ListIterator    | **O(1)**                      |
		 | `offer()`                 | Add item at end                 | boolean         | **O(1)**                      |
		 | `offerFirst()`            | Add item at beginning           | boolean         | **O(1)**                      |
		 | `offerLast()`             | Add item at end                 | boolean         | **O(1)**                      |
		 | `peek()`                  | Retrieve first item             | T               | **O(1)**                      |
		 | `peekFirst()`             | Retrieve first item             | T               | **O(1)**                      |
		 | `peekLast()`              | Retrieve last item              | T               | **O(1)**                      |
		 | `poll()`                  | Retrieve & remove first item    | T               | **O(1)**                      |
		 | `pollFirst()`             | Retrieve & remove first item    | T               | **O(1)**                      |
		 | `pollLast()`              | Retrieve & remove last item     | T               | **O(1)**                      |
		 | `pop()`                   | Remove & return first item      | T               | **O(1)**                      |
		 | `push()`                  | Add item at beginning           | void            | **O(1)**                      |
		 | `remove()`                | Remove element                  | boolean / T     | **O(n)**                      |
		 | `removeAll()`             | Remove collection of items      | boolean         | **O(n)**                      |
		 | `removeFirst()`           | Remove first item               | T               | **O(1)**                      |
		 | `removeFirstOccurrence()` | Remove first matching element   | boolean         | **O(n)**                      |
		 | `removeIf()`              | Remove items by condition       | boolean         | **O(n)**                      |
		 | `removeLast()`            | Remove last item                | T               | **O(1)**                      |
		 | `removeLastOccurrence()`  | Remove last matching element    | boolean         | **O(n)**                      |
		 | `replaceAll()`            | Replace each element            | void            | **O(n)**                      |
		 | `retainAll()`             | Retain matching elements        | boolean         | **O(n)**                      |
		 | `set(int index)`          | Replace element at index        | T               | **O(n)**                      |
		 | `size()`                  | Return number of items          | int             | **O(1)**                      |
		 | `sort()`                  | Sort the list                   | void            | **O(n log n)**                |
		 | `spliterator()`           | Return spliterator              | Spliterator     | **O(1)**                      |
		 | `subList()`               | Return sublist                  | List            | **O(n)**                      |
		 | `toArray()`               | Convert to array                | Object[]        | **O(n)**                      |

		 * 
		 * 
		 ✅ Top 10 Most-Used LinkedList Methods (Interview-Focused):
		 
		 | **Method**      | **Purpose**                     | **Why Interviewers Care**        | **Time Complexity** |
		 | --------------- | ------------------------------- | -------------------------------- | ------------------- |
		 | `add(E e)`      | Add element to list             | Basic insertion operation        | **O(1)**            |
		 | `addFirst(E e)` | Insert at beginning             | Shows deque usage                | **O(1)**            |
		 | `addLast(E e)`  | Insert at end                   | Efficient tail operation         | **O(1)**            |
		 | `getFirst()`    | Access first element            | Head access efficiency           | **O(1)**            |
		 | `getLast()`     | Access last element             | Tail access efficiency           | **O(1)**            |
		 | `remove()`      | Remove element                  | Tests understanding of traversal | **O(n)**            |
		 | `removeFirst()` | Remove from beginning           | Fast deletion                    | **O(1)**            |
		 | `removeLast()`  | Remove from end                 | Fast deletion                    | **O(1)**            |
		 | `peek()`        | View first element safely       | Queue behavior (no exception)    | **O(1)**            |
		 | `poll()`        | Retrieve & remove first element | Queue processing pattern         | **O(1)**            |

		 *
		 * */
		
	}

}
