package practice2026;

public class Feb22_Inheritance_Child extends Feb22_Inheritance_Parent{
	
	private String modelName = "Safari";

	public static void main(String[] args) {
		
		Feb22_Inheritance_Child o1 = new Feb22_Inheritance_Child();
		
		o1.honk();
		
		System.out.println("Brand name: " + o1.brand + ", Model name: " + o1.modelName);

	}

}
