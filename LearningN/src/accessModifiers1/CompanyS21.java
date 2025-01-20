package accessModifiers1;

public class CompanyS21 {
	
	String name;
	int empCount;
	
	
	public CompanyS21() {
		System.out.println("CompanyS21 -- default public constructor..");
	}
	
	private CompanyS21(int a) {
		System.out.println("CompanyS21 -- 1 param private constructor.." 
	                       + a);
	}
	
	CompanyS21(String a) {
		System.out.println("CompanyS21 -- 1 param default "
				           + "constructor.." + a);
	}
	
	protected CompanyS21(double a) {
		System.out.println("CompanyS21 -- 1 param protected "
				           + "constructor.." + a);
	}

	public static void main(String[] args) {

		//with public constructor
		CompanyS21 obj = new CompanyS21();
		
		//with private constructor
		CompanyS21 obj1 = new CompanyS21(10);
		
		//with default constructor
		CompanyS21 obj2 = new CompanyS21("Naveen");
		
		//with default protected constructor
		CompanyS21 obj3 = new CompanyS21(123.321);

	}

}
