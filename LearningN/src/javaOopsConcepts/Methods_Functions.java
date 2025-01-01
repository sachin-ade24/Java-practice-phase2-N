package javaOopsConcepts;

public class Methods_Functions {
	
	int s = 5;//non-static class variable
	static int r = 4;//static class variable
	
	public static void test() {
		System.out.println("This is my test method");
	}
	
	public void method1() {
		System.out.println("This is method1");
	}
	
	public void method2(int i, String s, boolean b, float f, char c) {
		System.out.println("*********method2 started*********");
		System.out.println(i+c);
		System.out.println((int)c + (char)i);
		System.out.println((int)c);
		System.out.println((char)i);
		System.out.println(b);
		System.out.println((float)i);
		System.out.println((char)f);
		System.out.println((float)c);
		System.out.println((int)f);
		System.out.println("*********method2 ended**********");
	}
	
	public int intNonStaticMethod() {
		int a = s+1;
		System.out.println("This is my non-static integer return type method.");
		//System.out.println(a);
		return a;
	}
	
	public int mi1(int a) {
		int b = a+s;
		return b;
	}
	
	public int mi1(int a, int b) {
		return a-b;
	}
	
	public String ms1(String s1, String s2){
		//return s1+s2;
		return s1.concat(s2);//returns boolean data
	}
	
	public boolean mb1(String s1, String s2) {
		return s1.equalsIgnoreCase(s2);//returns boolean data
	}
	
	public boolean mb2() {
		return !true;
	}
	
	public boolean mb3() {
		return !mb2();
	}
	
	public int mi2() {
		test();//a static method can be called by a non-satic method
		return 1;
	}
	
	public static void method3() {
		Methods_Functions mf = new Methods_Functions();
		mf.mi2();//a static void method is calling a non-static method
	}

	public static void main(String[] args) {
		
		//Static function
		//If the function is static, we can directly call the function directly
		//or with its class name
		//Methods_Functions.test();//Allowed
		test();//Allowed
		
		//Non-static
		//create an object
		Methods_Functions obj = new Methods_Functions();
		
		//
		obj.method1();
		System.out.println(obj.intNonStaticMethod());//6
		
		//
		obj.method2( 4, "Java", true, 4.4f, 'A');
		
		//Non-static with int argument and return type
		System.out.println(obj.mi1(10));//15
		
		//Non-static with arguments and return type
		System.out.println(obj.mi1(10, 7));//3
		System.out.println(obj.mi1(10, r));//6
		System.out.println(obj.mi1(obj.s, r));//1
		
		System.out.println(obj.mb1("sachin", "Sachin"));//true
		
		System.out.println(obj.mb2());//false
		
		System.out.println(obj.mb3());//true
	}

}
