package encapsulation.oops;

public class UserS16 {
	
	private String name;
	private int age;
	private double salary;
	private boolean isActive;
	
	//Constructor is behaving like a setter here
	public UserS16(String name, int age, double salary, boolean isActive) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isActive = isActive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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
	
}
