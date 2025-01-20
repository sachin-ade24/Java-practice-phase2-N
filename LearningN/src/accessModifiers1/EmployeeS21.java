package accessModifiers1;

public class EmployeeS21 extends DepartmentS21{
	
	@Override
	public void billing() {
		System.out.println("EmployeeS21 -- billing");
	}
	
	//not overridden --> private methods cannot be overridden
	//individual method
	private void sharePrice() {
		System.out.println("EmployeeS21 -- sharePrice");
	}
	
	//==========================================================
	
	@Override
	void releaseFeature() {
		System.out.println("EmployeeS21 -- releaseFeature");
	}
	
	//allowed
	//@Override
	//protected void releaseFeature() {
	//	System.out.println("EmployeeS21 -- releaseFeature");
	//}
	
	//allowed
	//@Override
	//public void releaseFeature() {
	//	System.out.println("EmployeeS21 -- releaseFeature");
	//}
	
	//not allowed
	//@Override
	//private void releaseFeature() {
	//	System.out.println("EmployeeS21 -- releaseFeature");
	//}

	//==========================================================
	
	@Override
	protected void newsLetter() {
		System.out.println("EmployeeS21 -- releaseFeature");
	}
	
	//allowed
	//@Override
	//public void newsLetter() {
	//	System.out.println("EmployeeS21 -- releaseFeature");
	//}
	
	//not allowed
	//@Override
	//private void newsLetter() {
	//	System.out.println("EmployeeS21 -- releaseFeature");
	//}
	
	//not allowed
	//void newsLetter() {
	//	System.out.println("EmployeeS21 -- releaseFeature");
	//}
	
	//==========================================================
	
	//above concepts are applicable for non static methods
	
	//==========================================================

	public static void main(String[] args) {
		

	}

}
