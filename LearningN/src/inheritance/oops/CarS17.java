package inheritance.oops;

public /*final*/ class CarS17 extends VehicleS17{
	
	//public 'final' class CarS17 extends VehicleS17
	//'final' class is used to prevent inheritance
	//if you use 'final' with class, then that class will no longer
	//be a parent class for any other class
	//e.g. in this care if Car class become final class, it will no longer
	//be the parent of BMW and Audi class
	
	//final keyword is used for constant/fixed values 
	//e.g. universal truths, login page class, four wheels for a car, 
	//days of a week, months of a year etc.
	
	//'final' keyword can be used with method also
	//If you use 'final' keyword with method, then that method
	//cannot be overridden
	
	//@Override --> Invalid. Not applicable for variables.
	final int speed = 100;
	
	@Override
	public void start() {
		System.out.println("Car - start");
	}
	
	public void stop() {
		System.out.println("Car - stop");
	}
	
	public void refuel() {
		System.out.println("Car - refuel");
	}
	
	//below 'final' method cannot be overridden but can be inherited
	public final void increaseSpeed() {
		System.out.println("Car - increaseSpeed");
	}
	
	//static method: cannot be overridden but can be inherited
	//Its Car class's individual method
	public static void billing() {
		System.out.println("Car - billing");
	}
	
	//difference between both of them is:
	//We cannot even define or write same 'final' method in 
	//the child class but we can write new 'static' method 
	//with same name in child class and this concept is called
	//'method hiding'
	
	
	//
	//private method: cannot be overridden but can be inherited via public method
	private void getCarInfo() {
		System.out.println("Car -- getCarInfo");
	}

	public void getInfo() {
		getCarInfo();
	}
}
