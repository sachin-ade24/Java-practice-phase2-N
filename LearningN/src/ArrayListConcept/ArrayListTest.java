package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		//ArrayList -- default class
		//dynamic array
		//size is not fixed
		
		ArrayList ar = new ArrayList();
		
		System.out.println(ar.size());
		
		ar.add(100);//0th
		ar.add(200);//1st
		
		System.out.println(ar.size());//2
		
		ar.add(300);//2nd
		ar.add(400);//3rd
		
		System.out.println(ar.size());//4
		
		System.out.println(ar.get(0));//100
		//System.out.println(ar.get(4));//IndexOutOfBoundsException:
		ar.add(500);
		System.out.println(ar.get(4));//500
		System.out.println(ar.size());//5
		
		System.out.println(ar.get(2));//300
		ar.remove(2);//shrinking the array
		System.out.println(ar.size());//4
		System.out.println(ar.get(2));//400
		
		System.out.println("=============================================");
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("=============================================");
		
		ArrayList at = new ArrayList(5);//Virtual Capacity (vc) = 5
		//Physical Capacity (pc) = 0
		System.out.println(at.size());//0 --> PC
		at.add(100);
		at.add(12.33);
		at.add("Tom");
		at.add('c');
		at.add(true);
		//above array lists are a raw type
		//create a generic array list to get rid of the yellow color warnings
		
		
		System.out.println("=============================================");
		//Student marks: Integer
		ArrayList<Integer> markList = new ArrayList();//vc=10, pc=0
		//The Integer class wraps a value of the primitive type int in an object. 
		//An object of type Integer contains a single field whose type is int. 
		markList.add(80);
		markList.add(70);//vc=8, pc=2
		//markList.add(80.12);//not allowed ==> because ArrayList is <Integer>
		//markList.add("79");//not allowed ==> because ArrayList is <Integer>
		System.out.println(markList.size());//2
		
		
		//
		ArrayList<Double> dataList = new ArrayList();
		//Add only and only double data
		dataList.add(12.33);//allowed
		//dataList.add(200);//not allowed
		dataList.add(200.00);
		System.out.println(dataList);//[12.33, 200.0]
		
		
		//
		ArrayList<String> browserList = new ArrayList<String>();
		browserList.add("chrome");
		browserList.add("firefox");
		browserList.add("edge");
		browserList.add("ie");
		
		System.out.println(browserList.size());//4 --> 0 to 3
		//vc=6, pc=4
		System.out.println(browserList.get(1));//firefox
		System.out.println(browserList);//[chrome, firefox, edge, ie]
		
		
		//empData:
		ArrayList<Object> empData = new ArrayList<Object>();//vc=10, pc=0
		empData.add("Sachin");
		empData.add(30);
		empData.add(12.33);
		empData.add('m');
		empData.add(true);
		
		System.out.println(empData.size());//5
		//vc=5, pc=5
		System.out.println(empData);//[Sachin, 30, 12.33, m, true]
		

		
		
	}

}
