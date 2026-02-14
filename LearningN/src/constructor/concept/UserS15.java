package constructor.concept;

public class UserS15 {
	
	//1. Constructor is helping to construct the object properly
	//2. Constructor is helping to prevent unnecessary object creation
	//3. Constructor is helping to initialize the class instance variable 
	//with the local variable using 'this' keyword
	
	
	String name;
	int age;
	String city;
	boolean isActive;
	double salary;
	
//	public UserS15() {
//		System.out.println("Default constructor.");
//	}
	
	//right way to write code
	public UserS15(String name, int age) {
		this.name = name;//in case both global and local has same name
		this.age = age;//in case both global and local has same name
		System.out.println(name + " " + age);
	}
	
	//Not good way to practice
	public UserS15(int age1, String name1) {
		name = name1;
		age = age1;
	}
	
	public UserS15(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public UserS15(String name, int age, String city, boolean isActive, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.isActive = isActive;
		this.salary = salary;
	}

	public static void main(String[] args) {
		
		//UserS15 u1 =  new UserS15();//invalid
		//not possible to create the object without a default constructor
		
		UserS15 u1 =  new UserS15("Sachin", 35);
		
		//before assigning local variable values to global variables
		//System.out.println(u1.name);//null
		//System.out.println(u1.age);//0
		
		//after assigning local variable values to global variables
		System.out.println(u1.name);//Sachin
		System.out.println(u1.age);//35
		
		
		UserS15 u2 =  new UserS15("Nitin", 34, 30.25);
		System.out.println(u2.name);
		System.out.println(u2.age);
		System.out.println(u2.salary);
		System.out.println(u2.isActive);
		System.out.println(u2.city);
		
		UserS15 u3 = new UserS15("Sanju", 25, "Pune", true, 24.55);
		System.out.println(u3.name);
		System.out.println(u3.age);
		System.out.println(u3.isActive);
		System.out.println(u3.city);
		System.out.println(u3.salary);
	}

}
