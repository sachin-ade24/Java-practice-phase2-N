package JavaSessions;

import java.util.Arrays;

public class Customer_S12 {
	
	
	public Object[] getPageDetails() {
		Object[] pageDetails = {"Amazon Login page", 15, "Chrome", 126.90, true};
		return pageDetails;
	}
	
	

	public static void main(String[] args) {
		
		Customer_S12 c1 = new Customer_S12();
		Object[] details = c1.getPageDetails();
		System.out.println(details.length);
		System.out.println(Arrays.toString(details));

	}

}
