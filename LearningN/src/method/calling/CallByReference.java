package method.calling;

public class CallByReference {
	
	public void m1() {
		System.out.println("m1 method");
		//m1();//valid --> but initiates infinite calling
		CallByReference.t2();
	}
	
	public void m2() {
		System.out.println("m2 method");
		//m2();//valid --> but initiates infinite calling
		//m1();//valid --> but initiates infinite calling
		UserS14.t1();
	}
	
	public void m3() {
		System.out.println("m3 method");
	}
	
	public static void t1() {
		//It will be created in the 'meta space/cma/permanent generation'
		System.out.println("t1 method");
		//t2();//valid --> but initiates infinite calling
		//m1();//not valid
		UserS14 us1 = new UserS14();
		us1.m2();
	}
	
	public static void t2() {
		System.out.println("t2 method");
		//t2();//valid --> but initiates infinite calling
		//CallByReference.t1();//valid --> but initiates infinite calling
		//UserS14 us1 = new UserS14();//valid --> but initiates infinite calling
		//us1.m2();//valid --> but initiates infinite calling
	}
	
	public static void t3(CallByReference object) {
		object.m1();
	}

	public static void main(String[] args) {

		//Non static
		CallByReference obj = new CallByReference();
		//obj.m3();
		
		//Static
		CallByReference.t3(obj);
		//obj-->goes to-->object
		//obj-->will call-->m1()

	}

}
