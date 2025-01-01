package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		ArrayList<String> browserList = new ArrayList<String>();
		browserList.add("chrome");
		browserList.add("firefox");
		browserList.add("edge");
		browserList.add("ie");
		
		for(int i=0; i<browserList.size(); i++) {
			System.out.println(browserList.get(i));
		}
		System.out.println();
		for(String br : browserList) {
			System.out.println(br);
		}
		System.out.println();
		for(int i=0; i<browserList.size(); i++) {
			System.out.println(browserList.get(i));
			if(browserList.get(i).equals("firefox")) {
				System.out.println("Launch the " + browserList.get(i) + " browser");
				break;
			}
		}
		System.out.println();
		for(String br : browserList) {
			System.out.println(br);
			if(br.equals("firefox")) {
				System.out.println("Launch the " + br + " browser");
				break;
			}
		}
		
		

	}

}
