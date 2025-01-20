package accessModifiers2;

import accessModifiers1.CarS21;

//we can access public properties of another class here 
//from another package

public class TruckS21 {

	//TruckS21 is not a child class
	
	public static void main(String[] args) {

		CarS21 c = new CarS21();
		
		//variables
		c.name = "Tesla";//this is public property
		
		//methods
		//au.defaultTest();//default is not allowed
		c.publicTest();
		//c.protectedTest();;//protected is not allowed
	}

}
