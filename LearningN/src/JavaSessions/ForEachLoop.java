package JavaSessions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ForEachLoop {

	public static void main(String[] args) {
		
		int i[] = {10, 20, 30, 40};// 0 to 3 ==> 4
		
		// Index based for loop
		for(int j=0; j<=i.length-1; j++) {
			System.out.print(i[j] + " ");// 10 20 30 40
		}
		
		System.out.println();
		System.out.println("============================");
		
		// for each loop
		for(int e : i) {
			System.out.print(e + " ");
		} 
		// o/p ==> 10 20 30 40
		// Here, we are saying that 'e' you go to the i (array) 
		// and check/go through each and every value of i array
		
		System.out.println();
		System.out.println("============================");
		
		//
		int p[] = new int[4];
		p[0]=100;
		p[1]=200;
		p[3]=400;
		p[2]=300;
		
		for(int f : p) {
			System.out.println(f);
		}
		
		System.out.println("============================");
		
		//
		String browser[] = {"chrome", "firefox", "ie", "edge"};// 4 ==> 0 to 3
		for(String b : browser) {
			if(b.equals("Firefox".toLowerCase())) {
				System.out.println("Launch the " + b + " browser");
				break;
			}
		}
		System.out.println("=======================================================");
		
		// Reverse
		//1. Unusual way (not at all normal)
		int c =  browser.length-1;
		for(String b : browser) {
			System.out.println(browser[c]);
			if(b.equals(browser[c])) {
				System.err.println("Something went wrong...");
			} else {
				if(browser[c].equals("chrome")) {
					System.out.println("Launch the " + browser[c] + " browser.");
				}
			}
			c--;
		}
		
		System.out.println("*********************************************");
		
        //2. (This is right approach)
		int l =  browser.length-1;
		for(String b : browser) {
			b=browser[l];
			System.out.println(b);
			l--;
		}

		System.out.println("*********************************************");
		
		//3. Normal way using List and Collection
		List<String> browserList = Arrays.asList(browser);
		Collections.reverse(browserList);
		for(String b : browserList) {
			System.out.println(b);
		}
		
		System.out.println("=======================================================");
		
		
		
		
		//
		int m[] = {1000, 2000, 3000, 4000};
		int count = m.length-1;
		
		//1.
		// for(int t: m) {
		//	System.out.println(m[count]);
		//	count--;
		//}
		
		//2.sss
		//for(int t : m) {
		//	t=count;// 3
		//	System.out.println(m[t]);
		//	t--;// 2
		//	count=t;
		//}
		
		//3.
		for(int t : m) {
			t=count;
			System.out.println(m[t]);
			count--;
		}
		
		System.out.println("=======================================================");
		
		
		
		//
		Object employee[] = {"Ravi", 31, 34.55, 'm', false};
		
		for(Object e : employee) {
			System.out.println(e);
		}
		System.out.println(Arrays.toString(employee));
		System.out.println("=======================================================");
		
		// Reverse
		int emp = employee.length-1;
		for(Object e : employee) {
			e=employee[emp];
			System.out.println(e);
			emp--;
		}
		System.out.println(Arrays.toString(employee));
		// String d = Arrays.toString(employee);
		// System.out.println(d);
		
	
	}

}
