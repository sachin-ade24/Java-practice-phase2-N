package JavaSessions;

public class WideningAndNarrowingTypeCasting {

	public static void main(String[] args) {
		
		// Widening
		// byte range ==> -128 to 127
		byte b1 = 40;
		byte b2 = 50;
		// byte b3 = b1 + b2; // 90 => not allowed ==> Type mismatch: cannot convert from int to byte
		// (b1 + b2) is considered as integer
		// Consider following example
		byte b4 = 120;
		byte b5 = 125;
		// byte b6 = b4 + b5;// not allowed
		int b6 = b4 + b5;// widening
		 System.out.println(b6);
		
	    // Whenever you are going to add two 'bytes' or 'shorts' then result must be stored in 'int'.
		
		// so,
		int b3 = b1 + b2;// allowed ==> this is predefined in Java
		System.out.println(b3);
		
		short s1 = 1000;
		short s2 = 1500;
		// short s3 = s1 + s2; // not allowed
		int s4 = s1 + s2;// widening
		System.out.println(s4);
		
		int i1 = 23456;
		int i2 = 78910;
		int i3 = i1 + i2;
		long i4 = i1 + i2;// widening
		System.out.println(i3);
		System.out.println(i4);
		
		byte by1 = 123;
		short sh1 = by1;// widening
		System.out.println(sh1);

		short sr1 = 1999;
		int ir = sr1;// possible and hence allowed ==> widening
		
		int it = 10000;
		long lt = it;// widening
		
		long lu = 9999898;
		float fu = lu;// widening
		System.out.println(fu);// 9999898.0
		
		double du = lu;
		System.out.println(du);// 9999898.0 ==> widening
		
		short dv  = 1865;
		float fv = dv;
		System.out.println(fv);// 1865.0 ==> widening
		
		byte bv = 90;
		short sv = bv;// widening
		System.out.println(sv);
		
		
		
		
		// Narrowing
		// fit big box into small box
		short test = 200;
		// byte best = test; // not allowed ==> Type mismatch: cannot convert from short to byte
		byte best = (byte)test; // allowed
		System.out.println(best);// -56 => - 256 + 200 =  -56 // not useful because we are 
		// loosing the data here 
		
		
		short sf = 50;
		// byte bf = sf;// not allowed
		byte bf = (byte)sf;// Narrowing
		System.out.println(bf);// Here we are not loosing the data
		
		long lg = 500;
		// byte bh = lg;
		byte bh = (byte)lg;// loosing the data ==> Narrowing
		System.out.println(bh);// -12 ==> 256 - 500 => -244, then 244 - 256 = - 12;
		
		long amount = 1500;
		// int finalValue = amount;
		int finalValue = (int)amount;// Narrowing ==> but not loosing the data
		System.out.println(finalValue);
		
		float bmi = 12.33f;
		int in = (int)bmi;
		System.out.println(in);// 12
		
		double ds = 300.12; // value is in dollars
		byte bs = (byte) ds;
		System.out.println(bs);// 44 ==> loosing data
		int in1 = (int)ds;
		System.out.println(in1);// 300 ==> not loosing actual data
		
		
		
		
		// Widening
		char ct = 'A'; // 65
		// byte byt = ct; // not allowed => Type mismatch: cannot convert from char to byte
		// short sht = ct; // not allowed => Type mismatch: cannot convert from char to byte
		int in2 = ct;// allowed ==> widening
		System.out.println(in2);// 65
		
		int imt = ct;// allowed ==> widening
		long lmt = ct;// allowed ==> widening
		float fmt = ct;// allowed ==> widening
		double dmt = ct;// allowed ==> widening
		System.out.println(imt);// 65
		System.out.println(lmt);// 65
		System.out.println(fmt);// 65.0
		System.out.println(dmt);// 65.0
		
		// Narrowing
		int ss = 65;
		char cs = (char) ss;
		System.out.println(cs);// A
		int ss1 = 650;
		cs = (char)ss1;
		System.out.println(cs);// ʊ
		int ss2 = 988888;
		cs = (char)ss2;
		System.out.println(cs);// ᛘ
		
		float fs = 99.5f;
		char chs = (char)fs;// narrowing
		System.out.println(chs);// o/p: c --> 99 ==> data loss doesn't take place

		
		
	}

}
