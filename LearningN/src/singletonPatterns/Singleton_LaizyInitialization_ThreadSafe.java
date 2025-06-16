package singletonPatterns;

public class Singleton_LaizyInitialization_ThreadSafe {
	
	private static Singleton_LaizyInitialization_ThreadSafe instance;
	
	private Singleton_LaizyInitialization_ThreadSafe() {
		System.out.println("This is a private Singleton_LaizyInitialization_ThreadSafe constructor");
	}
	
	// synchronized keyword makes it thread-safe
	public static synchronized Singleton_LaizyInitialization_ThreadSafe getInstance() {
		if(instance==null) {
			instance = new Singleton_LaizyInitialization_ThreadSafe();
		}
		
		return instance;
	}

}
