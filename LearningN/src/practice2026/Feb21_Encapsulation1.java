package practice2026;

public class Feb21_Encapsulation1 {
	
	String name;
	int age;
	String city;
	
	/*
	public Feb21_Encapsulation1(String name, int age, String city) {
		this.name = "Sachin";
		this.age = 37;
		this.city = "Pune";
	}
	*/
	
	public Feb21_Encapsulation1(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	public static void information() {
		Feb21_Encapsulation1 o1 = new Feb21_Encapsulation1("Sachin", 37, "Pune");
		System.out.println("Name: " + o1.name + ", " + "Age: " + o1.age + ", " + "City: " + o1.city + ".");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name =  name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void myCity() {
		setCity("Pune");
	}
	

}
