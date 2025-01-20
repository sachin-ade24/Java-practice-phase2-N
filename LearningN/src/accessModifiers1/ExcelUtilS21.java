package accessModifiers1;

public class ExcelUtilS21 {
	
	//part 2: starts here
	//Though we have all static methods in ExcelUtilS21,
	//still we can create an Object of the ExcelUtilS21
	//we should prevent this from happening i.e. no one should create
	//the Object of the ExcelUtilS21 class because we don't have a 
	//single non static method in the ExcelUtilS21 class.
	//For this we can create a private constructor in the 
	//ExcelUtilS21 class.
	
	//create a blank constructor
	
	private ExcelUtilS21() {};
	
	//but there is a huge disadvantage of using static methods
	//static things will not participate in the parallel execution
	//because the static methods are saved in the meta space
	//only one copy of each static variable and method will be saved in
	//the meta space
	//so, at a time only one thread/user can access the given method or
	//property, so while being used that particular method, cannot be 
	//accessed by other thread/user. Once first user's/thread's work
	//has been done then only it will be available for the second thread.
	//this way it is impossible to do parallel execution using the 
	//static methods.
	
	//===================================================================
	
	//part 1: starts here
	//see all the methods given below
	//consider that we are going to utilize the ExcelUtilS21 for various
	//classes in the project, e.g. loginPage class, registrationPage class
	//it means that we have to create two Objects for the ExcelUtilS21
	//class. And suppose in future, we need to create 100 such classes
	//where we will be using the ExcelUtilS21, so we need to create 100
	//Objects.
	//So, to avoid this i.e. to avoid the unnecessary creation of the
	//hundreds of the Objects, simple make them static, i.e. convert below
	//non static methods to static
	
	
	//public void readExcel() {
	//	System.out.println("read excel..");
	//}
	
	//public void writeExcel() {
	//	System.out.println("write excel..");
	//}
	
	//public void deleteExcel() {
	//	System.out.println("delete excel..");
	//}
	
	//public void updateExcel() {
	//	System.out.println("update excel..");
	//}
	
	public static void readExcel() {
		System.out.println("read excel..");
	}
	
	public static void writeExcel() {
		System.out.println("write excel..");
	}
	
	public static void deleteExcel() {
		System.out.println("delete excel..");
	}
	
	public static void updateExcel() {
		System.out.println("update excel..");
	}
	
	//part 1: ends here

	//===================================================================
	
}
