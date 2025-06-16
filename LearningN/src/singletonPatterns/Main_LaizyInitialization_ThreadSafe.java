package singletonPatterns;

public class Main_LaizyInitialization_ThreadSafe extends Thread {

	public static void main(String[] args) {
		
		Singleton_LaizyInitialization_ThreadSafe t1 = Singleton_LaizyInitialization_ThreadSafe.getInstance();
		Singleton_LaizyInitialization_ThreadSafe t2 = Singleton_LaizyInitialization_ThreadSafe.getInstance();
		
		System.out.println(t1==t2);
		
	}

}
