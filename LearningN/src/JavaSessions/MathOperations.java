package JavaSessions;

public class MathOperations {

	public static void main(String[] args) {

		int a = 10;
		System.out.println(a/2);
		System.out.println(a/3);// answer is 3.333 but gives 3 because 'a' is
		//an integer as well as '3' is an integer
		System.out.println(9.0/2);// (at least) one of the number is float/double so 
		//output will be in the float/double
		
		System.out.println("============================================");
		
		// System.out.println(9/0);// ArithmeticException ==> AE (both are integer)
		System.out.println(9/0.0);// Infinity
		System.out.println(9.0/0);// Infinity
		System.out.println(9.0/0.0);// Infinity
		System.out.println(0.0/0.0); // NaN ==> Not a Number
		System.out.println(0/0.0); // NaN ==> Not a Number
		System.out.println(0.0/0); // NaN ==> Not a Number
		// System.out.println(0/0); // ArithmeticException ==> AE (both are integer)
		System.out.println(0/9);// 0
		System.out.println(9.0f/0);// Infinity

		System.out.println("===========================================");
		
		System.out.println();
		System.out.println((float)a/3);// allowed but will give you answer 3.333
		System.out.println(a/3f);// allowed but will give you answer 3.333
		System.out.println();
		// System.out.println((a/3)f);// not allowed
		// System.out.println((a/3)F);// not allowed
		
		// float f = (a/3)f;// not allowed
		float f = 14/3;// allowed but will give you answer 4.0 because 
		// both digits (14 and 3) are in integers
		float f2 = 14/3f;// allowed and gives you 4.666
		float f3 = 14f/3f;// allowed and gives you 4.666
		float f1 = (float)14/3;// allowed and gives you 4.666
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		
		
		System.out.println("===========================================");
		
		System.out.println(0.1+0.1);//0.2
		System.out.println(0.1+0.2);//0.30000000000000004

	}

}
