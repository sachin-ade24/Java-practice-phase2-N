package java_data_structures;

import java.util.ArrayList; // Import the ArrayList class
import java.util.Collections;
import java.util.List;

public class JavaArrayList {

	public static void main(String[] args) {
		
		/*
		 * In this class I have covered basics of ArrayList and few of its methods:
		 * add(element), add(index, element), get(element), set(index, element),  
		 * 
		 * */
		
		/*
		 * 
		 Java ArrayList:
		 
		 An ArrayList is like a resizable array.
		
		 It is part of the java.util package and implements the List interface.
		
		 The difference between a built-in array and an ArrayList in Java, is that the size of 
		 an array cannot be modified (if you want to add or remove elements to/from an array, 
		 you have to create a new one). While elements can be added and removed from an ArrayList 
		 whenever you want.
		 
		 
		 Create an ArrayList:
		 To use an ArrayList, you must first import it from java.util:
		 
		 Create an ArrayList object called cars that will store strings:
		 * 
		 * */
		
		 ArrayList<String> cars = new ArrayList<String>();
		 
		 /*
		  * 
		  Now you can use methods like add(), get(), set(), and remove() to manage your list of 
		  elements.

		  Add Elements:
		  To add elements to an ArrayList, use the add() method:
		  * 
		  * */
		 
		 cars.add("TATA Safari");
		 cars.add("TATA Harrier");
		 cars.add("TATA Nexon");
		 cars.add("TATA Sierra");
		 System.out.println(cars);
		 System.out.println(cars.size());//4
		
		 /*You can also add an element at a specified position by referring to the index number:*/
		
		 cars.add(cars.size(), "TATA Indica");
		 System.out.println(cars);
		 //o/p: [TATA Safari, TATA Harrier, TATA Nexon, TATA Sierra, TATA Indica]
		 System.out.println(cars.size());//5
		 
		 //cars.add(cars.size()+1, "TATA Indica");
		 //System.out.println(cars);
		 //o/p: Exception in thread "main" java.lang.IndexOutOfBoundsException
		
		 cars.add(0, "TATA Punch");
		 System.out.println(cars);
		 //[TATA Punch, TATA Safari, TATA Harrier, TATA Nexon, TATA Sierra, TATA Indica]
		 //When you add an element at the beginning the rest of the element will shift to right 
		 System.out.println(cars.size());//6
		 
		 
		 /*
		  * 
		  Access an Element --> get(index)
		  To access an element in the ArrayList, use the get() method and refer to the index 
		  number:
		  * 
		  * */
		 String s1 = cars.get(0);
		 System.out.println(s1);//TATA Punch
		 System.out.println(cars.get(cars.size()-1));//TATA Indica
		 //System.out.println(cars.get(cars.size()));
		 //o/p: Exception in thread "main" java.lang.IndexOutOfBoundsException
		 
		 
		 /*
		  * 
		  Change an Element --> set(index, element)
		  To modify an element, use the set() method and refer to the index number:
		  * 
		  * */
		 
		 System.out.println(cars.set(5, "TATA Sumo"));//TATA Indica
		 //The one which got replaced will be returned
		 cars.set(5, "TATA Sumo");
		 System.out.println(cars);
		 //[TATA Punch, TATA Safari, TATA Harrier, TATA Nexon, TATA Sierra, TATA Sumo]
		 cars.set(cars.size()-1, cars.get(0));
		 System.out.println(cars);
		 //[TATA Punch, TATA Safari, TATA Harrier, TATA Nexon, TATA Sierra, TATA Punch]
		 
		 
		 /*
		  * 
		  Remove an Element --> remove(index), remove(element)
		  To remove an element, use the remove() method and refer to the index number:
		  * 
		  Removes the first occurrence of the specified element from this list,if it is present. 
		  If the list does not contain the element, it is unchanged. More formally, removes the 
		  element with the lowest index i such that Objects.equals(o, get(i))(if such an element 
		  exists). Returns true if this list contained the specified element (or equivalently, 
		  if this list changed as a result of the call).
		  * 
		  * */
		 //Following is the current ArrayList:
		 //[TATA Punch, TATA Safari, TATA Harrier, TATA Nexon, TATA Sierra, TATA Punch]
		 cars.remove(cars.get(cars.size()-1));
		 //cars.remove("TATA Punch");
		 //System.out.println("----------------");
		 System.out.println(cars);
		 //[TATA Safari, TATA Harrier, TATA Nexon, TATA Sierra, TATA Punch]
		 //It does not remove the last one, instead it removes the first one because the same
		 //element occurs at the index 0.
		 cars.remove(cars.get(cars.size()-1));
		 System.out.println(cars);
		 //[TATA Safari, TATA Harrier, TATA Nexon, TATA Sierra]
		 
		 
		 ArrayList<String> animals = new ArrayList<String>();
		 animals.add("Dog");
		 animals.add("Cat");
		 animals.add("Mouse");
		 animals.add("Cow");
		 System.out.println(animals);
		 for(int i=0; i<animals.size(); i++) {
			 System.out.println(animals.get(i));
		 }
		 System.out.println();
		 for(String str: animals) {
			 System.out.println(str);
		 }
		 System.out.println("=========================");
		 
		 System.out.println(animals.get(0));//Dog
		 System.out.println(animals.get(animals.size()-1));//Cow
		 
		 System.out.println("=========================");
		 
		 
		 /*
		  * 
		  Other Types:
		  Elements in an ArrayList are actually objects. In the examples above, we created 
		  elements (objects) of type "String". Remember that a String in Java is an object 
		  (not a primitive type). To use other types, such as int, you must specify an 
		  equivalent wrapper class: Integer. For other primitive types, use: Boolean for 
		  boolean, Character for char, Double for double, etc:

		  Example:
		  Create an ArrayList to store numbers (add elements of type Integer):
		  * 
		  * */
		 ArrayList<Integer> nums = new ArrayList<Integer>();
		 nums.add(0);
		 nums.add(2);
		 nums.add(4);
		 nums.add(6);
		 nums.add(9);
		 System.out.println(nums);
		 for(int i: nums) {
			 if(i%2==0) {
				 System.out.println(i);
			 }
		 }
		 
		 
		 /*
		  * 
		  Sort an ArrayList:
		  Another useful class in the java.util package is the Collections class, which include 
		  the sort() method for sorting lists alphabetically or numerically:
		  * 
		  * */
		 ArrayList<String> laptopBrands = new ArrayList<String>();
		 laptopBrands.add("Macbook");
		 laptopBrands.add("DELL");
		 laptopBrands.add("HP");
		 laptopBrands.add("Sony");
		 laptopBrands.add("Samsung");
		 System.out.println(laptopBrands);//[Macbook, DELL, HP, Sony, Samsung]
		 Collections.sort(laptopBrands);
		 System.out.println(laptopBrands);//[DELL, HP, Macbook, Samsung, Sony]
		 
		 ArrayList<Integer> numbers = new ArrayList<Integer>();
		 numbers.add(10);
		 numbers.add(21);
		 numbers.add(5);
		 numbers.add(29);
		 numbers.add(71);
		 System.out.println(numbers);//[10, 21, 5, 29, 71]
		 Collections.sort(numbers);
		 System.out.println(numbers);//[5, 10, 21, 29, 71]
		 Collections.reverse(numbers);
		 System.out.println(numbers);//[71, 29, 21, 10, 5]
		 int maxNumbers = Collections.max(numbers);
		 System.out.println(maxNumbers);//71
		 int minNumbers = Collections.min(numbers);
		 System.out.println(minNumbers);//5
		 Collections.rotate(numbers, 2);//rotate() --> right
		 System.out.println("Rotate right: " + numbers);//[10, 5, 71, 29, 21]
		 Collections.rotate(numbers, -2);//rotate --> left
		 System.out.println("Rotate left: " + numbers);//[71, 29, 21, 10, 5]
		 Collections.shuffle(numbers);
		 System.out.println("Shuffle randomly: " + numbers);//[21, 29, 5, 10, 71]
		 
		 
		 /*
		  * 
		  The var Keyword:
		  
		  From Java 10, you can use the var keyword to declare an ArrayList variable without 
		  writing the type twice. The compiler figures out the type from the value you assign.
		  
		  This makes code shorter, but many developers still use the full type for clarity. 
		  Since var is valid Java, you may see it in other code, so it's good to know that it 
		  exists:
		  * 
		  * */
		 //Without var:
		 ArrayList<String> strns1 = new ArrayList<String>();
		 
		 //With var:
		 var strns2 = new ArrayList<>(); 
		 
		 
		 /*
		  * 
		  The List Interface:
		  Note: Sometimes you will see both List and ArrayList in Java code, like this:
		  * 
		  * */
		 List<String> flowersList = new ArrayList<>();
		 /*
		  This means the variable (cars) is declared as a List (the interface), but it stores 
		  an ArrayList object (the actual list). Since ArrayList implements the List interface, 
		  this is possible.
		  * 
		  * */
		 /*
		  * 
		  List<String> flowersList = new ArrayList<>();
		  Then WHAT is it?
		  ✅ This is Upcasting using Polymorphism
			 - A parent interface reference pointing to a child class object
			 
		  Let’s break it clearly:
		  1️. List<String>:
		   - List is an interface			
		   - It defines what methods are allowed			
		   - Example: add(), get(), size()
			
		  2️. new ArrayList<>():		
		   - ArrayList is a class			
		   - It implements List			
		   - Provides actual implementation
		   
		  3️. The assignment:
		     List<String> flowersList = new ArrayList<>();
		     
		  This means:

			“I am storing an ArrayList object inside a List reference”
			
		  This is polymorphism.
		  
		  4. Memory Diagram 🧠
			  flowersList (List reference)		  
			        |
			        v		        
			   ArrayList object
		  
		  ✔ Reference type = List
		  ✔ Object type = ArrayList
		  
		  Is this UPCASTING?
		  Technically:
		  ✔ Yes, it is implicit upcasting
			
		  But ⚠️ IMPORTANT:			
		  - It is automatic			
		  - No casting syntax is written			
		  - So we usually don’t call this typecasting
		   
		  Why Java allows this?

		  Because:
		  ArrayList IS-A List
		  This follows the IS-A relationship.
		  
		  Interview One-Liner (Remember This 🔥)
		  ❝ This is polymorphism with interface reference, not typecasting.
		  Java allows a parent reference to hold a child object using implicit upcasting. ❞
		  
		  Summary Table:
		  
		  | Concept         | Yes / No         |
		  | --------------- | ---------------- |
		  | Typecasting     | ❌ No            |
		  | Polymorphism    | ✅ Yes           |
		  | Upcasting       | ✅ Yes (implicit)|
		  | Interface usage | ✅ Yes           |
		  | Best practice   | ✅ Absolutely    |

		  Best Practice:
		  List<String> flowersList = new ArrayList<>();
		  Why?
		  - Flexible		
		  - Maintainable		
		  - Loosely coupled		
		  - Easy to change implementation
		  * 
		  * */
		 flowersList.add("Rose");
		 flowersList.add("Lotus");
		 flowersList.add("Jasmine");
		 flowersList.add("Hibiscus");
		 System.out.println(flowersList);
		 
		 
		 /*
		  * 
		  To remove all the elements in the ArrayList, use the clear() method:
		  * 
		  * */
		 cars.clear();
		 System.out.println(cars);
		 System.out.println(cars.size());
		 
		 
		 
		 /*
		  * 
		  ArrayList Constructors in Java:->
		  Java provides multiple constructors to create an ArrayList based on different 
		  requirements:
		  1. ArrayList(): Creates an empty ArrayList with default initial capacity 10.

			 ArrayList<Integer> arr = new ArrayList<>();
		  * */
		 
		 ArrayList<String> arr1 = new ArrayList<>();
		 arr1.add("100");
		 arr1.add("1000");
		 arr1.add("10000");
		 arr1.add("100000");
		 
		 /*
		  * 
		  2. ArrayList(Collection<? extends E> c): Creates an ArrayList initialized with 
		     elements from the specified collection. 		  
		  * */
		 
		 ArrayList<String> arr2 = new ArrayList<>(arr1);
		 arr2.add("10");
		 System.out.println(arr2);
		 //[100, 1000, 10000, 100000, 10]
		 arr2.add(0, arr2.get(arr2.size()-1));
		 System.out.println(arr2);
		 //[10, 100, 1000, 10000, 100000, 10]
		 
		 /*
		  * 
		  3. ArrayList(int initialCapacity): This constructor is used to build an array list 
		     with the initial capacity being specified.
		  * */
		 ArrayList<Double> arr3 = new ArrayList<>(20);
	}
	
