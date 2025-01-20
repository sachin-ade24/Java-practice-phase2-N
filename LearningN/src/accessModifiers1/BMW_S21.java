package accessModifiers1;

public class BMW_S21 extends CarS21{
	
	//it is a child or sub-class

	public static void main(String[] args) {
		
		BMW_S21 b = new BMW_S21();
		
		//variables
		b.name = "BMW";
		b.price = 50;
		b.color = "blue";
		
		//methods
		b.defaultTest();
		b.publicTest();
		b.protectedTest();
	}

}
