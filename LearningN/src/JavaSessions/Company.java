package JavaSessions;

public class Company {
	
	public void getMail() {
		System.out.println("Getting email...");
	}
	
	public static void sendMail() {
		System.out.println("Sending email...");
	}
	
	public static int getNumber() {
		return 100;
	}

	public static void main(String[] args) {
		
		Company c1 = new Company();
		Company c2 = new Company();
		
		// Call non static method
		c1.getMail();
		c2.getMail();
		// Call static method
		Company.sendMail();//valid
		sendMail();//valid
		//c1.sendMail();//valid but gives warning
		//c2.sendMail();//valid but gives warning
		
		//
		System.out.println(Company.getNumber());
		System.out.println(getNumber());
		
		
		
		
		
		

	}

}
