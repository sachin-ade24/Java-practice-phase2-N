package JavaSessions;

public class Customer {
	
	String name;
	int age;
	String city;
	
	//public static void reverse(String s) {
		//for(int i=s.length()-1; i>=0; i--) {
			//System.out.print(s.charAt(i));
		//}
	//}

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.name = "Anu";
		c1.age = 35;
		c1.city = "Pune";
		// c1 refers to 'new Customer();' ==> name, age, city
		
		
		Customer c2 = new Customer();
		c2.name = "Ravi";
		c2.age = 40;
		c2.city = "Bangalore";
		// c2 refers to 'new Customer();' ==> name, age, city
		
		Customer c3 = new Customer();
		c3.name = "Vikas";
		c3.age = 30;
		c3.city = "LA";
		// c3 refers to 'new Customer();' ==> name, age, city
		
		System.out.println(c1.name + " " + c1.age + " " + c1.city +" ");
		System.out.println(c2.name + " " + c2.age + " " + c2.city +" ");
		System.out.println(c3.name + " " + c3.age + " " + c3.city +" ");
		
		System.out.println("===========================================");
		
		//
		c1=c2;
		// it means that: we are telling c1 to break the connection
		// with the Object (current Object) associated with it and start pointing c2 Object
		
		// reverse("Selenium");
		
		
		if(c1.name.equals(c2.name) & c1.age == c2.age & c1.city.equals(c2.city)) {
			System.out.println(c1.name + " " + c1.age + " " + c1.city +" ");
		}
		
		System.out.println(c2.name + " " + c2.age + " " + c2.city +" ");
		System.out.println(c3.name + " " + c3.age + " " + c3.city +" ");
		
		// O/p:
		// Ravi 40 Bangalore ==> c1
		// Ravi 40 Bangalore ==> c2
		// Vikas 30 LA ==> c3
		
		
		System.out.println("===========================================");
		
		//
		c2=c3;
		
		System.out.println(c1.name + " " + c1.age + " " + c1.city +" ");
		System.out.println(c2.name + " " + c2.age + " " + c2.city +" ");
		System.out.println(c3.name + " " + c3.age + " " + c3.city +" ");
		
		// O/p:
		// Ravi 40 Bangalore ==> c1
		// Vikas 30 LA ==> c2
		// Vikas 30 LA ==> c3

		
		System.out.println("===========================================");

		c3=c1;
		
		System.out.println(c1.name + " " + c1.age + " " + c1.city +" ");
		System.out.println(c2.name + " " + c2.age + " " + c2.city +" ");
		System.out.println(c3.name + " " + c3.age + " " + c3.city +" ");
		
		// O/p:
		// Ravi 40 Bangalore 
		// Vikas 30 LA 
		// Ravi 40 Bangalore 
		
		System.out.println("===========================================");
		
		// So, in above process, the garbage collector will destroy
		// the initial Object pointed by 'c1' i.e. c1.name = "Anu", because
		// no Object reference variable is pointing the "Anu", 35 and "Pune" 
		// Object
		
		// So, in Java we can assign one reference to another reference
		// like, c1=2, c2=c3, c3=c1
		

	}

}
