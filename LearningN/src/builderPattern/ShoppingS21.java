package builderPattern;

public class ShoppingS21 {
	
	int orderId;
	
	public ShoppingS21 login() {
		System.out.println("login to app");
		//return new ShoppingS21();
		return this;
	}

	public ShoppingS21 login(String un, String pwd) {
		System.out.println("login to app using: " + un + " " + pwd);
		//return new ShoppingS21();
		return this;
	}
	
	public ShoppingS21 search() {
		System.out.println("default search");
		//return new ShoppingS21();
		return this;
	}
	
	public ShoppingS21 search(String productName) {
		System.out.println("search with: " + productName);
		//return new ShoppingS21();
		return this;
	}
	
	public ShoppingS21 search(String productName, int price) {
		System.out.println("search with: " + productName + " " + price);
		//return new ShoppingS21();
		return this;
	}
	
	public ShoppingS21 addToCart(String productName) {
		System.out.println("Adding to cart: " + productName);
		//return new ShoppingS21();
		return this;
	}
	
	public ShoppingS21 makePayment(String upi) {
		System.out.println("making the payment using: " + upi);
		//return new ShoppingS21();
		return this;
	}
	
	public ShoppingS21 makePayment(String cc, int cvv) {
		System.out.println("making the payment using: " + cc + " " + cvv);
		//return new ShoppingS21();
		return this;
	}
	
	public ShoppingS21 generateOrderId() {
		System.out.println("order id is: " + 123234);
		orderId = 123234;
		//return new ShoppingS21();
		return this;
	}
	
	public ShoppingS21 logout() {
		System.out.println("logout from app");
		//return new ShoppingS21();
		return this;
	}
	
}
