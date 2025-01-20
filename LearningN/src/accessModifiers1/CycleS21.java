package accessModifiers1;

public class CycleS21 {
	
	//it is not a child or sub-class

	public static void main(String[] args) {

		CarS21 c  = new CarS21();
		
		//variables
		c.name = "abc";
		c.price = 1;
		c.color = "green";
		
		//methods
		c.defaultTest();
		c.publicTest();
		c.protectedTest();

	}

}
