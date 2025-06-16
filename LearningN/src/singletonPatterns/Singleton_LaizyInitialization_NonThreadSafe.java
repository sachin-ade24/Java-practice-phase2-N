package singletonPatterns;

public class Singleton_LaizyInitialization_NonThreadSafe {
	
	/*
	 
	 🔷 What is the Singleton Pattern?
		Singleton Pattern ensures that a class has only one instance and provides a global point of access to it.

		✅ Why use Singleton?
		To control object creation (only one instance).
		
		Useful in scenarios like:
		
		- Logging
		
		- Database connections
		
		- Configuration managers
		
		- Thread pools
		
		🔷 Key Concepts
		- Private constructor – Prevents instantiation from outside.
		
		- Static instance – Holds the single instance.
		
		- Public static method – Provides access to the instance (global access point).
		
		🔶 Types of Singleton Implementations
			- Lazy Initialization (Non-thread-safe)
		
			- Lazy Initialization (Thread-safe)
				
			- Eager Initialization
				
			- Bill Pugh Singleton (Best approach using static inner class)
	 
	 */
	
	
	// Step 1: Create a private static variable to hold the single instance
	private static Singleton_LaizyInitialization_NonThreadSafe instance;
	
	// Step 2: Make the constructor private so that this class cannot be instantiated from outside
	private Singleton_LaizyInitialization_NonThreadSafe() {
		System.out.println("private SingletonPattern1 constructor.");
	}
	
	// Step 3: Create a public static method that returns the instance
	public static Singleton_LaizyInitialization_NonThreadSafe getInstance() {
		if (instance == null) {
			instance = new Singleton_LaizyInitialization_NonThreadSafe(); // if instance is not created (null), create it
		}
		
		return instance;
	}
	
	
	
	
	
	
	
	
	
}
