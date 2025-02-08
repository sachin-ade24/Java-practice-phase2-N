package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLiterals {

	public static void main(String[] args) {
		
		ArrayList<String> browserList = 
				new ArrayList<String>(Arrays.asList("chrome", "firefox", "edge"));
		
		System.out.println(browserList);
		
		//"browserList" is mutable because we are creating 
		//a new ArrayList here, we are using 'new' keyword to create 
		//a new Object of ArrayList class
		browserList.add("safari");//valid
		
		System.out.println(browserList);
		
		//Then what should we do to create an immutable ArrayList?
		List<String> osList = Arrays.asList("windows", "mac", "linux");
		System.out.println(osList);//[windows, mac, linux]
		//now you cannot add anything in the above immutable list
		//again you will get UnsupportedOperation exception

		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		
		
		
		
		
		
		
	}

}
