package JavaSessions;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {

		//++ and --
		//1. post(later) increment: ++, e.g. a++
		
		int a = 1;// Current value of 'a' is 1
		int b = a++;// now value of 'a' has been incremented on line no. 10 but still it gives 
		// a's initial/current value to 'b' because it is a post increment, so increment of 'a' will happen
		// later and current value of the 'a' will be given to 'b'
		System.out.println(b);// o/p: 1 ==> current value of 'b' is 1
		// b is now 1, so b=1
		System.out.println(a);// o/p: 2 
		System.out.println(a++);// o/p: 2 ==> Prints current value of 'a' first i.e. 2 and then increment it
		
		/* important: from line no. 16 */
		/* For post increment, the current value of the variable will be printed first and then it will
		 * be incremented */
		
		
		System.out.println(a);// o/p: 3 ==> Current value of 'a' is 3
		a++;// a++ = 3 (this is the current value) + 1
		System.out.println(a);// o/p: 4
		// if b=a now then  b's current value will be 4;
		System.out.println(b);// o/p: 1
		System.out.println(b++);// o/p: 1 // b++ is also post increment of 'b' so it will print 'b' first and 
		// then it will increase the 'b'. And, now, the value of b is 2.
		System.out.println(b);// o/p: 2
		System.out.println(b++);// o/p: 2 because it's again a post increment and it will print b's value first 
		// and then increase the value of 'b' and therefore the value of 'b' is now 3
		System.out.println(b);// o/p: 3
		
		System.out.println("============================");
		
		int c = -98;
		int d = c++;
		System.out.println(c);// o/p: -97
		System.out.println(d);// o/p: -98
		
		System.out.println("=================================================================");
		
		//2. pre(before) increment: ++, e.g. ++a
		int e =1;
		int f = ++e;
		System.out.println(e);// o/p: 2
		System.out.println(f);// o/p: 2
		
		/*first it will increase the value of 'e' first and then save it to 'e' 
		 * and at the same time give that to 'f'*/
		
		int p =-999;
		int q =++p;
		System.out.println(p);// o/p: -998
		System.out.println(q);// o/p: -998
		
		
		//3. post(later) decrement: --, e.g. a--
		int x = 2;
		int y = x--;
		
		System.out.println(x);// o/p: 1
		System.out.println(y);// o/p: 2
		
		//4. pre(before) decrement: --, e.g. --a
		int v = 2;
		int w = --v;
		System.out.println(v);// o/p: 1
		System.out.println(w);// o/p: 1
		
		int t1 = -99;
		int t2 = --t1;
		System.out.println(t1);// o/p: -100
		System.out.println(t2);// o/p: -100
		
		int total = 10;
		System.out.println(total++);// o/p: 10 (current value) and value of 'total' in the memory is 11;
		System.out.println(total);// o/p: 11 i.e. the current value of the 'total' variable
		
		int pop = 10;
		System.out.println(++pop);// o/p: 11
		/* increment the value first and print the current value*/
		System.out.println(pop);// o/p: 11, current value of the 'pop' is 11.
		
		int m = 2;
		int n = 3;
		int sum = m++ - n++ + ++m - --n;
		System.out.println(sum);// o/p: 2 - 3 + 4 - 3 = 0
		
		int o1 = 2;
		int o2 = 3;
		int sum1 = ++o1 - o2++ + --o1 - o2++;
		System.out.println(sum1);// o/p is -2 ==> 3(3) - 3(4) + 2(2) - 4(5) = 0 - 2 = -2
		System.out.println(o1);// o1=2 ==> Current value of 'o1'
		System.out.println(o2);// o2=5 ==> Current value of 'o2'
		
		int u = 10;
		System.out.println(1+u);// o/p: 11
		System.out.println(u);// o/p: 10
		
		int cc = 'a'; 
		System.out.println(++cc);// here, a = 97 // o/p: 98
		System.out.println(cc);// o/p: 98
		System.out.println((int)cc);// o/p: 98
		System.out.println((int)++cc);// o/p: 99
		
		int top = 1;
		int pr = top++;// here only we got pr's value as well as top's value
		System.out.println(top);// o/p: 2 // here we are just printing pr's current value
		System.out.println(pr);// o/p: 1 // here we are just printing top's current value
		
		// I want to increase 'top' 2 times then,
		// System.out.println(top++++); // wrong syntax
		// System.out.println((top++)++); // wrong syntax
		
		System.out.println(top+2);// allowed and o/p: 4
		System.out.println(top);// o/p: 2 ==> current value of 'top'
		
		/*so, increment(or decrement) of the variable's (current) value in (the memory) will happen with  
		 * 'increment'(or 'decrement') operators, not just adding 1 or 2 or etc to the varable's 
		 * current value */
		
		
		

	}

}
