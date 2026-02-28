package practice2026;

public class Feb22_SuperKeywordChild extends Feb22_SuperKeywordParent{
	
	String city = "Bangalore";
	
	/*
	 * Initially, I didn't create a constructor for the parent () as well as child. 
	   So, classes were using a default constructor.
	 * Then, I created a parameterized constructor for parent, and suddenly I saw an error 
	   at line no. 3, a red underline below the child class name.
	 * After that I created a constructor in the child without any parameters, still it was 
	   showing an error in child class at child constructor name. 
	 * If you create a constructor with parameters at both child and parent, it will still show 
	   an error. 
	 * So, if you have a non-parameterized constructor in child, you must have the 
	   non-parameterized constructor in parent.
	 * The important thing to note is, if you have a non-parameterized constructor in parent, 
	   you need not to create a non-parameterized constructor in child. But if you have a 
	   a non-parameterized constructor in child and your parent does not have it, then you will 
	   see an error in child.
	 * The above rule is not applicable for parameterized constructors.
	 * */
	
	public Feb22_SuperKeywordChild() {
		//super();//Valid
		super("Feb22_SuperKeywordParent Constructor.");//Valid
	}
	
	public Feb22_SuperKeywordChild(String s) {
		super();//Valid
		//super("Feb22_SuperKeywordParent Constructor.");//Valid
		System.out.println("This is Feb22_SuperKeywordChild constructor with String Argument.");
	}
	
	void mtd1() {
		super.mtd1();
		System.out.println("This is Feb22_SuperKeywordChild method mtd1().");
	}
	
	void method1() {
		System.out.println("This is Feb22_SuperKeywordChild method method1().");
	}
	
	void printCity() {
		System.out.println(super.city);
	}


}
