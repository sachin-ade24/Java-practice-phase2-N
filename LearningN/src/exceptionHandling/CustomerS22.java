package exceptionHandling;

public class CustomerS22 {
	
	String name;

	public static void main(String[] args) {

		System.out.println("print the customer info..");

		try {
			//int i = 5/0;//ArithmeticException
			//it will immediately go to 'catch' of 'AE'
			CustomerS22 Obj = new CustomerS22();
			Obj = null;//NullPointerException
			System.out.println(Obj.name);
			//to handle the above nullPointer exception
			//we need to mention that exception class in the parenthesis
			//of the catch
			//if we don't mention it and if we mention any other exception
			//class other than nullPointer exception, then it will not
			//execute the 'catch' block.
			//the reason is the catch block has to be executed for
			//the exception which is mentioned in its parenthesis.
		} /*catch(ArithmeticException e)*/ 
		catch(NullPointerException e){
			//report
			System.out.println("NPE is coming..");
			e.printStackTrace();
		}
		// to handle two or more different exceptions at a time, 
		//we can write one 'try'
		//block and multiple 'catch' blocks
		
		System.out.println("bye..bye..");
		
		try {
			int i = 5/1;//ArithmeticException
			CustomerS22 Obj = new CustomerS22();
			Obj = null;//NullPointerException
			System.out.println(Obj.name);
		} catch(ArithmeticException e){
			//report
			System.out.println("AE is coming..");
			e.printStackTrace();
		} catch(NullPointerException e){
			//report
			System.out.println("NPE is coming..");
			e.printStackTrace();
		}
		//duplicate 'catch' blocks are not allowed, means we cannot 
		//repeat the exception class name in the parenthesis of catch		
		System.out.println("byee..");
		
		//
		//Now we will be using parent class of all exceptions in
		//the Java i.e. 'Exception' class
		try {
			int i = 55/0;
		} catch(Exception e) {
			System.out.println("Some exception is coming..");
			e.printStackTrace();
		}
		//but writing a single 'catch' block with 'exception' class
		//write multiple 'catch' block
		//because just using 'exception' class, we will not get that
		//what is the exact exception
		
	}

}
