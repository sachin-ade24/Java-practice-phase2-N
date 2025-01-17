package constructor.concept;

public class EmployeeS15 {
	
	String name;
	int age;
	String city;
	boolean isActive;
	double salary;
	
	//Constructors helps to construct the object
	//name of constructor is same as class name
	//constructor is not a function
	//constructor: no return, no void, no return type
	//You cannot create constructor inside any method or main method
	//We can pass parameters in constructor
	
	//The moment you create the object, 
	//respective constructor will be called
	
	//If the default constructor is not available in the class
	//JVM will add one default hidden constructor in the class at the
	//run time
	//Constructor is not part of 'heap' memory
	
	//Constructor can be overloaded
	
	//constructor
	public EmployeeS15() {
		System.out.println("default constructor.. 0 param.");
	}
	
	//Duplicate constructor is not allowed
	//In order to call the parameterized constructor
	//You need to create relevant object
	public EmployeeS15(int a) {
		System.out.println("default constructor.. 1 param. " + a);
	}
	
	public EmployeeS15(int a, int b) {
		System.out.println("default constructor.. 2 param. " + a + b);
	}
	
	public EmployeeS15(String a, int b) {
		System.out.println("default constructor.. 2 param. " + a + b);
	}
	
	public EmployeeS15(int b, String a) {
		System.out.println("default constructor.. 2 param. " + a + b);
	}

	public static void main(String[] args) {

		EmployeeS15 e1 =  new EmployeeS15();
		//O/P: default constructor.. 0 param
		//Constructor was called immediately
		
		EmployeeS15 e2 =  new EmployeeS15(10);
		
		EmployeeS15 e3 =  new EmployeeS15(10, 20);
		
		EmployeeS15 e4 =  new EmployeeS15(10, "Sachin");
		
		EmployeeS15 e5 =  new EmployeeS15("Sachin", 10);
		
		//
		e1 = new EmployeeS15(14);
		e1 = new EmployeeS15(18, 25);
		
		//
		e2 = new EmployeeS15(11, 2);
		e2 = new EmployeeS15("Tom", 1);
		
		//
		e5 = new EmployeeS15(10);
		
		//need to overcome the following problem of creating objects
		//every time, repeating code again and again
		
		//EmployeeS15 e1 =  new EmployeeS15();
		//e1.name = "Tom";
		//e1.age = 20;
		//e1.city = "NY";
		//e1.isActive = true;
		//e1.salary = 12.33;
		
		//EmployeeS15 e2 =  new EmployeeS15();
		//e2.name = "Tom";
		//e2.age = 20;
		//e2.city = "NY";
		//e2.isActive = true;
		//e2.salary = 12.33;
		
		//EmployeeS15 e3 =  new EmployeeS15();
		//e3.name = "Tom";
		//e3.age = 20;
		//e3.city = "NY";
		//e3.isActive = true;
		//e3.salary = 12.33;
		

	}

}
