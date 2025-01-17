package method.overloading.concept;

import java.util.Arrays;

public class ShoppingS13 {
	
	int orderId;
	String productName;
	String sellerName;
	String color;
	int price;
	
	//Method overloading for search method
	public int searchProduct(String productName) {
		System.out.println("Searching product by " + productName);
		return 150;//returned 70 products
	}
	
	public int searchProduct(String productName, int price) {
		System.out.println("Searching product by " + productName + "and price " + price);
		return 100;//returned 100 products
	}
	
	public int searchProduct(String productName, int price, String color) {
		System.out.println("Searching product by " + productName + " price, " + price + "color " + color);
		return 50;
	}
	
	public void payment(String cc, int cvv, String cardType) {
		switch (cardType) {
		case "visa":
			System.out.println("Making the payment using:- " + cc + " and " + cvv + ".");
			break;
		case "mastercard":
			System.out.println("Making the payment using:- " + cc + " and " + cvv + ".");
			break;
		case "RuPay":
			System.out.println("Making the payment using:- " + cc + " and " + cvv + ".");
		default:
			System.out.println("Pass right card name..");
			break;
		}
	}
	
	public void payment(String upi) {
		System.out.println("Making the payment using: " + upi);
	}
	
	public int getOrderId(int orderId) {
		this.orderId = orderId;
		return orderId;
	}
	
	public String getProductName(String productName) {
		this.productName = productName;
		return productName;
	}
	
	public String getSellerName(String sellerName) {
		this.sellerName= sellerName;
		return sellerName;
	}
	
	public String getColor(String color) {
		this.color= color;
		return color;
	}
	
	public int getPrice(int price) {
		this.price = price;
		return price;
	}
	
	//Sir has covered this:
	public Object[] sendMailWithOrderDetails() {
		Object[] orderDetails = {
				getOrderId(orderId), 
				getProductName(productName), 
				getSellerName(sellerName),
				getColor(color),
				getPrice(price)
				};
		System.out.println("Sending an email...");
		return orderDetails;
	}

	public static void main(String[] args) {
		
		ShoppingS13 s = new ShoppingS13();
		
		int numOfProducts = s.searchProduct("Samsung Galaxy Tab");
		System.out.println(numOfProducts);
		
		numOfProducts = s.searchProduct("Samsung Galaxy Tab", 50000);
		System.out.println(numOfProducts);
		
		//For some 'xyz' customer:
		s.getOrderId(1324);
		s.getProductName("Dell Laptop");
		s.getSellerName("Laptop Store, Pune.");
		s.getColor("Silver");
		s.getPrice(50500);
		Object[] details = s.sendMailWithOrderDetails();
		System.out.println(Arrays.toString(details));
		
	}

}
