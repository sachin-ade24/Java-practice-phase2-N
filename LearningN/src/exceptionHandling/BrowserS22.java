package exceptionHandling;

public class BrowserS22 {
	
	String name = "chrome";
	
	public void open() {
		System.out.println("start");
		
		try {
			int i= 9/0;
			BrowserS22 obj = new BrowserS22();
			obj = null;
			System.out.println(obj.name);
		}
		//following 'catch' block sequence should be followed
		/*Unchecked Exception*/
		catch(ArithmeticException e){/*Child -- RuntimeException*/
			System.out.println("AE is coming..");
			e.printStackTrace();
		}
		/*Unchecked Exception*/
		catch(NullPointerException e){/*Child -- RuntimeException*/
			System.out.println("NPE is coming..");
			e.printStackTrace();
		}
		/*Unchecked Exception*/
		catch(RuntimeException e) {/*Parent*/
			System.out.println("RuntimeException is coming..");
			e.printStackTrace();
		}
		catch(Exception e) {/*Grand parent*/
			System.out.println("Exception -- some exception is coming..");
			e.printStackTrace();
		}
		catch(Throwable e) {/*Great grand parent*/
			System.out.println("Throwable -- some exception is coming..");
			e.printStackTrace();
		}
		
		System.out.println("End..");
	}

	public static void main(String[] args) {

		BrowserS22 br = new BrowserS22();
		br.open();


	}

}
