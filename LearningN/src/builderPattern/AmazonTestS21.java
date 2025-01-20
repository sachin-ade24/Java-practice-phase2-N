package builderPattern;

public class AmazonTestS21 {

	public static void main(String[] args) {

		//method chaining: builder pattern
		ShoppingS21 shop = new ShoppingS21();
		shop
		   .login("admin", "admin123")
		       .search("macbook pro")
		       		.addToCart("macbook pro")
		       				.makePayment("test@okicici")
		       					.generateOrderId()
		       							.logout();
		
		System.out.println(shop.orderId);
		
		//
		shop.login("admin", "admin123")
				.search("t-shirt", 1000)
					.logout();
		
		//
		shop.login("admin", "admin123")
				.search("keyboard", 1000)
					.addToCart("keyboard")
						.logout();
		
		//
		shop.login("admin", "admin123")
				.makePayment("test@okicici")
					.logout();
		
		//
		shop.login("admin", "admin123")
				.logout();
		
		//
		shop.login("admin", "admin123")
				.search("Shoes", 5000)
					.addToCart("nike shoes")
						.makePayment("1234 4321 2345 5432", 123)
							.generateOrderId()
								.logout();
		//
		shop.login("admin", "admin123");
		
		//
		shop.login()
				.logout();
		
	}

}
