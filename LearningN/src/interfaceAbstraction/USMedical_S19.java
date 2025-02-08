package interfaceAbstraction;

public interface USMedical_S19 extends WHO_S19{
	
	//we cannot create constructors and Objects of the interfaces
	
	//Can interface have global variables
	//yes, but they are by default static and final
	int min_fee = 100;

	//In interface we cannot define the method body
	//Meaning no method body or no method implementation
	//only method declaration - only method prototype
	//We cannot create an Object of the interface
	
	//A method without body is called an 'abstract' method
	//You can use 'abstract' keyword, but it is not mandatory to write
	//by default the methods of the interfaces are abstract methods 
	
	
	//****Important***
	//Interfaces give '100% abstraction' meaning 
	//'hiding the implementation'
	//Because, all the methods in interfaces are generally 
	//abstract in nature
	//Abstract is an Object oriented concept
	//Static is not part of Object oriented stuff
	public abstract void physioServices();
	
	public void oncologyServices();
	
	public void dentalServices();
	
	public void emergencyServices();
	
	public int payment(int amount);
	
	//============================================================
	
	//From jdk1.8 there are two major changes in interface
	//1. we can have a method with body but that method should be
	//'static'
	
	public static void medicalBilling() {
		System.out.println("US -- medicalBilling");
	}
	//We cannot override the static method
	//but we can do method hiding
	
	
	//'default' can be written in the interface with the body
	//'default' keyword is applicable for interface only
	//WE can define a 'default' method in an interface
	default void medicalNews() {
		System.out.println("US -- medicalNews");
	}
	//default method can be overridden by using 'public' access by child
	//class
	
	//We can write a main method in the interface but it is not useful
	//public static void main(String[] args) {}

}
