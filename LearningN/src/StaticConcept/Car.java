// JAVA_10_1

package StaticConcept;

public class Car {
	
	String name;
	int price;
	String model;
	static final int wheels = 4;// Common property with same value
	
	final String expectedEngineQuality = "Good";

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 50;
		c1.model = "x3";
		// c1.wheels = 4;
		
		Car c2 = new Car();
		c2.name = "Audi";
		c2.price = 60;
		c2.model = "q3";
		// c2.wheels = 4;
		
		Car c3 = new Car();
		c3.name = "Honda";
		c3.price = 20;
		c3.model = "city";
		// c3.wheels = 4;
		
		// In above initialization of the parameters the "wheels" is common
		// So, wheels is an integer and occupies 4 bytes for each Object
		// it means for 3 Objects 4*3=12 bytes
		// if we create 100 such Objects it will become 4*100=400 bytes
		// So, this is not good thing, we are unnecessarily wasting the memory by
		// initializing same parameter with same value
		
		
		//==========================================================================
		
		// Objects will never hold the "static" property
		// So, wheels will not be saved into the heap memory with other properties in
		// the Objects.
		// So, for name, price, model one-one copy will get created and given to
		// each Object but wheels will not be copied to the Objects, so static property
		// will not be part of the Objects
		
		// There is separate memory allocation for the static property
		// Earlier that memory was called as "permanent generation", it got
		// renamed after JDK 1.8 and
		// It is now called as => Meta space
		// This area is also called CMA ==> Common memory allocation
		
		// So, now for wheels only one copy will be created and will be saved 
		// into the Static memory OR meta space OR CMA.
		// One should save only and only common property with same value in
		// meta space or CMA
		
		System.out.println(c1.name + " " + c1.price + " " + c1.model + " " + Car.wheels);
		System.out.println(c2.name + " " + c2.price + " " + c2.model + " " + Car.wheels);
		System.out.println(c3.name + " " + c3.price + " " + c3.model + " " + Car.wheels);
		
		// o/p:
		// BMW 50 x3 4
		// Audi 60 q3 4
		// Honda 20 city 4
		
		
		// Access the static variable:
		
		// 1. using the class name
		System.out.println(Car.wheels);// allowed
		// System.out.println(Car.price);// not allowed
		// Error: Cannot make a static reference to the non-static field Car.price
		// System.out.println(Car.price);// not allowed
		
		// 2. can be accessed directly within the Class
		System.out.println(wheels);// allowed
		// but always use class name to call static property
		// its a good practice to use class name to call static property
		
		// for non-static
		// System.out.println(name);// not allowed
		// System.out.println(Car.name);// not allowed
		// Cannot make a static reference to the non-static field name
		// Object property must be accessed via reference variable name
		
		//
		System.out.println(c1.wheels);// allowed but gives a warning
		// Warning: The static field Car.wheels should be accessed in a static way
		// Its a bad practice to use Object variable for call a static variable
		// Because the Object variable will be sitting into the "Stack" memory 
		// it has to go to the CMA/meta-space and has to access it
		
		// Car.wheels = 5; // or c3.wheel = 5; or c2.wheel = 5; or c1.wheel = 5;
		
		System.out.println(c1.name + " " + c1.price + " " + c1.model + " " + Car.wheels);
		System.out.println(c2.name + " " + c2.price + " " + c2.model + " " + Car.wheels);

		// o/p:
		// BMW 50 x3 5
		// Audi 60 q3 5
		
		// It looks like, we introduced bug in our code by changing the value of
		// wheels to 5 at line no. 95
		
		// to fix it: use 'final' keyword
		// As soon as I write final for the static variable compiler shows 
		// an error  ==> The final field Car.wheels cannot be assigned
		
		// o/p:
		// BMW 50 x3 4
		// Audi 60 q3 4
		
		// After introducing 'final' keyword for a static or non-static variable
		// you cannot change the value of the property
		// c1.expectedEngineQuality = "nice";// not allowed
		// Error: The final field Car.expectedEngineQuality cannot be assigned
		
		

	}

}
