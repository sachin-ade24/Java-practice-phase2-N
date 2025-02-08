package thisKeywordAndConstructor;

public class EmployeeS21 extends CompanyS21{
	
	String name;
	int age;
	
	public EmployeeS21() {
		//using 'this' keyword we can call the other constructors 
		//of the class
		//this("Tom", 30);//This should be the first statement
		
		System.out.println("EmployeeS21 -- default constructor");
	}
	
	public EmployeeS21(String name, int age) {
		//this();//this has to be first statement
		super();//this has to be first statement
		//so, we cannot use 'this' and 'super' together
		System.out.println("EmployeeS21 -- 2 param constructor");
		this.name =  name;
		this.age = age;
	}
	
	public static void main(String[] args) {

		//EmployeeS21 e1 = new EmployeeS21();//default will be called
		
		//System.out.println(e1.name);//Tom
		//System.out.println(e1.age);//30
		//but if I comment 'this("Tom", 30);', o/p will be,
		//null and 0
		//In this case, to get the expected value, I can do like this
		EmployeeS21 e2 = new EmployeeS21("Tom", 30);
		//System.out.println(e2.name);//Tom
		//System.out.println(e2.age);//30
		//but this line 'this("Tom", 30);' is preventing us to create
		//unnecessary object using parameterized constructor
		

	}

}
