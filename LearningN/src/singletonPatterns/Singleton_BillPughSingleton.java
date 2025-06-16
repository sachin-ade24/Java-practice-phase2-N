package singletonPatterns;

public class Singleton_BillPughSingleton {
	
	private static class SingletonHelper {
		private static final Singleton_BillPughSingleton instance = new Singleton_BillPughSingleton();
	}
	
	private Singleton_BillPughSingleton() {
		System.out.println("Singleton_BillPughSingleton instance created");
	}
	
	public static Singleton_BillPughSingleton getInstance() {
		return SingletonHelper.instance;
	}
}
