package method.overloading.concept;

public class MainMethodOverloadingS13 {

	//Main method can be overloaded
	//Overloading the main method is a bad practice
	//JVM will only execute this: public static void main(String[] args)
	//It may call other methods if those are called within main method with
	//expected signature
	
	public static void main(String[] args) {

		System.out.println("Hello world..");//o/p==>Hello world..
		
		MainMethodOverloadingS13.main();
		MainMethodOverloadingS13.main(12);
		MainMethodOverloadingS13.main(1, "Sac");
		
		MainMethodOverloadingS13 m = new MainMethodOverloadingS13();
		m.main(1, 2);

	}
	
	public static void main() {
		System.out.println("Hi..");
	}
	
	public static void main(int a) {
		System.out.println("Bye..");
	}
	
	public static void main(int a, String b) {
		System.out.println("Hello..Hi..Bye");
	}
	
	public void main(int c, int d) {
		System.out.println("See you..");
	}

}
