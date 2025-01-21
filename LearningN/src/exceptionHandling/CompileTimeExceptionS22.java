package exceptionHandling;

import java.io.File;

public class CompileTimeExceptionS22 {

	public static void main(String[] args) {
		
		System.out.println("Hi..");
		
		/*Checked Exception -- Compile time exceptions*/
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("bye..");
		
		File file = new File("test.pdf");
		//above line may give you 'FileNotFoundException'

	}

}
