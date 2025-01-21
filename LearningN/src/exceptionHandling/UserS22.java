package exceptionHandling;

public class UserS22 {

	public static void div(int a, int b) {
		System.out.println("division:");
		int z=0;
		try {
			z= a/b;//this line may cause problem
		}catch(ArithmeticException e){
			System.out.println("AE is coming.. please do not pass: b=0");
			e.printStackTrace();
		}
		System.out.println(z);
	}
	
	

	public static void main(String[] args) {
		
		UserS22.div(10, 0);//this line will not cause problem
		//because user can supply any value
		
		System.out.println("Hello..");

	}

}
