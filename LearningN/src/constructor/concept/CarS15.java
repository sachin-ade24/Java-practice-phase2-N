package constructor.concept;

public class CarS15 {

	String name;
	int price;
	String model;
	String licenseNumber;
	
	public CarS15(String name, int price) {
		this.name = name;
		this.price = price;
	}
    
	public CarS15(String name, String model, String licenseNumber) {
		this.name = name;
		this.model = model;
		this.licenseNumber = licenseNumber;
	}

	public CarS15(String name, int price, String model, String licenseNumber) {
		this.name = name;
		this.price = price;
		this.model = model;
		this.licenseNumber = licenseNumber;
	}

	public static void main(String[] args) {
		
		CarS15 c1 = new CarS15("Honda", 15);
		//CRUD operation --> Create/POST call
		
		CarS15 c2 = new CarS15("BMW", "x3", "898989rw");
		
		CarS15 c3 = new CarS15("Audi", 50, "A3", "9090Au");
		
		System.out.println(c1.name + " " + c1.price + " " + c1.model + " " + c1.licenseNumber);
        //Read --> GET call
		c1.licenseNumber = "1010Hd";
		//Update --> PUT/PATCH call
		System.out.println(c1.name + " " + c1.price + " " + c1.model + " " + c1.licenseNumber);
        //Read --> GET call
		c1.model = "civic";
		//Update --> PUT/PATCH call
		System.out.println(c1.name + " " + c1.price + " " + c1.model + " " + c1.licenseNumber);
        //Read --> GET call
		
		System.out.println("======================================");
		
		System.out.println(c2.name + " " + c2.price + " " + c2.model + " " + c2.licenseNumber);
		c2.price = 60;
		System.out.println(c2.name + " " + c2.price + " " + c2.model + " " + c2.licenseNumber);
	
		System.out.println("======================================");
		
		System.out.println(c3.name + " " + c3.price + " " + c3.model + " " + c3.licenseNumber);
		c3.price = 55;
		System.out.println(c3.name + " " + c3.price + " " + c3.model + " " + c3.licenseNumber);
	    
	
	}

}
