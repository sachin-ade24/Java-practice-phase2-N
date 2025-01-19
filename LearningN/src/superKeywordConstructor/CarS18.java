package superKeywordConstructor;

public class CarS18 {
	
	String name;
	int price;
	
	public CarS18() {
		System.out.println("CarS18 -- default constructor..");
	}
	
	public CarS18(String name, int price) {
		System.out.println("CarS18 two param -- constructor.. " 
	                       + name + " " + price);
		this.name = name;
		this.price = price;
	}

	

}
