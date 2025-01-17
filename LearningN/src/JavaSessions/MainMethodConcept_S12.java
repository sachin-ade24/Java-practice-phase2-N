package JavaSessions;

public class MainMethodConcept_S12 {

	// Business logic should be written in the methods
	public void method() {
		System.out.println("Business logic");
	}
	
	//Main method is a caller method or it is a user
	public static void main(String[] args) {
		
		//why void?
		// JVM calls main method
		// never return anything from main method
		// no business logic should be written in main method
		// main method will call other methods
		
		//why static?
		//JVM calls main method, and if it is non-static then,
		//JVM has to create an object for main method and keep in Heap 
		//memory. It will increase memory complexity.
		//So, JVM is not creating any object for main method
		
		//why public?
		//it can be called from anywhere by JVM, no restriction to call it.
		//Publicly available.
		
		//why main?
		//JVM understands only 'main'
		//JVM understands this signature: 
		//public static void main(String[] args)
		//or
		//public static void main(String args[])
		//String array variable can be anything.. args, arg, a , b, c etc.
		
		System.out.println(args[0]);
		//Gives exception:
		//ArrayIndexOutOfBoundsException
		
		//So, JVM is supplying blank array in the argument of the 
		//main method
		
		System.out.println(args.length);
		//Gives exception:
		//ArrayIndexOutOfBoundsException
		
		//Signature should be in sequence
		//public static void main(String[] args) ==> Valid
		//public static void main(String args[]) ==> Valid
		//public void static main(String args[]) ==> Invalid
		
		
	}

}
