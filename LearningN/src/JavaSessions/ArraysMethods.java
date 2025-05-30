package JavaSessions;

import java.util.Arrays;

public class ArraysMethods {

	public static void main(String[] args) {
		
		int i[] = new int[4];// size of an array is mandatory here
		//int i[] = new int[];// not allowed
		i[0]=10;
		i[1]=20;
		i[3]=40;
		i[2]=30;
		
		System.out.println(i.length);// 4
		
		System.out.println(i);// [I@4c203ea1 ==> memory reference ==> not useful
		
		// print an array
		System.out.println(Arrays.toString(i));// [10, 20, 30, 40]
		// 'Arrays' is a class and 'toString' is an method
		
		int in[] = new int[10];
		in[0]=1;
		in[1]=2;
		in[3]=4;
		in[2]=3;
		System.out.println(Arrays.toString(in));// [1, 2, 3, 4, 0, 0, 0, 0, 0, 0]
		in[9]=50;
		System.out.println(Arrays.toString(in));// [1, 2, 3, 4, 0, 0, 0, 0, 0, 50]
		
		
		int t[] = new int[4];
		t[0]=100;
		// t[1]=100;// duplicates are allowed
		t[1]=200;
		t[2]=300;
		t[3]=400;

		System.out.println(Arrays.toString(t));// [100, 200, 300, 400]
		
		System.out.println("==============================================");
		
		// print the values of the array 't' using for loop
		for(int j=0; j<4; j++) {
			System.out.println(t[j]);
		};
		
		System.out.println();
		
		for(int j=0; j<t.length; j++) {
			System.out.println(t[j]);
		};
		
		System.out.println();
		
		for(int j=0; j<=3; j++) {
			System.out.println(t[j]);
		};
		
		System.out.println();
		
		for(int j=0; j<=t.length-1; j++) {
			System.out.println(t[j]);
		};
		
		System.out.println();
		
		for(int j=0; j<=t.length-1; j++) {
			System.out.print(t[j] + " ");// concatenation happened here 
		};
		
		System.out.println();
		
		
	//**********************************************************************************
		System.out.println("==============================================");
		System.out.println();
		System.out.print("[");
		for(int j=0; j<=t.length-1; j++) {
			if(j==3) {
				System.out.print(t[j]);
			} else {
				System.out.print(t[j] + ", ");
			};
		};
		System.out.print("]");
		System.out.println();
		
		System.out.println();
		System.out.println("==============================================");
	//**********************************************************************************
		
		
		
		System.out.println();
		
		for(int j=0; j<=t.length-1; j++) {
			System.out.println(t[j]);// concatenation happened here
			System.out.println(Arrays.toString(t));
		};
		
		System.out.println("==============================================");
		
		for(int j=0; j<=t.length-1; j++) {
			System.out.println(t[j] + ' ');// addition operation happened here
		};
		
		System.out.println("==============================================");

		for(int j=0; j<t.length; j++) {
			System.out.println(t[j]);
			if(t[j]==200) {
				System.out.println("Hi Selenium");
				break;
			};
		};
		
		
		//String array:
		String browser[] = new String[4];// 0-3
		browser[0]="chrome";
		System.out.println(Arrays.toString(browser));// [Chrome, null, null, null] ==> 'null' is default 
		// value of String
		browser[1]="firefox";
		browser[2]="edge";
		browser[3]="ie";
		// browser[4]="Chrome";// AIOB exception at the run time ==> ArrayIndexOutOfBoundsException
		System.out.println(Arrays.toString(browser));// [chrome, firefox, edge, ie]
		System.out.println("=======================");
		for(int e=0; e<=browser.length-1; e++) {
			System.out.println(browser[e]);
		};
		System.out.println("=======================");
		for(int k=0; k<browser.length; k++) {
			System.out.print(browser[k] + " ");
		};
		
		
		System.out.println("=======================");
		for(int e=0; e<=browser.length-1; e++) {
			System.out.println(browser[e]);
			if(browser[e]=="edge") {
				System.out.println("Launch "+browser[e]+" browser.");
				break;
			};
		};
		System.out.println("=======================");
		for(int e=0; e<=browser.length-1; e++) {
			System.out.println(browser[e]);
			if(browser[e].equals("edge")) {
				System.out.println("Launch "+browser[e]+" browser.");
				break;
			};
		};
		
	}

}
