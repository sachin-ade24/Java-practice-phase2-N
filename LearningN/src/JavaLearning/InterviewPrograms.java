package JavaLearning;

import java.util.Scanner;

public class InterviewPrograms {

	public static void main(String[] args) {
		
		//biggest no.
		int a = 20, b = 19, c = 24;
		if(a-b>0 && a-c>0) {
			System.out.println("a i.e. " + a + " is the biggest number.");
		}else if(b-a>0 && b-c>0) {
			System.out.println("b i.e. " + b + " is the biggest number.");
		}else if(c-a>0 && c-b>0) {
			System.out.println("c i.e. " + c + " is the biggest number.");
		}
		
		//smallest
		if(a-b<0 && a-c<0) {
			System.out.println("a i.e. " + a + " is the smallest number.");
		}else if(b-a<0 && b-c<0) {
			System.out.println("b i.e. " + b + " is the smallest number.");
		}else if(c-a<0 && c-b<0) {
			System.out.println("c i.e. " + c + " is the smallest number.");
		}
		
		//
		int x, y;
		for(x=0;x<=9;x++) {
			for(y=0;y<=9;y++) {
				if(x>y) {
					System.out.println(x + " is greater than " + y + ".");
				}else if(x<y) {
					System.out.println(x + " is smaller than " + y + ".");
				}else if(x==y) {
					System.out.println(x + " and " + y + " are equal.");
				}
			}
		}
		
//        // Create a Scanner object to read input
//		int e, f, g, h=1;
//        Scanner scanner = new Scanner(System.in);
//		//GCD of two no => "greatest common divisor"
//		System.out.println("Enter value of e: ");
//		e=scanner.nextInt(); 
//		System.out.println("Enter value of f: ");
//		f=scanner.nextInt();
//		for(g=h; (g<=e && g<=f); g++) {
//			System.out.println(g);
//			if(e%g==0 && f%g==0) {
//				System.out.println("Common factor: " + g);
//				h=g;
//			}
//		}
//		System.out.println();
//		System.out.println("The GCD is: " + h);
//		
//		//LCM of two no.
//		System.out.println("LCM is: "+((e*f)/h));
		
		//Sum of first 10 natural no.
		int i, m=0;
		for(i=1; i<=10; i++) {
			m=i+m;
		}
		System.out.println("Addition of first 10 natural no. is: " + m);//55
		
		//Multiplication of first 10 natural no.
		m=1;
		for(i=1; i<=10; i++) {
			m=i*m;
		}
		System.out.println("Multiplication of first 10 natural no. is: " + m);//3628800
		
		//Fibonacci series
		m=0;
		int n=1, p=0;
		for(i=1; i<=10; i++) {
			p=m+n;
			m=n;
			n=p;
			System.out.print(p + " ");
		}
		System.out.println();
		
		//Table
		n=5;
		for(i=1;i<=10;i++) {
			System.out.print(i*n + " ");
		}
		
		System.out.println();
		
		//factorial
		n=5;
		for(i=n-1;i>=1;i--) {
			n=n*i;
		}
		System.out.println("Factorial: " + n);
		
		//Prime no.
		int s1, s2;
		for(s1=2; s1<=50; s1++) {
			for(s2=2; s2<=s1; s2++) {
				if(s1%s2==0) {
					break;
				}
			}
			if(s1==s2) {
				System.out.println(s1);
			}
		}
		
		System.out.println();
		
		

		
	}

}
