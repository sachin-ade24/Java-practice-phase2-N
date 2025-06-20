package interfaceAbstraction;

public interface DepartmentS19 {
	
	default void defineSalary() {
		
	}
	
	default void allocateTheBudget() {
		
	}
	
	default void accountSummary() {
		
	}
	
	//'default' methods cannot be 'final'
	default /*final*/ void defineCompanyBudget() {
		System.out.println("companyBudget");
	}
	
	//'final' method is not allowed
	/*final void defineFinalCompanyBudget() {
		System.out.println("companyBudget");
	}
	*/
	
	public void m1();
	
	//default void m2(); // not allowed, add body for default method
	
	//private void m3() {}; // shows warning
	
	//private void m4(); // not allowed, shows error
	
	//protected void m5(); // not allowed
	
	public static void m6() {}; // allowed
	
	//public static void m7(); // not allowed

	//static void m7(); // not allowed
}
