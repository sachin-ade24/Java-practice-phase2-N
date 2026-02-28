package practice2026;

public class Feb21_JavaConstructor {
	
	int i;
	
	public Feb21_JavaConstructor(){
		i = 123;
	}
	
	public Feb21_JavaConstructor(int j) {
		i = j;
	}

	public static void main(String[] args) {
		
		Feb21_JavaConstructor o1 =  new Feb21_JavaConstructor();
		
		System.out.println(o1.i);//123
		
		Feb21_JavaConstructor o2 = new Feb21_JavaConstructor(456);
		
		System.out.println(o2.i);//456
		
	}

}
