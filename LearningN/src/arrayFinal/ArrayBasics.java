package arrayFinal;

public class ArrayBasics {

	public static void main(String[] args) {
		
		//1.
		String[] s1;
		//s = {"", "", "", ""}; --> invalid
		s1 = new String[4];
		System.out.println(s1.length);
		
		//2.
		String[] s2 = {"Aa", "Bb", "Cc", "Dd"};
		System.out.println(s2.length);
		
		//3.
		String[] s3 = new String[] {"Ee", "Ff", "Gg", "Hh"};
		System.out.println(s3.length);
		
		//4.
		String[] s4 = new String[4];
		System.out.println(s4.length);
		
		

		

	}

}
