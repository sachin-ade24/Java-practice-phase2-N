package constructor.concept;

public class FunctionVsConstructor {
	
	//
	//1. Name of the constructor must be class name, 
	//but function name can be anything
	//2. Avoid function name as class name: it will give a warning
	//3. Constructor cannot return anything. It is neither returns 
	//anything nor void in nature, but function can be void or return
	//something e.g. Object, String, int, double etc.
	//4. Constructor will be called immediately after creating an object,
	//but the function will be called either using 
	//Object reference variable or by class name or directly by its name
	//5. Both the constructors and functions can be overloaded
	//6. Constructor is helping me to initialize 
	//class instance/global variables from the local variables 
	//using 'this' keyword
	//7. Constructor is generally used to provide values to the
	//global variables (initialize global variables), 
	//but functions are used to write the business logics
	//So, constructor will never be used to write the business logic.
	//We use functions to do some calculations, write some business logic
	//and we expect something to return from a function

	public static void main(String[] args) {}

}
