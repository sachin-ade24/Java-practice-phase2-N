package encapsulation.oops;

public class EmpTestS16 {

	public static void main(String[] args) {

		EmployeeS16 e1 = new EmployeeS16();
		
		//private variables of other class cannot be accessed directly
		//e1.name = "Sachin";//not possible
		//Error: The field EmployeeS16.name is not visible
		
		//Using setter and getter we can access 
		//private variables of another class into the currently used class
		
		//e1.setName("Tom");
		//System.out.println(e1.getName());

		e1.setName("Tom");
		e1.setAge(10);
		e1.setSalary(23.44);
		e1.setActive(true);
		
		System.out.println(e1.getName());
		//extended condition, for preventing something for given scenario
		//see below scenario:
		if(e1.getAge()==-1) {
			System.out.println("Not eligible for the hiring...");
		}
		System.out.println(e1.getSalary());
		System.out.println(e1.isActive());
		
		System.out.println("==========================================");
		
		LoginPageS16 lp = new LoginPageS16();
		lp.setUsername("Sachin Ade");
		lp.setPassword("test_1234");
		
		if(lp.getPassword().length()>=10) {
			System.out.println(lp.getPassword());
		}
		
		
	}

}
