package practice2026;

public class Feb21_ClassMethods {
	
	static void method1() {
		System.out.println("This is method1().");
	}
	
	public void method2() {
		System.out.println("This is method2().");
	}

	public static void main(String[] args) {
		
		method1();
		
		Feb21_ClassMethods o1 = new Feb21_ClassMethods();
		o1.method2();
		
	}

}
