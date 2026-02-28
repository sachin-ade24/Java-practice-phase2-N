package practice2026;

public class Feb21_Encapsulation2 {

	public static void main(String[] args) {
		
		/*
		Feb21_Encapsulation1 o1 = new Feb21_Encapsulation1();
		//Initially valid as long as the constructor has no arguments but once I created 
		//the constructor with arguments it become invalid
		
		o1.setName("Sachin");
		System.out.println(o1.getName());//Sachin
		
		o1.setAge(37);
		System.out.println(o1.getAge());//37
		
		o1.myCity();
		System.out.println(o1.getCity());//Pune
		
		System.out.println(o1.name + o1.age + o1.city);
		
		*/
		
		//Feb21_Encapsulation1.information(); //Valid
		
		Feb21_Encapsulation1 o2 = new Feb21_Encapsulation1("Sachin", 37, "Pune");
		System.out.println(o2.name);
		System.out.println(o2.age);
		System.out.println(o2.city);
		
		
		
		
		

	}

}
