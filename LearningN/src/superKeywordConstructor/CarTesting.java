package superKeywordConstructor;

public class CarTesting {

	public static void main(String[] args) {
		
		//End of lecture
		//Our topic of discussion is 'super'
		//of we want call a specific constructor of the parent class
		//and we don't want default constructor any more the use 
		//the 'super' keyword to call that specific constructor of parent
		//class
		//in this case it will not follow the Java rule for default
		//constructor
		
		BMW_S18 b3 = new BMW_S18(10);

		//Start of lecture
		BMW_S18 b1 = new BMW_S18();
		//o/p:
		//CarS18 -- default constructor..
		//BMW_S18 -- default constructor..
		
		BMW_S18 b2 = new BMW_S18("BMW", 50);
		//o/p:
		//CarS18 -- default constructor..
		//BMW_S18 two parameters constructor BMW 50
		
		//CarS18 c1 = new BMW_S18("BMW", 50);
		//o/p:
		//CarS18 -- default constructor..
		//BMW_S18 two parameters constructor BMW 50
		
		//CarS18 c2 = new CarS18("Car", 5);
		//o/p
		//CarS18 -- constructor.. Car 5
		
		//Three cases
		
		//Case 1:
		//1. If you don't create a child class constructor, but your parent
		//has a default constructor in the parent class then, 
		//according to Java rules it will go and call parent class 
		//constructor first
		//=================================================
		//2. If both parent and child do not have constructors then,
		//JAVA/JVM will create default hidden constructors in the 
		//background
		//=================================================
		
		//CASE 2: Defined a default constructor in 'parent' class
		//when you call a child constructor or create an Object of the
		//child constructor then:
		//This way, it will go check whether BMW has a default constructor,
		//if yes, then immediately it will check whether BMW is extending
		//Car i.e. whether BMW has a parent class,
		//if yes, it will go to parents constructor and call it first,
		//and then, it will call BMW default constructor
		//=================================================
		//now, if you want to call only BMW class i.e. child class
		//constructor, and for doing so if you commented the Car class
		//i.e. constructor, immediately the following line will show error
		//'BMW_S18 b = new BMW_S18();'
		//Error: Implicit super constructor CarS18() is undefined. 
		//Must explicitly invoke another constructor
		//=================================================
		//This is happening because the BMW has a parent class i.e. BMW
		//is extending Car class.
		//So according to Java rules, 
		//we must have to go to parent constructor first, then only we can
		//go to child class default constructor
		//=================================================
		//So, this is applicable for, child default constructor  and
		//constructor with parameters
		//means even though you have child constructor with parameters
		//it will go and check the parent default constructor first
		//=================================================
		
		//CASE 3: No default constructor defined in 'parent' class
		//when you call child constructors (parameterized or default)
		//or create a Object (for the child constructor) then:
		//In this case if you define a default or parameterized 
		//constructor in child class, it will not show an error
		//because according to Java rules,
		//Java/JVM will definitely go to the parent
		//to check whether parent have a default constructor or not
		//if no, it will add or create a hidden 
		//default constructor in the background for parent
		//=================================================
		//But note that if you have added a parameterized constructor in the parent,
		//not the default constructor, then again it will show error
		//it will check for default constructor of the parent before 
		//calling child constructor
		//=================================================
	}

}
