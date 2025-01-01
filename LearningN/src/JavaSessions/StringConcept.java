package JavaSessions;

public class StringConcept {

	public static void main(String[] args) {
		
		//String: is a default/in-built class
		
		String s = "Hello Sachin";// must be in double quotes
		System.out.println(s);
		
		String s1 = "100";
		System.out.println(s1);// o/p: 100
		System.out.println(s1+20);// o/p: 10020 ==> Concatenation
		
		int a=100;
		int b=200;
		String x = "Hello";
		String y = "Selenium";
		
		System.out.println(a+b);// o/p: 300 ==> Addition
		System.out.println(a+x);// o/p: 100Hello ==> Concatenation
		System.out.println(b+x);// o/p: 200Hello ==> Concatenation
		System.out.println(a+y);// o/p: 100Selenium ==> Concatenation
		System.out.println(b+y);// o/p: 200Selenium ==> Concatenation
		System.out.println(a+b+x);// o/p: 300Hello ==> addition & Concatenation
		System.out.println(a+b+x+y);// o/p: 300HelloSelenium ==> addition & Concatenation
		System.out.println(a+x+b+y);// o/p: 100Hello200Selenium ==> Concatenation
		System.out.println(x+a+b+y);// o/p: Hello100200Selenium ==> Concatenation
		System.out.println(x+y+a+b);// o/p: HelloSelenium100200 ==> Concatenation
		System.out.println(x+y+(a+b));// o/p: HelloSelenium300 ==> Concatenation & addition
		System.out.println(a+b+x+y+a+b);// o/p: 300HellloSelenium100200 ==> addition & Concatenation
		
		
		System.out.println("The value of a is " + a);
		System.out.println("The value of b is " + b);
		System.out.println("The value of a+b is " + (a+b));
		
		double d1 = 12.33;
		double d2 = 12.22;
		System.out.println("d1+d2 = "+(d1+d2));
		System.out.println(d1+d2+x+y);// o/p: 24.55HelloSelenium
		System.out.println(x+y+d1+d2);// o/p: HelloSelenium12.3312.22
		System.out.println(x+y+d1+d2+a+b);// o/p: HelloSelenium12.3312.22100200
		System.out.println(d1+d2+a+b+x+y);// o/p: 324.55HelloSelenium
		System.out.println(d1+d2+x+y+a+b);// o/p: 24.55HelloSelenium100200
		System.out.println(x+d1+d2+a+b+y);// o/p: Hello12.3312.22100200Selenium
		
		byte b1 = 10;
		System.out.println(b1+x);//o/p: 10Hello
		System.out.println("Hi this is Sachin" + x + y + a + b);// o/p: Hi this is SachinHelloSelenium100200
		
		char ch = 'a';
		char bh = 'b';
		System.out.println(ch);// o/p: a
		System.out.println((int)ch);// o/p: 97
		System.out.println(x+ch);// o/p: Helloa ==> When you add a String to the 'char', the concatenation happens
		System.out.println(x+(int)ch);// o/p: Hello97
		System.out.println(ch+x);// o/p: aHello
		System.out.println(ch+x+bh);// o/p: aHellob
		System.out.println(ch+bh);// o/p: 195 ==> when you add two 'chars' then the addition happens
		System.out.println(ch+' '+x);// o/p: 129Hello ==> addition first and then concatenation happens
		System.out.println(ch+x+' ');// o/p: aHello  ==> concatenation
		System.out.println(ch-bh);// o/p: -1
		System.out.println(ch*bh);// o/p: 9506
		System.out.println('A' + 'B');// o/p: 131
		System.out.println('A' + 'a' + 'B');// o/p: 228
		
		//0 to 9: 48 to 57
		char c1 = '0';
		char c2 = '1';
		System.out.println(c1 + c2);// o/p: 97
		System.out.println(' ' + 'a');// o/p: 129
		System.out.println(ch + bh + x + y);// o/p: 195HelloSelenium
		System.out.println('a');// o/p: a
		System.out.println((byte)'a');// o/p: 97
		System.out.println('a' + ' ');// o/p: 97+32=129
		System.out.println('a'+0);// o/p: 97
		System.out.println(97);// o/p: 97
		System.out.println((char)97);// o/p: a
		System.out.println((char)400);// o/p: Ɛ
		System.out.println('0'+'a'+'A');// o/p: 210
		System.out.println("Hello" + '0' + 'a' + 'A');// o/p: Hello0aA
		System.out.println("Hello" + ('0' + 'a' + 'A'));// o/p: Hello210
		System.out.println(c1+c2+a+b+x+y);// o/p: 48 + 49 + 100 + 200 + Hello + Selenium: 397
		
		System.out.println(x + c1 + ch + bh + c2 + y);// o/p: Hello0ab1Selenium
		
		
		
		
		
		
		
		

	}

}
