package JavaSessions;

public class DataTypesConcept {

	public static void main(String[] args) {

		// Data types: 
		// 1. Primitive data types
			//1.a) Numeric type: 
				// 1.a.1) Integral value:
		        	//i) Integer: byte, short, int, long
					//ii) Floating-point: float, double
				// 1.a.2) Character: char a, b, A, 0, $, #, @, & etc.
		
			//1.b) boolean: true/false
		
		// 2. Non-Primitive data types: Object, class, Interface, Arrays, ArrayList
		
		
		
		// 1. byte: 
		// size: 1 byte = 8 bits
		// range: -128 to +127 ==> -(2^7) to (2^7)-1
		byte b = 1;
		// byte b = -129; // not allowed
		// byte b = 128 // not allowed
		byte b1 = -55;
		byte b2 = -128;
		byte b3 = 127;
		byte b4 = 0;
		// getting warnings above because we are initializing them and not using 
		// so, unnecessary utilization of memory should be avoided	
		byte n = 25; // initial value 
		// byte n = 35 // not allowed
		n = 35; // 35 --> latest value // allowed --> now the value of n will be 35 not 25
		// print
		System.out.println(n);
		// byte bi1 = 55b; // not allowed
		// byte bi2 = 55B; // not allowed
		
		
		
		// 2. short:
		// size: 2 bytes = 2 x (8 bits) = 16 bits
		// range: -32768 to 32767 => -(2^15) to (2^15)-1
		short sh = 1000;
		short sh1 = 32767;
		short sh2 = -32768;
		// short sh3 = 32768; // not allowed
		// short sh3 = -32769; //  not allowed
		// short sh3 = 234S;
		// short sh3 = 432s;
		
		
		// 3. int:
		// size: 4 bytes = 4 x (8 bits) = 32 bits
		// range: -2147483648 to 2147483647 ==> -(2^31) to (2^31)-1
		int i = 10;
		int total = 677656;
		int finalBillAmount = 90909099;
		// int i2 = 12.33; // not allowed
		int i1 = (int) 12.33; // allowed
		// int in = 1234i; // not allowed
		// int in1 = 2345I; // not allowed
		
		
		// 4. long: 
		// size: 8 bytes = 8 x (8 bits) = 64 bits
		// range: -(2^63) to (2^63)-1
		long l = 2147483648L;
		long l1 =  2147483649l;
		long ln = 2147483647;// Can be initialized by using int
		System.out.println(l);
		// long example: world population, distance between two planets
		
		
		
		// 5. float:
		// Size: 4 bytes
		// Range: after the '.' you can take 6 to 7 digits
		// float f = 33.11; // not allowed
		float a = 12.33f;
		float a1 = 33.12F;
		float m = (float) 12.35; // if you don't want to write after the float number
		//'F' or 'f'
		float m1 = 2000;// no need to write 'f or F' here. If you want you can write.
		System.out.println("============");
		System.out.println((float)34.56);
		System.out.println(14.55);// treats as double
		System.out.println(14.55f);// treats as float
		
		System.out.println("============");
		
		
		// 6. double
		// Size: 8 bytes 
		// Range: after '.' you can take up to 15 digits
		double d = 123.456;
		double d1 = 0.9999999;
		double d2 = 9999;
		double d3 = 12479d;//allowed
		double d4 = 1234567.989D;//allowed
		double d5 = (double) 11.22f;// allowed
		double d6 = (double) 33.51f;// allowed
		System.out.println("d1: "+d1);
		System.out.println("d5: "+d5);
		System.out.println("d6: "+d6);
		System.out.println("============");
		
		
		// 7. char
		// Single digit value
		// Size: 2 bytes = 16 bits
		// unicode: ASCII 
		// char c = "a"; // not allowed
		char c = 'a';
		char c1 = 'w';
		// addition, subtraction, multiplication, division of chars is allowed
		char c2 = (char) 1;// allowed
		char c3 = (char) 12.33; // allowed
		char c4 = ' '; // only one space char is allowed
		char c5 = '$';
		System.out.println("Char" + c2);// O/P: Char
		System.out.println(c3);// O/P: 
		System.out.println(c4);
		System.out.println(c5);

		// char c6 = '10'; // not allowed. It can store only one character
		
		System.out.println("============");
		
		// boolean:
		// Size: 1 bit
		// Range: true/false
		boolean flag = true;
		boolean f1= false;
		System.out.println(10<5);
		System.out.println(10>5);
		
		// primitive data type: memory size is already fixed and predefined,
		// no need to create an object for primitive data initialization
		// Java is strict type ==> data type is mandatory to define
		// Java is compile-time language unlike JavaScript. It will show the error 
		// if you don't mention the data type of a variable 
		
		// String: is a class and class is non-primitive data type
		
		

	}

}
