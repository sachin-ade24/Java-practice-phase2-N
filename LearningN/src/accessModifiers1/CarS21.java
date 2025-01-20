package accessModifiers1;

public class CarS21 {
	
	//private class CarS21 {} --> not allowed
	//protected class CarS21 {} --> not allowed
	//class CarS21 {} --> not allowed
	//public class CarS21 {} --> allowed
	
	//in Java, every class must be publicly available
	//so, only public class is allowed
	
	//access modifiers --> non static data members: variables + methods
	
	public String name;
	int price;//nothing written means 'default', but if you write 
	//'default', it will show error
	protected String color;
	private String chasisNumber;
	
	void defaultTest() {
		System.out.println("CarS21 -- default method");
	}
	
	public void publicTest() {
		System.out.println("CarS21 -- publicTest method");
	}
	
	protected void protectedTest() {
		System.out.println("CarS21 -- protectedTest method");
	}
	
	private void privateTest() {
		System.out.println("CarS21 -- privateTest method");
	}

	public static void main(String[] args) {

		CarS21 c  = new CarS21();
		c.chasisNumber = "123Testing";
		c.name = "Honda";
		c.price = 12;
		c.color = "white";
		

	}

}
