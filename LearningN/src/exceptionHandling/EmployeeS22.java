package exceptionHandling;

public class EmployeeS22 {

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		//int i = 9/0;//Exception occurs here
		//ArithmeticException
		//as soon as exception thrown, program will be terminated
		
		//therefore "Bye!" will not get printed
		//System.out.println("Bye!");
		
		//But if you want to continue execution then,
		//we can use concept of exception handling.
		//this way we can print "Bye!" and execute the lines come after
		//"Bye!"
		
		
		//exception handling:
		
		try {
			int i = 9/0;
			//if exception comes then only it will immediately
			//go to 'catch' block
			//else it will continue execution without entering into the 
			//'catch' block.
			
			//if we write something after the line at which we get 
			//exception that line will not get executed
			//e.g.
			System.out.println("Hello..");
			//the above line will get skipped, because as soon as we
			//get exception at "int i = 9/0;", the program goes to
			//'catch' block.
			//but, it is not a good practice to write code, after the line
			//at which get the exception
		}
		catch(ArithmeticException e) {
			//Java will create the Object for "ArithmeticException e"
			//internally.
			
			//reporting part
			//what exactly coder want to report after this exception 
			//occurs
			System.out.println("AE is coming..");
			e.printStackTrace();
			//if we comment above two lines, it will not give information
			//we will not get any report as to why this exception occurred
		}
		//this way we handled the exception..	
		System.out.println("Bye!");
		
		try {
			int p = 0/0;
		} catch(ArithmeticException e){
			//report
			System.out.println("AE is coming..");
			e.printStackTrace();
		}

		System.out.println("Bye world!");
		
	}

}
