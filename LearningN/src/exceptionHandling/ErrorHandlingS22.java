package exceptionHandling;

public class ErrorHandlingS22 {
	
	//Handling stack overflow error is meaning less
	//because once Stack gets filled, we cannot use memory stack further
	public static void m1() {
		System.out.println("m1 method..");
		try {
			m2();
		}catch(Error e) {/*Error -- Unchecked*/
			System.out.println("Your stack is full..");
			//e.printStackTrace();
		}
	}
	
	public static void m2() {
		System.out.println("m2 method..");
		m1();
	}

	public static void main(String[] args) {
		
		//Error vs Exception --> both are child of Throwable class
		//Error comes due to the system not because of your code
		
//		try {
//			System.out.println("Some logic..");
//		}catch(Error e) {/*Child -- Throwable*/
//			System.out.println("Some error is coming..");
//			e.printStackTrace();
//		}catch(Throwable e) {
//			//Throwable can handle both:
//			//Error
//			//Exception
//			System.out.println("Some Throwable error is coming..");
//			e.printStackTrace();
//		}
		
		ErrorHandlingS22.m1();//StackOverflowError

	}

}
