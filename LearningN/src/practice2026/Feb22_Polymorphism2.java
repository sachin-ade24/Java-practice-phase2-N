package practice2026;

public class Feb22_Polymorphism2 extends Feb22_Polymorphism1{
	
	public void polyMethod1() {
		System.out.println("This is polyMethod1() - without args for --> Feb22_Polymorphism2");
	}
	
	@Override
	public void polyMethod1(String s) {
		System.out.println("This is polyMethod1() - with args for --> Feb22_Polymorphism2" + s);
	}
	
	public static void main(String[] args) {
		
		Feb22_Polymorphism1 o1 = new Feb22_Polymorphism1();
		
		o1.polyMethod1();
		
		Feb22_Polymorphism1 o2 = new Feb22_Polymorphism2();
		
		o2.polyMethod1();

	}

}
