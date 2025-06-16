package singletonPatterns;

public class Main_LaizyInitialization_NonThreadSafe {

	public static void main(String[] args) {
		
		// SingletonPattern1 s1 = new SingletonPattern1 ();// Not allowed
		// Error: The constructor SingletonPattern1() is not visible -- because its a private constructor
		
		Singleton_LaizyInitialization_NonThreadSafe s1 = Singleton_LaizyInitialization_NonThreadSafe.getInstance();
		Singleton_LaizyInitialization_NonThreadSafe s2 = Singleton_LaizyInitialization_NonThreadSafe.getInstance();
		
		System.out.println(s1 == s2);
		
		// Issue: Not thread-safe – multiple threads can create multiple instances.
	}

}
