package singletonPatterns;

public class Main_EagerIntialization {
	
	public static void main(String[] args) {
		
		Singleton_EagerIntialization pat1 = Singleton_EagerIntialization.getInstance();
		
		Singleton_EagerIntialization pat2 =  Singleton_EagerIntialization.getInstance();
		
		if(pat1 == pat2) {
			System.out.println("Both references point to the same EagerSingleton instance.");
		} else {
			System.out.println("Different instances (Something went wrong).");
		}
	}

}
