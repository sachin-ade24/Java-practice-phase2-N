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

}
