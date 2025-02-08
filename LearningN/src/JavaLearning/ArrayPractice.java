package JavaLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPractice {

	public static void main(String[] args) {
		
		int a[] = {1, 2, 3, 4};
		System.out.println(Arrays.toString(a));
		int b[] =  new int[4];
		b[0] = 5;
		b[1] = 6;
		b[2] = 7;
		System.out.println(Arrays.toString(b));
		Object Obj[] = {12, 'A', "Sac", 13.5, true};
		System.out.println(Arrays.toString(Obj));
		for(int i=0; i<=a.length-1; i++) {
			System.out.println(a[i]);
		}
		
		ArrayList ar = new ArrayList();
		
		System.out.println(ar.size());//0
		
		ar.add(100);
		ar.add(1, 'q');
		Object o1 = ar.get(0);
		System.out.println(o1);//100
		for(int i=0; i<=ar.size()-1; i++) {
			System.out.println(ar.get(i));
		}
		
		ArrayList <Integer> markList =  new ArrayList();
		markList.add(80);
		markList.add(70);
		
		ArrayList<String> stringList = new ArrayList();
		stringList.add("Sachin");
		stringList.add("Suraj");
		for(int i=0; i<=stringList.size()-1; i++) {
			System.out.println(stringList.get(i));
		}
		
		stringList.set(0, "Sac");
		System.out.println(stringList.get(0));
		System.out.println("=====================");
		stringList.add("Selenium");
		stringList.add(3, "Cypress");
		stringList.remove(0);
		for(int i=0; i<=stringList.size()-1; i++) {
			System.out.println(stringList.get(i));
		}
		
		//
		List<Integer> l = Arrays.asList(100, 200, 300, 400);
		System.out.println(l);
		
		
	}

}
