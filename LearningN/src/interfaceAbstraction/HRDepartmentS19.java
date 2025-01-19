package interfaceAbstraction;

public class HRDepartmentS19 implements DepartmentS19{
	
	//It is not mandatory to define all the 'default' methods of
	//parent interface
	
	@Override
	public void defineSalary() {
		System.out.println("salary: 100 USD");
	}
	
	@Override
	public void allocateTheBudget() {
		System.out.println("allocateTheBudget: 10000 USD");
	}
	
	@Override
	public void accountSummary() {
		System.out.println("accountSummary: 10000 USD");
	}
	
	
	
	
	
	
	
}
