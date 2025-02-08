package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> browserList = new ArrayList<String>();
		browserList.add("chrome");
		browserList.add("firefox");
		browserList.add("edge");
		browserList.add("ie");
		browserList.add("opera");
		browserList.add("brave");
		
		System.out.println(browserList.size());//7
		
		//add:
		//browserList.add("naveen");
		browserList.add(0, "naveen");
		System.out.println(browserList);
		//[naveen, chrome, firefox, edge, ie, opera, brave]
		//In this case data will be retained only new data will be added to a
		//certain index
		//browserList.add(9, "Sachin");
		//System.out.println(browserList);
		//IndexOutOfBoundsException:
		
		//set:
		browserList.set(0, "duckduckgo");
		System.out.println(browserList);
        //[duckduckgo, chrome, firefox, edge, ie, opera, brave]
		//In this case data loss happens, it replaces the data available at 
		//a certain index
		
		//
		browserList.remove(0);
		System.out.println(browserList);
		//[chrome, firefox, edge, ie, opera, brave]
		browserList.remove("brave");
		System.out.println(browserList);
		//[chrome, firefox, edge, ie, opera]
		browserList.removeAll(browserList);
		System.out.println(browserList);//[]
		
		//
		browserList.clear();//
		System.out.println(browserList);//[]
		
		//
		browserList.add(0, "chrome");
		browserList.add(0, "firefox");
		browserList.add(0, "edge");
		browserList.add(0, "ie");
		System.out.println(browserList);//[ie, edge, firefox, chrome]
		browserList.add(0, "chrome");
		System.out.println(browserList);//[chrome, ie, edge, firefox, chrome]
		browserList.set(0, "chrome");//[chrome, ie, edge, firefox, chrome]
		browserList.set(0, "firefox");//[firefox, ie, edge, firefox, chrome]
		browserList.set(0, "edge");//[edge, ie, edge, firefox, chrome]
		browserList.set(0, "ie");//[ie, ie, edge, firefox, chrome]
		System.out.println(browserList);//[ie, ie, edge, firefox, chrome]
		browserList.set(0, "chrome");
		browserList.set(1, "firefox");
		browserList.set(2, "edge");
		browserList.set(3, "ie");
		System.out.println(browserList);//[chrome, firefox, edge, ie, chrome]
		browserList.remove(4);
		System.out.println(browserList);//[chrome, firefox, edge, ie]
		
		
		//
		System.out.println(browserList.clone());//[chrome, firefox, edge, ie]
		System.out.println(browserList.contains("chrome"));//true
		System.out.println(browserList.indexOf("firefox"));//1
		//Returns the index of the first occurrence of the specified element in this list, 
		//or -1 if this list does not contain the element.
		browserList.add(3, "chrome");
		System.out.println(browserList);//[chrome, firefox, edge, chrome, ie]
		System.out.println(browserList.lastIndexOf("chrome"));//3
		
		System.out.println("================================================");
		
		//Creating immutable array list
		//You cannot add a new object in it
		List<Integer> ls = Arrays.asList(100, 200, 300, 400);
		System.out.println(ls);//[100, 200, 300, 400]
		//ls.add(500);
		//System.out.println(ls);//UnsupportedOperationException
		//Cannot add a new object here
		
		System.out.println("================================================");
		
		browserList.remove(3);
		browserList.add("opera");
		browserList.add("brave");
		browserList.add("safari");
		System.out.println(browserList);
		
		Collections.sort(browserList);
		System.out.println(browserList);
		
		
		//
		System.out.println("=============================================");
		ArrayList<Integer> markList = new ArrayList();//vc=10, pc=0
		//vc=10, pc=0
		markList.add(80);//vc=9, pc=1
		markList.add(70);//vc=8, pc=2
		markList.add(10);//vc=7, pc=3
		markList.add(4);//vc=6, pc=4
		markList.add(700);//vc=5, pc=5
		System.out.println(markList);//[80, 70, 10, 4, 700]
		//sort:
		//Collections.sort(markList);
		//System.out.println(markList);//[4, 10, 70, 80, 700]
		//reverse:
		//Collections.reverse(markList);
		//System.out.println(markList);//[700, 4, 10, 70, 80]
		//reverseOrder
		//Collections.sort(markList, Collections.reverseOrder());
		//System.out.println(markList);//[700, 80, 70, 10, 4]
		
		Collections.swap(markList, 0, 4);
		System.out.println(markList);//[700, 70, 10, 4, 80]
		Collections.swap(markList, 0, markList.size()-1);
		System.out.println(markList);//[80, 70, 10, 4, 700]
		
		
	}

}
