package accessModifiers1;

public class CompanyTestS21 {
	
	public static void main(String[] args) {

		//with public constructor
		CompanyS21 obj = new CompanyS21();//valid
		
		//with private constructor
		//CompanyS21 obj1 = new CompanyS21(10);//invalid
		
		//with default constructor
		CompanyS21 obj2 = new CompanyS21("Naveen");//valid
		
		//with default protected constructor
		CompanyS21 obj3 = new CompanyS21(123.321);//valid
		
		//Though we have all static methods in ExcelUtilS21,
		//still we can create an Object of the ExcelUtilS21
		//we should prevent this from happening i.e. no one should create
		//the Object of the ExcelUtilS21 class because we don't have a 
		//single non static method in the ExcelUtilS21 class.
		//For this we can create a private constructor in the 
		//ExcelUtilS21 class.
		
		//after creating the private constructor, we cannot create 
		//an Object now.
		//ExcelUtilS21 ex = new ExcelUtilS21();//invalid
		
		//static methods
		ExcelUtilS21.readExcel();
		ExcelUtilS21.writeExcel();
		ExcelUtilS21.updateExcel();
		ExcelUtilS21.deleteExcel();
		
		//there is an internal class of Java whose constructor is
		//private, meaning, we cannot create the Object of that class
		//System s = new System()://invalid
		//Error: The constructor System() is not visible
		//all the methods of the system class are static
		
		//in multi-threading environment, we do not use
		//System.out.println("Hello..");
		//instead of that, we use log4j api
		//log.info("Hello..");
		//because the 'System.out.println("Hello..");' is static in nature
		//and cannot be used with parallel and multi-threading environments
		//the reason is, it will make execution slower.
		//where as log4j is non-static in nature, so can be used with 
		//multi-threading environments
	}

}
