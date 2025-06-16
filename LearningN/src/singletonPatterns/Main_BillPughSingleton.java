package singletonPatterns;

public class Main_BillPughSingleton {

	public static void main(String[] args) {
		
		Singleton_BillPughSingleton s1 = Singleton_BillPughSingleton.getInstance();
		
		Singleton_BillPughSingleton s2 = Singleton_BillPughSingleton.getInstance();
		
		if(s1 == s2) {
			System.out.println("Both references point to the same instance.");
		} else {
			System.out.println("Different instances (something went wrong).");
		}

	}

}
