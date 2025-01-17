package method.calling;

public class UserS14 {
	
	
	public void m1() {
		System.out.println("m1 method");
		//m2();//valid
		
		//'m1' is calling 'm1'
		//m1();//valid --> but initiates infinite calling
	}
	
	public void m2() {
		System.out.println("m2 method");
		//m3();//valid
		
		//non-static 'm2' is calling static 't1'
		//t1();//valid
	}
	
	public void m3() {
		System.out.println("m3 method");
		//m1();
		//infinite calling
		//StackOverflowError
		t2();//valid --> static method
		UserS14.t2();//valid
	}
	
	public static void t1() {
		//It will be created in the 'meta space/cma/permanent generation'
		System.out.println("t1 method");
		t2();//valid
		//m1();//not valid
		UserS14 us1 = new UserS14();
		us1.m1();
	}
	
	public static void t2() {
		System.out.println("t2 method");
		t3();//valid
		UserS14.t3();//valid
		t2();//valid
	}
	
	public static void t3() {
		System.out.println("t3 method");
	}
	
	public static void main(String[] args) {
		
		//main method is static method, so it will go into 'meta space'
		
		//Non static methods
		UserS14 u1 =  new UserS14();
		
		u1.m1();//stack will be created, memory will be allocated
		
		//
		//one-one copy of methods saved to 'heap' memory
		//object 'u1' will be saved into 'stack' memory
		//main() method will be saved in 'meta space'
		
		//The execution requires some memory
		//Execution will take/borrow 'stack' memory for some time
		
		//
		//if we do infinite/circular calling:
		//the allocation of memory of the execution of methods:
		//main(), m1, m2, m3, m1, m2, m3, m1...
		//will keep on..
		//deallocation of the memory will not happen
		
		//Due to infinite calling the 'stack overflow' will happen..
		
		//Stack allocation - Stack deallocation ==> LIFO
		//LIFO: Last in first out
		
		System.out.println("==========================================");
		
		// Static methods
		UserS14.t1();//stack will be created, memory will be allocated
		//t1();//stack will be created, memory will be allocated

	}

}
