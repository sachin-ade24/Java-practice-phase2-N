package JavaSessions;

public class Employee {
	
	// Class variables
	String name;
	int empId;
	int age;
	String deptName;
	boolean isPermanent;

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		// here one object is getting created and 'e1' is the object reference variable
		// so, type of 'e1' is 'Employee'
		// One copy of each variable will be given to 'e1'
		
		e1.empId = 100;
		e1.name = "Tom";
		
		System.out.println(e1.empId + " " + e1.name + " " + e1.age);// 100 Tom 0
		// since e1.age is not yet initialized/defined so it will be 0 (age is integer and the default value 
		// of integer is 0)
		System.out.println(e1.empId + " " + e1.name + " " + e1.age+ " " + e1.deptName);// 100 Tom 0 null
		e1.age = 25;
		e1.deptName = "HR";
		System.out.println(e1.empId + " " + e1.name + " " + e1.age+ " " + e1.deptName);// 100 Tom 25 HR
		
		// Now change the name of e1
		e1.name = "Tom Peter";
		System.out.println(e1.empId + " " + e1.name + " " + e1.age + " " + e1.deptName);
		// 100 Tom Peter 25 HR
		// now previous name has gone and we updated it to new name
		
		
		//
		Employee e2 = new Employee();
		// here one object is getting created and 'e2' is the object reference variable
		// so, type of 'e2' is 'Employee'
		// One copy of each variable will be given to 'e2'
		
		e2.empId = 200; // Now we have only empId for e2
	    System.out.println(e1.empId);// 100	
	    System.out.println(e2.empId);// 200	
	    
	    
	    // Object without reference
	    new Employee();// Object got created and no one (no variable) is referring it
	    // here one object is getting created
	    // One copy of each variable is created but cannot be referred by any variable
	    
	    new Employee().empId = 300;
	    // Create new object without reference and initialize (300) empID for the 
	    // current object 
	    
	    new Employee().name = "Anu";
	    // Create one more new object again without reference and initialize name (Anu) for the current object 
		
	    // On line 53 and 56, we have written anti-pattern of creating the object
	    // Unnecessary objects are getting created
	    // No reference objects are anti-patterns in Java
		
	    // Therefore, every object must have its own reference name
	    
	    
	    
	    
	    // Memory allocation for Objects:
	    // Assume we have a huge Java memory: divide into two parts for now
	    // Part1: Heap
	    // Part2: Stack
	    
	    // Heap: When you create an object (e.g. new Employee()), it will be stored in
	    // the "Heap" memory. For each object, the same process for storing the Object with the class 
	    // variables will be followed.
	    // So, all class variable (template variables) will be given to the Object e.g. name, empId, age etc. 
	    
	    // Stack: The Object reference variables (e.g. e2) will be stored in the "Stack" memory. 
	    
	    // So, Object reference variable which is stored in the "Stack" will be pointing towards the 
	    // object created (one copy of all the Class variables) in the "Heap" memory
		
		
		
	    //
		Employee e3 = new Employee();
		e3 = null;
		// e3.age = 35;// warning ==> Null pointer access: The variable e3 
		// can only be null at this location
		// System.out.println(e3.age);
		System.out.println(e3);

		// 'e3 = null' means 'e3' will break the connection with the object and start pointing to 'null'
		// Now the question is: who is referring the object when 'e3 = null'?
		// 'null' will be pointing towards the object now.
		
		// e3.empId = 400;// exception coming from here 
		// ==> Warning: Null pointer access: The variable e3 can only be null 
		// at this location. Example of Compile time warning and run time exception
		
		// System.out.println(e3.empId);// NullPointerException: NPE
		
		// e3.age = 32;// NullPointerException: NPE at line no. 97
		// System.out.println(e3.age);// NullPointerException
		
		
		/*Important*/
		// Heap Overflow: 
		// It may cause performance issue
		// This may happen if you exceed the memory allocated to "Heap".
		// This may happen due to unnecessary object creations e.g., "new Employee();", 
		// objects pointed by 'null' reference variable, valid Objects with valid reference variables
		// In this case Java has to free the memory.
		// For this JVm start deleting the unnecessary objects and 
		// JVM will keep the proper Objects with the proper reference variables
		// This can be done by utilizing GC or 'gc' i.e. Garbage Collector.
		// JVM continuously checks what is the current size of the "Heap" and it will monitor the heap size
		// JVM will check whether the 90% or more than 90% "Heap" is getting occupied or not,
		// then it will take decision to free the "Heap".
		// JVM will instruct the 'gc' to destroy the unnecessary Objects and null pointer Objects
		// This is called Auto-memory de-allocation.
	
		// Call 'gc' manually:
		// We can call 'gc' manually too
		System.gc();// call 'gc' manually
		// This is not guaranteed that it will get activated or not
		// Because it is always dependent on JVM
		// In case JVM takes the decision that memory is getting occupied completely then
		// only JVM will activate 'gc'. Not all the time whenever user wants to call 'gc'.
		
		// Instead of waiting for 'gc' getting activated, avoid creating unnecessary
		// Objects and null pointer Objects
		
		
		// So, how to correct line no. 87 problem
		// 1. Do not write like 'e3 = null;'
		// 2. Re-initialize the 'e3'.
		
		e3 = new Employee();
		// but due to 'null' we have created above Object
		// so, better avoid creating unnecessary null Objects
		
		e3.empId = 500;
		System.out.println(e3.empId);
		
		// Three types of Objects can be created
		// 1. A proper Object with proper reference
		// 2. An Object with no reference e.g. new Employee();
		// 3. AN Object with 'null' reference
		

	}

}
