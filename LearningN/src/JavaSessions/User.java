package JavaSessions;

public class User {
	
	// Class variable
	// int i = 10;// Global or Class variable
	
	// User ==> Class variables
	String name;
	int age;
	String city;
	boolean isActive;
	double salary;
	

	public static void main(String[] args) {
		
		int in;
		
		// Class is a template/category/blueprint (for the objects)
		// Vehicle ==> Class ==> Template: nameOfVehicle, color, price, engine
		// Objects: BMW, Audi, Honda
		
		// Customer ==> Class: name, dateOfBirth, age, city, phone, id
		// Object: customer1(Naveen, 10/10/1985, 30, Pune, 1234567890, 1432)
		// Object: customer2(Ravi, 1/1/1989, 27, Pune, 1234567891, 1422)
		
		// Local variable
		// int i = 10;// Local variable
		// Scope of the above variable is within the method

		
		// Use ==> User ==> Class variables
		// For this we have to create an object
		
		User u1 = new User();
		
		in = 5;
		System.out.println(in);
		// u1.in = 10; // not allowed
		// System.out.println(u1.in); // not allowed
		// I cannot call the main method variable using the object
		// In fact, no need to call the main method variable using the object
		
	    // Object creation:  className name = new className();
		
		//                     LHS          =           RHS
		
		// LHS => Class with object reference name: u1
		// RHS => Object: new User()
		
		// Memory utilization:
		// created object in the memory ==> new User()
		// Referred by u1
		// Now Java will create copies of the Class variables 
		// How many copies? ==> one copy of each class variable gets created and then that will be referred by
		// reference variable 'u1'. You can say that a copy of the group of class variables
		// (e.g. copy of name, age, city, isActive, salary) is given to 'u1' (for referring purpose)
		// Consider if you are going to create 100 objects like 'u1' e.g. u2, u3, u4, u5 etc.
		// Then 100 copies of each class variables will be created and given to each reference variable
		// like 'u1'. So, u100 will also get a copy.
		
		
		// Access the class variables:
		// System.out.println(name);// not allowed
		System.out.println(u1.name);// can be printed directly ==> o/p: null => The default value of the String
		// because we didn't provide the value of the string
        // u1.name;// not allowed ==> Syntax error, insert "VariableDeclarators" to complete 
        // LocalVariableDeclaration
		
		System.out.println();
		System.out.print(u1.name + " ");
		System.out.print(u1.age + " ");
		System.out.print(u1.city + " ");
		System.out.print(u1.isActive + " ");
		System.out.print(u1.salary);
		
		// or
		System.out.println();
		System.out.println(u1.name + " " + u1.age + " " + u1.city + " " + u1.isActive + " " + u1.salary);
		
		System.out.println();
		
		String s = u1.name;
		System.out.println(s);// null => The default value of the String 
		// because we didn't provide the value of the string
		
		System.out.println("=======================================");
		
		u1.name = "Tom";// You have just initialized the 'name' value by using reference variable 'u1'
		// in the same way initialize rest of the class variables using 'u1'
		u1.age = 20;
		u1.city  = "Pune";
		u1.isActive = true;
		u1.salary = 12.33;
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city + " " + u1.isActive + " " + u1.salary);
		
		
	}

}
