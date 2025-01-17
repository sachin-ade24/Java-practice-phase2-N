package encapsulation.oops;

public class BrowserS16 {
	
	//For user launching the browser is the important thing,
	//so, user will only care about launching the browser
	//In this case, we are unnecessarily keeping all the 
	//other methods in the 'BrowserS16' class as 'public' methods
	
	//This method is public
	public void launchBrowser() {
		System.out.println("launchBrowser...");
		
		//Now here you can check other things
		//Non static method can call another non static method
		checkBrowserExists();
		checkBrowserVersion();
		checkBrowserCompatibility();
		checkBrowserUpdates();
		
		System.out.println("Browser is launched...");
	}
	
	
	//All the method given below should be kept as 'private'
	//instead of 'public'
	
	//public void checkBrowserExists() {
	//	System.out.println("checkBrowserExists...");
	//}
	private void checkBrowserExists() {
		System.out.println("checkBrowserExists...");
	}
	
	//public void checkBrowserVersion() {
	//	System.out.println("checkBrowserVersion...");
	//}
	private void checkBrowserVersion() {
		System.out.println("checkBrowserVersion...");
	}
	
	//public void checkBrowserCompatibility() {
	//	System.out.println("checkBrowserCompatibility...");
	//}
	private void checkBrowserCompatibility() {
		System.out.println("checkBrowserCompatibility...");
	}
	
	//public void checkBrowserUpdates() {
	//	System.out.println("checkBrowserUpdates...");
	//}
	private void checkBrowserUpdates() {
		System.out.println("checkBrowserUpdates...");
	}


}
