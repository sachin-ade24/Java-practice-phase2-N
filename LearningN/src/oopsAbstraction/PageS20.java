package oopsAbstraction;

public abstract class PageS20 {
	
	int timeOut = 10;
	
	//it is not mandatory to write abstract or normal methods in the
	//abstract class
	//in this way we can achieve 0 to 100% abstraction
	//we can write only abstract methods or only normal methods or both
	//0% abstraction --> no abstract methods
	//100% abstraction --> all abstract method
	//partial abstraction --> both abstract and non abstract methods
	
	//we can create a constructor of an abstract class,
	//it will be called when you create the Object of child class
	public PageS20() {
		System.out.println("PageS20 -- default constructor");
	}
	
	public PageS20(int a) {
		System.out.println("PageS20 -- 1 param constructor " + a);
	}
	
	//We cannot create Object of the 'abstract' class
	
	//we can create abstract methods i.e. methods without body
	//just define the methods
	
	//to create an abstract method in the abstract class, we need to 
	//write abstract keyword
	//by creating the abstract methods, we are 
	//preventing or 'hiding' the implementation
	public abstract void title();
	public abstract void url();
	
	//we can create a normal method in the abstract class
	public void pageLoadTimeout() {
		System.out.println("PageS20 -- pageLoadTimeout = 20 sec");
	}
	
	public final void logo() {
		System.out.println("page -- logo");
	}
	
	


}