	public void arrayListMethods() {
		/*
		 * 
		 All ArrayList Methods:
		 A list of all ArrayList methods can be found in the table below.
		 Some methods use the type of the ArrayList's items as a parameter or return value. 
		 This type will be referred to as T in the table.
		 
		 ✅ Most-Used ArrayList Methods (Interview Focus):
		 
		 | **Method**            | **Purpose**                     | **Time Complexity (Big-O)** | **Interview Notes**                         |
		 | --------------------- | ------------------------------- | --------------------------- | ------------------------------------------- |
		 | `add(E e)`            | Add element at the end          | **O(1)** *(Amortized)*      | Occasional resize makes worst case **O(n)** |
		 | `add(int index, E e)` | Add element at a specific index | **O(n)**                    | Elements need shifting                      |
		 | `get(int index)`      | Access element by index         | **O(1)**                    | One of the biggest advantages of ArrayList  |
		 | `set(int index, E e)` | Replace element at index        | **O(1)**                    | No shifting required                        |
		 | `remove(int index)`   | Remove element by index         | **O(n)**                    | Elements shift left                         |
		 | `remove(Object o)`    | Remove first matching element   | **O(n)**                    | Requires search + shift                     |
		 | `contains(Object o)`  | Check if element exists         | **O(n)**                    | Linear search                               |
		 | `indexOf(Object o)`   | Find first occurrence index     | **O(n)**                    | Starts from beginning                       |
		 | `size()`              | Get number of elements          | **O(1)**                    | Stored internally                           |
		 | `isEmpty()`           | Check if list is empty          | **O(1)**                    | Just checks size                            |
		 | `clear()`             | Remove all elements             | **O(n)**                    | Each reference cleared                      |
		 | `toArray()`           | Convert list to array           | **O(n)**                    | Copies all elements                         |
		 | `iterator()`          | Iterate over list               | **O(1)**                    | Iteration itself is O(n)                    |
		 | `sort()`              | Sort elements                   | **O(n log n)**              | Uses TimSort internally                     |

		 * 
		 * */
	}

}
