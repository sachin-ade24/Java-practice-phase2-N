package method.overloading.concept;

public class StaticMethodOverloadingS13 {
	
	public static void click() {
		//Code
	}
	
	public static void click(String element) {
		//Code
	}
	
	public static void click(String userName, String password) {
		//Code
	}
	
	public static void click(String element, int timeOut) {
		//Code
	}
	

	public static void main(String[] args) {
		
		StaticMethodOverloadingS13.click();
		StaticMethodOverloadingS13.click("Sachin");
		StaticMethodOverloadingS13.click("SBA", "12345");
		StaticMethodOverloadingS13.click("Name", 5000);

	}

}
