package method.overloading.concept;

public class EmployeeS13 {
	
	//Duplicate functions are not allowed in a class
	//Cannot create a function inside a function
	//Can call a function inside another function
	//A function can be return through another function
	
	//Method overloading: 
	//Within the same class, if you have multiple functions with:
	//1. Same name
	//2. Different number of parameters
	//3. Different sequence of parameters
	//4. Return type does not matter
	//Functions with same name and different arguments is possible
	
	public void click() {
		System.out.println("Method: click()");
	}
	
	public void click(String element) {
		System.out.println("Click on given " + element);
	}
	
	public void click(String element, int timeOut) {
		System.out.println("Click on given " + element + " with " + timeOut + ".");
	}
	
	public void test() {
		System.out.println("Method: test()");
	}
	
	public void test(String s) {
		System.out.println("Method: test(String s)");
	}
	
	public void test(String s, int i) {
		System.out.println("Method: test(String s, int i)");
	}
	
	public void test(int i, String s) {
		System.out.println("Method: test(int i, String s)");
	}
	
	public static void main(String[] args) {
		EmployeeS13 emp = new EmployeeS13();
		emp.test();
		emp.test("test");
		emp.test("test", 1);
		emp.test(1, "test");
	}

}
