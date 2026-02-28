package practice2026;

public class Feb21_Keywords {
	
	int i3 = 12;
	static int i1 = 10;
	final int i4 = 13;
	final static int i2 = 11;
	
	public static void main(String[] args) {
		Feb21_Keywords k = new Feb21_Keywords();
		
		System.out.println(k.i3);
		System.out.println(i1);
		System.out.println(k.i4);
		System.out.println(i2);
		
		k.i3 = 5;
		i1=7;
		//k.i4 = 14;//invalid --> final value cannot be changed
		//i2 = 20;//invalid --> final value cannot be changed
		System.out.println(k.i3);
		System.out.println(i1);

	}

}
