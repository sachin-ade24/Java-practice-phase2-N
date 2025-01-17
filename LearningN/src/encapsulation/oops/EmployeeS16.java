package encapsulation.oops;

public class EmployeeS16 {
	
	private String name;
	private int age;
	private double salary;
	private boolean isActive;
	
	//
	//public methods: getter/setter
	//public void setName(String name) {
	//	this.name =  name;
	//}
	
	//public String getName() {
	//	return this.name;
	//}
	
	//Create getters and setters using Source option:
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		//usage of setter
		if(!(name==null)) {
			this.name = name;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		//usage of setter
		if(age>=18) {
			this.age = age;
		}
		//if above condition doesn't satisfy
		//default age will be as follows
		this.age = -1;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	

	public static void main(String[] args) {
		
		EmployeeS16 e1 = new EmployeeS16();
		
		//We can access the private variables of same class in the same
		//class
		e1.name = "Tom";
		

	}

}
