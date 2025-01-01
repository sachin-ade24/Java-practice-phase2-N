// JAVA_10_3

package JavaSessions;

public class FinalKeyword {
	
	// Part 2:
	static String name;// allowed
	// static final String surname;// not allowed
	// Error: The blank final field surname may not have been initialized
	static final String surname = "Ade";// allowed
	// Note:
	// You must have to initialize the static final variable, meaning
	// you have to provide the initial value for a "static final variable".
	int i;// allowed
	// final int u;// not allowed
	// Error: The blank final field u may not have been initialized
	static int u;// allowed
	// static final int t;// not allowed
	// Error: The blank final field t may not have been initialized
	static final int t = 0;// allowed ==> initialized the final variable
	final static boolean b = true;// allowed 
	// changed the sequence of 'static' and 'final' keywords
	// int static final y = 1;// not allowed
	// int final static y =1;// not allowed
	
	// before JDK 1.8: (permanent generation memory is a fixed memory)
	// We know that Garbage collector is only for "heap" memory. It will not 
	// go and destroy the data stored in the static memory.
	// So, the Garbage collector is for "heap" only 
	// not for the static memory (permanent generation memory) ==> before JDK 1.8
	// The problem with this approach was, if static memory become fully occupied, 
	// we cannot use that for saving static variables further.
	// So, for this reason after JDK 1.8, they created a meta-space or CMA,
	// which is dynamic in nature. It can grow if it reaches to its upper limit 
	// of the allotted memory. 
	// It (meta space) will start taking memory from the RAM of your local machine
	

	// Part 1:(start reading from here)
	public static void main(String[] args) {
		
		final int days = 7;
		int salary = 100*days;
		
		System.out.println(salary);// 700
		// it looks like there is a bug in this code
		// so, any one can manipulate the value of the days in a week
		// if we don't write 'final' for it
		
		// days = 10;
		// salary = salary + 100*3;
		// salary = 100*days;
		// System.out.println(salary);// 1000
		
		// now, if I make int days (on line no. 7) final
		// like, final int days = 7;
		// then compiler will show error at line no. 15
		
		// Error: The final local variable days cannot be assigned. 
		// It must be blank and not using a compound assignment
		
		// no need to repeat salary formula again,
		// so, commenting line no. 17 and 18
		
		
		// now, can I use static keyword for main method variable?
		// The answer is No.
		
		// Static keyword is reserved only and only for class/global variable
		// not for method variable or local variable
		// e.g.
		// static int week = 5;// not allowed for local variable
		// Error: Illegal modifier for parameter week; only final is permitted
		
		
		

	}

}
