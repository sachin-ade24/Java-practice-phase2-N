package inheritance.oops;

public class BMW_S17 extends CarS17{
	
	//public class BMW_S17 extends CarS17, TruckS17 --> not allowed
	//child cannot extend two parent class
	//At one time it can extend only one class
	//So, for a child class, only one parent will exist
	
	int speed = 200;
	
	@Override //valid, because the parent 'Car' has same method 
	//with same name
	public void start() {
		System.out.println("BMW - start");
	}
	
	//@Override --> invalid
	public void autoParking() {
		System.out.println("BMW - autoParking");
	}
	
	@Override //valid, because the parent 'Vehicle' has same method 
	//with same name
	public void engine() {
		System.out.println("BMW -- engine");
	}
	
	//Error: Cannot override the final method from CarS17
	//@Override //still shows error
	//public final void increaseSpeed() {
	//	System.out.println("Car - increaseSpeed");
	//}
	//'final' method cannot be overridden

	//but BMW or other children of the CarS17 class can inherit the 
	//'final' method
	//go to the CarTest and try to inherit the method
	
	
	//
	//static method
	//@Override --> invalid
	//writing same static method in parent and child, then it is called
	//'method hiding'
	//public static void billing() {
	//	System.out.println("Car - billing");
	//}
	//static methods cannot be overridden by child
	//child can create its own static method with the same name
	
	//but the BMW can inherit the Car class static method 
	
	
	//
	//private method:
	//@Override --> cannot be overridden
	//Therefore this is not a Car class method
	//it is BMW's own individual method
	private void getCarInfo() {
		System.out.println("BMW_Car -- getBMWInfo");
	}
	
	public void getBMWInfo() {
		getCarInfo();
		CarS17 cb = new BMW_S17();
		cb.getInfo();
	}
	
}
