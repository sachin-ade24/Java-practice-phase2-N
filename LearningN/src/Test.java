import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		
		HashMap<String, Integer> num = new HashMap<String, Integer>();
		
		num.put("First", 1);
		num.put("Second", 2);
		num.put("Third", 3);
		num.put("Fourth", 4);
		num.put("Fifth", 5);
		
		
		ArrayList<Integer> valueList = new ArrayList<Integer>();
		
		valueList.addAll(num.values());
		System.out.println(valueList);
		
		Collections.sort(valueList);
		
		System.out.println(valueList);

	}

}
