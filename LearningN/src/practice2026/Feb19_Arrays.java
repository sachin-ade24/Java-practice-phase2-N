package practice2026;

import java.util.Arrays;

public class Feb19_Arrays {

	public static void main(String[] args) {
		
		/*
		📘 Lesson 1: What Is an Array in Java?
			Simple definition:
			An array is a container that stores multiple values of the same data type under 
			one variable name.
			
			
			Instead of this ❌:
			int score1 = 90;
			int score2 = 85;
			int score3 = 88;
			
			We do this ✅:
			int[] scores = {90, 85, 88};
		
		🤔 Why Arrays Exist (Real-Life Analogy):
			Think of:
			Array → A row of lockers 🧳
			Index → Locker number
			Value → Item inside locker
			
			Index:   0    1    2
			Value:  90   85   88
		
		
		🧠 Memory Concept (VERY IMPORTANT):
		
			When you create an array:
			int[] arr = new int[3];
			
			What happens in memory?
	
			1. Stack memory
			   - Variable arr is created
			
			2. Heap memory
			   - Array object of size 3 is created
			
			STACK                HEAP
			-----                ----
			arr  ----------->   [ 0 | 0 | 0 ]
			                      0   1   2
		
			👉 Arrays are objects in Java
			👉 Stored in Heap memory
		
		
		🧩 Types of Array Declaration:
		
			1️. Declaration only: int[] arr;
			
			2️. Declaration + creation: int[] arr = new int[3];
			
			3️. Declaration + initialization: int[] arr = {10, 20, 30};
		
		
		📌 Default Values in Arrays:
		
			| Data Type | Default Value |
			| --------- | ------------- |
			| int       | 0             |
			| double    | 0.0           |
			| boolean   | false         |
			| String    | null          |
			
			e.g.
			String[] names = new String[2];
			System.out.println(names[0]); // null
		
		
		🔢 Accessing Array Elements (Indexing):
		
			int[] arr = {10, 20, 30};
			System.out.println(arr[0]); // 10
			System.out.println(arr[1]); // 20

		    ⚠️ Index starts from 0, not 1.
		    
			ArrayIndexOutOfBoundsException:
			 	System.out.println(arr[3]);
			 	
			✔ Valid indices: 0 to length-1
			
			
	    📏 Array Length:
	    
		    int[] arr = {10, 20, 30};
			System.out.println(arr.length); // 3
		
			⚠️ length is a property, NOT a method
			❌ arr.length()
			✔ arr.length
		
		🔁 Looping Through an Array:
		
			Traditional for loop:
			for (int i = 0; i < arr.length; i++) {
			    System.out.println(arr[i]);
			}
			
			Enhanced for loop (for-each):
			for (int value : arr) {
			    System.out.println(value);
			}
			
			👉 For-each is read-only
			👉 Cannot change values using it
			
		
		🧠 Memory Visualization While Looping:
		
			int[] arr = {10, 20, 30};
			
			i=0 → arr[0] → 10
			i=1 → arr[1] → 20
			i=2 → arr[2] → 30		
			
		
		🧪 Real-World Automation Use Case (Selenium):
		
		   Example: Storing browser names
		   
			String[] browsers = {"chrome", "firefox", "edge"};
			
			for (String browser : browsers) {
			    System.out.println("Running tests on: " + browser);
			}		
		
		    Use cases:
				- Cross-browser testing
				- Running same test on multiple environments
				- Data-driven testing (basic level)
		
		
		🧪 Real-World Automation Use Case (Test Data):
		
			String[] usernames = {"admin", "manager", "guest"};

			for (String user : usernames) {
			    login(user, "password123");
			    logout();
			}
			
			✔ Useful for:
				- Login validation
				- Role-based testing
		
		
		❓ When NOT to Use Arrays:

			- Arrays are:
				❌ Fixed size
				❌ Cannot grow or shrink
			
			- If size is dynamic → use ArrayList
		
		
		
		📝 Summary (Mentor Notes 🧑‍🏫):

			✅ Arrays store multiple values of same type
			✅ Index starts from 0
			✅ Arrays are objects stored in heap
			✅ Size is fixed
			✅ length gives array size
			✅ Very useful in automation frameworks
		
		*/
		
		//1. Change the element of an array
	    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	    System.out.println(Arrays.toString(cars));
	    cars[0] = "Opel";
	    System.out.println(cars[0]);
	    System.out.println(Arrays.toString(cars));
	    
	    //2. Array Length
	    //To find out how many elements an array has, use the length property:
	    String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};
	    System.out.println(cars1.length);
	    // Outputs 4
	    
	    
	    //The new Keyword:
	    /*
	    You can also create an array by specifying its size with new. 
	    This makes an empty array with space for a fixed number of elements, 
	    which you can fill later:	     
	    Example:
	     * */
	    String[] cars2 = new String[4]; // size is 4

	    cars2[0] = "Volvo";
	    cars2[1] = "BMW";
	    cars2[2] = "Ford";
	    cars2[3] = "Mazda";

	    System.out.println(cars2[0]); // Outputs Volvo
	    
	    /*
		However, if you already know the values, you don't need to write new. 
		Both of these create the same array:
	     * */
	    // With new
	    String[] cars3 = new String[] {"Volvo", "BMW", "Ford", "Mazda"};
	    // Shortcut (most common)
	    String[] cars4 = {"Volvo", "BMW", "Ford", "Mazda"};
	    
	    
	    /*
		- Note: You cannot write new String[4] {"Volvo", "BMW", "Ford", "Mazda"}.
		
		- In Java, when using new, you either:
		  Use new String[4] to create an empty array with 4 slots, and then fill them later
		  Or 
		  use new String[] {"Volvo", "BMW", "Ford", "Mazda"} (without specifying the 
		  number of elements) to create the array and assign values at the same time
		
		- Tip: The shortcut syntax is most often used when the values are known at the 
		       start. Use new with a size when you want to create an empty array and fill 
		       it later.
	     * */
	    
	    

	}

}
