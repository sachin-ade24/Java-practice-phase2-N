package encapsulation.oops;

public class SeleniumS16 {
	
	//We cannot create
	//private class
	//Static class
	//We can create a public, final and abstract class
	
	//We can comment/hide the private constructor
	//but this way, one problem may occur
	//That is, user mistakenly and unnecessarily 
	//can create object in some other class
	//so, by keeping private constructor, we are restricting user,
	//restraining user from creating the object of
	//the 'Utility' class
	//So, use following class structure for 'Utility' class
	private SeleniumS16() {}

	public static void getUrl() {
		System.out.println("Launch URL..");
	}
	
	public static void click() {
		System.out.println("Click on element..");
	}
	
	public static void quit() {
		System.out.println("Close the browser..");
	}
	
}
