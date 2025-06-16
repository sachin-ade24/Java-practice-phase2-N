// 1. Lazy Initialization (Non-thread-safe)

package singletonPatterns;

public class MultiThreadExample extends Thread {

    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
    
    /*
     currentThread():
     
     * Returns the Thread object for the current thread.
     * This line prints a message showing which thread is currently running.
     * Thread.currentThread() gives a reference to the thread that is currently executing.
     * .getName() gives the default name of the thread (like "Thread-0", "Thread-1", etc.).
     */
    
    //public static final MultiThreadExample t  = new MultiThreadExample(); // allowed
    //MultiThreadExample t  = new MultiThreadExample(); // allowed
    
    public static void main(String[] args) {
    	
    	//final MultiThreadExample t  = new MultiThreadExample();// allowed
    	//public static final MultiThreadExample t  = new MultiThreadExample(); // not allowed
    	
        MultiThreadExample t1 = new MultiThreadExample();
        
        /*
          🔹 You're creating an object t1 of your MultiThreadExample class.
          🔹 Since MultiThreadExample extends Thread, t1 is a thread object.
          🔹 At this point, the thread is just created but not started yet.
        */
        
        MultiThreadExample t2 = new MultiThreadExample();

        t1.start();
        
        /*
         t1.start();
			🔹 This starts the thread by calling its start() method.
			🔹 Behind the scenes:
				- A new call stack is created.
				- JVM internally calls run() method of t1.
        */
        
        t2.start();
    }
    
    /*
     ❌ Issue: Not thread-safe
	🔍 Explanation:
	In a multi-threaded environment, two threads can simultaneously check if (instance == null) and both will find it true.
	
	As a result, both threads create their own Singleton instance, violating the Singleton rule.
	
	🔧 When does it happen?
	When multiple threads try to access getInstance() at the same time during the first-time creation.
	
	💥 Problem caused:
	Multiple instances are created = Singleton pattern breaks.
	
	This leads to inconsistent behavior in the application.
     */
	
}
