package javaOopsConcepts;

public class MethodsPractice {
	
	static int i = 20;
	
	public static void m1() {
		//static int j = 20;//not allowed
		int j= 20;//allowed
	}
	
	

	public static void main(String[] args) {

		System.out.println(i);//20
		if (i>19) {
			int i = 50;
		}
		System.out.println(i);//20
		
		
	}

}
