package practice2026;

public class PracticeFeb11_1 {
	
	String s1;
	
	public void m1() {
		System.out.println("m1");
	}
	
	public static void m2() {
		System.out.println("m2");
	}
	
	public void m3() {
		this.s1 = "Yes";
		m1();//no need to create an object to call m1();
		// this.m1() ==> allowed
		// m2() ==> allowed
		PracticeFeb11_1.m2();// this.m2() ==> not allowed
		System.out.println("m3");
	}

	public static void main(String[] args) {
		
		PracticeFeb11_1 a1 = new PracticeFeb11_1();
		
		a1.s1 = "Sachin";
		a1.s1 = "Sac";
		
		a1.m1();
		m2();

	}

}
