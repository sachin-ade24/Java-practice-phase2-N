package encapsulation.oops;

public class SeleniumTestS16 {
	
	//We cannot create
	//private class
	//Static class
	//We can create a public, final and abstract class

	public static void main(String[] args) {

		//we cannot create the constructor of 'SeleniumS16' class
		//because the constructor of the 'SeleniumS16' class is 'private'
		//SeleniumS16 sel = new SeleniumS16();//invalid
		
		//
		//We cannot create Object for System class
		//System sys = new System();//Reason is: private constructor
		//Error: The constructor System() is not visible
		
		
		//So, in order to call the methods of the 'SeleniumS16' class,
		//in the current class,
		//we have to change the existing public non-static methods of
		//'SeleniumS16' class to 'Static'
		
		//After converting non-static methods to static
		//but this way it will not be object oriented program
		SeleniumS16.getUrl();
		SeleniumS16.click();
		SeleniumS16.quit();
		
		//This type of of program can be written for 'UTILITY' class
		
	}

}
