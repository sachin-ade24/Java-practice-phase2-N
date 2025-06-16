package singletonPatterns;

public class Singleton_EagerIntialization {
	
	private static final Singleton_EagerIntialization instance = new Singleton_EagerIntialization();
	
	private Singleton_EagerIntialization() {
		System.out.println("This is a private Singleton_EagerIntialization constructor.");
	}
	
	public static Singleton_EagerIntialization getInstance() {
		return instance;
	}

}
