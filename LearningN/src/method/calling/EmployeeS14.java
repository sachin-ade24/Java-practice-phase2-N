package method.calling;

public class EmployeeS14 {
	
	String name;//non static variable
	int age;//non static variable
	
	public static void getInfo(EmployeeS14 e2) {
		e2.name = "Mohit";
		e2.age = 25;
		System.out.println(e2.name);//Mohit
		System.out.println(e2.age);//25
	}

	public static void main(String[] args) {
		
		EmployeeS14 e1 = new EmployeeS14();
		e1.name = "Tom";
		e1.age = 20;
		System.out.println(e1.name);//Tom
		System.out.println(e1.age);//20
		
		EmployeeS14.getInfo(e1);//call by reference
		
		System.out.println(e1.name);//Mohit
		System.out.println(e1.age);//25
	}

}
