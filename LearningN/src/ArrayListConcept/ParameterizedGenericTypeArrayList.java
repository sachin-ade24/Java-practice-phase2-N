package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParameterizedGenericTypeArrayList {

	public static void main(String[] args) {
		
		//ArrayList<Integer> markList = new ArrayList<>();//valid
		ArrayList<Integer> markList = new ArrayList<Integer>();
		//vc=10; pc=0
		
		markList.add(80);//vc=9; pc=1
		markList.add(70);//vc=8; pc=2
		
		System.out.println(markList.size());//pc=2 --> pc=size=2
		System.out.println(markList);
		
		ArrayList<Double> dataList = new ArrayList<Double>();
		dataList.add(200.0);
		
		//
		ArrayList<Object> empInfo = new ArrayList<Object>();
		empInfo.add("Tom");//vc=10;pc=0
		empInfo.add(30);
		empInfo.add(12.33);
		empInfo.add('m');
		empInfo.add(true);//vc=5;pc=5
		System.out.println(empInfo.size());//vc=5;pc=5
		System.out.println(empInfo);
		
		ArrayList<String> browserList = new ArrayList<String>();
		browserList.add("chrome");
		browserList.add("firefox");
		browserList.add("edge");
		browserList.add("ie");
		browserList.add(4, "Sachin");
		
		System.out.println("Size of Array: " + browserList.size());
		System.out.println(browserList.get(1));
		System.out.println(browserList);
		System.out.println("====================");
		
		browserList.remove(4);
		System.out.println("Size of Array: " + browserList.size());
		
		//
		for(int i = 0; i<=browserList.size()-1; i++) {
			System.out.println(browserList.get(i));
		}
		
		//
		for(String s : browserList) {
			System.out.println(s);
		}
		
		
		//This is immutable array list
		//vc concept is not applicable here
		//because we are not creating any array list Object here
		List<Integer> ls = Arrays.asList(100, 200, 300, 400);
		ls.remove(0);//not possible because given array list is immutable
		ls.add(4, 500);//not possible because given  array list is immutable
		ls.set(0, 0);//not possible because given  array list is immutable
	}

}
