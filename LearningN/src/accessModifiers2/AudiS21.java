package accessModifiers2;

import accessModifiers1.CarS21;

public class AudiS21 extends CarS21{
	
	//AudiS21 is child class but it is present in different package
	
	//we can access public and protected properties of another class here 
	//from another package
	//we cannot access default and private properties

	public static void main(String[] args) {
		
		AudiS21 au = new AudiS21();
		
		//variables
		au.color = "white";
		au.name = "Audi";
		
		//methods
		//au.defaultTest();//default is not allowed
		au.publicTest();
		au.protectedTest();

	}

}
