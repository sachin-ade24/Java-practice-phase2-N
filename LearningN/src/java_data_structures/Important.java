package java_data_structures;

import java.util.Arrays;
import java.util.List;

public class Important {

	public static void main(String[] args) {
		
		List<String> list = List.of("Prince", "Sachi", "Kalpana", "Sachin");
		System.out.println(list);//[Prince, Sachi, Kalpana, Sachin]
		
		list.stream();
		
		int[] intArr = {22,45,56,78,99};
		Arrays.stream(intArr)
	      .filter(num -> num % 2 == 0)
	      .forEach(System.out::println);
		
		/*
		 * Method Reference: System.out::println
		 * Method reference version: .forEach(System.out::println);
		 * Lambda version: .forEach(num -> System.out.println(num));
		 * */
		
		/*
		 * 
		    Array
			[22,45,56,78,99]
			
			        ↓
			
			Arrays.stream()
			
			        ↓
			
			Stream
			22 → 45 → 56 → 78 → 99
			
			        ↓
			
			filter(num -> num%2==0)
			
			        ↓
			
			Filtered Stream
			22 → 56 → 78
			
			        ↓
			
			forEach(System.out::println)
			
			        ↓
			
			Output
			22
			56
			78
		 * 
		 * */
		
	}

}
