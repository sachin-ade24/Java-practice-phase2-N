package superKeyword;

public class CarS18 extends VehicleS18{
	
	int speed = 100;
	//if you want to use Vehicle speed i.e. parent speed,
	//simply write like,(given below)
	//int speed = super.speed;
	//or you can create a method for using speed of grand parent for BMW
	
	public void getVehicleSpeed() {
		System.out.println(super.speed);
	}
	
	public void start() {
		super.start();
		System.out.println("Car -- start");
	}
	
	public void stop() {
		System.out.println("Car -- stop");
	}

	public static void billing() {
		System.out.println("Car -- billing");
	}

}
