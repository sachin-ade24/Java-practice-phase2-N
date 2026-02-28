package practice2026;

public class Feb21_NonAccessModifiers {
	
	/*
	 * Non Access Modifiers:
	   Non-access modifiers do not control visibility (like public or private), but instead add 
	   other features to classes, methods, and attributes. The most commonly used non-access 
	   modifiers are final, static, and abstract.
	 
	 * 
	*/
	
	/*
	 * For classes: you can use either final or abstract.
	 * final: The class cannot be inherited by other classes
	 * abstract	The class cannot be used to create objects (To access an abstract class, 
	   it must be inherited from another class.)
	 
	 * 
	*/
	
	/*
	 * For attributes and methods:
	 * final: Attributes and methods cannot be overridden/modified
	 * static: Attributes and methods belong to the class, not to objects. This means all objects 
	   share the same static attribute, and static methods can be called without creating objects.
	 * abstract: Can only be used in an abstract class, and can only be used on methods. 
	   The method does not have a body, for example abstract void run();. 
	   The body is provided by the subclass (inherited from).
	 * synchronized: Methods can only be accessed by one thread at a time
	 * 
	*/

}
