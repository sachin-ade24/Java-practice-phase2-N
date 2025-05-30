package superKeywordConstructor;

public class BMW_S18 extends CarS18{
	
	public BMW_S18() {
		super();
		System.out.println("BMW_S18 -- default constructor..");
	}
	
	public BMW_S18(int a) {
		super();
		System.out.println("BMW_S18 one param -- constructor.." + a);
	}
	
	public BMW_S18(String name, int price) {
		//super keyword can be used to call parent class constructor
		//****Imp***
		//Note 1: The 'super' statement must be the first statement for
		//constructors only
		super(name, price);
		//now in this case it will not go to the default constructor
		//Note 2: we cannot use back to back 'super' statements
		
		System.out.println("BMW_S18 two parameters constructor " 
	                       + name + " " + price);
		//this.name = name;
		//this.price = price;
	}
	
	
	//Case 1: 
	//if you want to create a default or parameterized or both
	//constructors in child class and call it in test class
	//then, first of all it will check parent's default constructor
	//and then goes to the child constructor
	//if parent does not have a default constructor then, JVM will create
	//a hidden default constructor for the parent class, and then it
	//will call child class constructor
	//in this way you will not see an error in child or test class
	
	//Case 2:
	//if you are going to create a default or parameterized constructor in
	//child class and
	//If you have a parameterized constructor in parent class
	//then, in any case you need to create a default constructor in parent
    //class otherwise it will show an error in the child class
    //but, if you already have a parent class default constructor
	//then it will not show an error in child or test class
}
