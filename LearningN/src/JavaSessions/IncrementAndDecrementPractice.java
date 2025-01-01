package JavaSessions;

public class IncrementAndDecrementPractice {

	public static void main(String[] args) {
		
		int i = 11;
		int j = i++ + ++i;
		
		System.out.println(i);// o/p: 13 ==> 11(12) + 13(13)
		System.out.println(j);// o/p: 24 ==> 11 + 13 = 24
		
		int a = 11, b = 22, c;
		
		c = a + b + a++ + b++ + ++a + ++b;
		// 11 + 22 + 11(12) + 22(23) + 13(13) + 24(24)
		System.out.println("a = " + a);// 13
		System.out.println("b = " + b);// 24
		System.out.println("c = " + c);// 103
		
		int i1 = 0;
		int j1 = i++ - --i + ++i - i--;
		// 0(1) - 0(0) + 1(1) - 1(0)
		System.out.println(i1);// o/p: 0
		System.out.println(j1);// o/p: 0
		
		boolean b1 = true;
		// b1++;// not allowed => Type mismatch: cannot convert from boolean to int
		System.out.println(b1);

		int i2 = 19, j2 = 29, k2 = 0;
		int m = i2-- - j2-- - k2--;
		// 19(18) - 29(28) - 0(-1) = -10
		System.out.println(i2);// o/p: 18
		System.out.println(j2);// o/p: 28
		System.out.println(k2);// o/p: -1
		System.out.println(m);// o/p: -10
		
		int i3 = 11;
		// int j = --(i++);// not allowed ==> Invalid argument to operation ++/--
		
		int a1 = 1;
		int a2 = a1++ + ++a1 * --a1 - a1--;
		// 1(2) + 3(3) * 2(2) - 2(1)
		System.out.println(a1);// 1
		System.out.println(a2);// 5
		
		int b2 = 11;
		System.out.println(b2++);// 11
		System.out.println(b2);// 12
		
		int ch = 'A';
		System.out.println(ch);// 65
		System.out.println((int)ch);// 65
		System.out.println((int)'A');// 65
		System.out.println('A');// A
		System.out.println(ch++);// 65
		System.out.println(ch);// 66
		
		
		
		double d = 1.5, D = 2.5;
		double d1 = d++ + ++D;
		// 1.5(2.5) + 3.5(3.5)
		System.out.println(d);// 2.5
		System.out.println(D);// 3.5
		System.out.println(d1);// 5.0
		
		
		
		
	}

}
