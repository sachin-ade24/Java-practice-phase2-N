package java_data_structures;

import java.util.ArrayList;

public class ArrayToArrayListConversion {
	
	static String[] strArray = {"SSC", "HSC/Diploma", "Graduation", "Post Graduation"};
	
	public static ArrayList<String> arrayToArrayList(String[] strArr) {
		ArrayList<String> educationLevels = new ArrayList<>();
		/*
		for(int i=0; i<strArr.length; i++) {
			educationLevels.add(strArr[i]);
		}
		*/
		for(String s: strArr) {
			educationLevels.add(s);
		}
		return educationLevels;
	}

	public static void main(String[] args) {
		
	    ArrayList<String> myArrayList = arrayToArrayList(strArray);
	    System.out.println(strArray.getClass());//class [Ljava.lang.String;
	    System.out.println(myArrayList.getClass());//class java.util.ArrayList
	    System.out.println(myArrayList);
	    //[SSC, HSC/Diploma, Graduation, Post Graduation]

	}

}
