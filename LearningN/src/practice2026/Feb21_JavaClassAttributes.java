package practice2026;

public class Feb21_JavaClassAttributes {
	
	int i1 = 100;
	
	public static void main(String[] args) {
		
		Feb21_JavaClassAttributes o1 =  new Feb21_JavaClassAttributes();
		Feb21_JavaClassAttributes o2 =  new Feb21_JavaClassAttributes();
		
		o1.i1 = 10;
		
		System.out.println(o1.i1);//10
		System.out.println(o2.i1);//100
		
	}

}
