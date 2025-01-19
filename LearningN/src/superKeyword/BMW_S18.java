package superKeyword;

public class BMW_S18 extends CarS18{
	
	int speed = 200;
	
	@Override
	public void start() {
		//If we want to take some features from the Car class i.e. from
		//parent class 'start' method, then we have two choices
		//1. create the Object of Car class here
		//2. use 'super' key word
		
		//1. Create the Object
		//CarS18 c = new CarS18();
		//c.start();
		//but this unnecessary creation of an object
		//instead of that we can use 'super' keyword
		
		//2. 'super' keyword
		super.start();
		
		System.out.println("BMW -- start");
	}
	
	public void displaySpeed() {
		//System.out.println(speed);
		
		//but if I want to utilize the Car class i.e. 
		//the parent class speed integer for doing some calculations
		//and displaying speed, then we can use 'super' keyword for
		//parent class speed variable and then print the child class speed
		System.out.println(super.speed);//100
		
		System.out.println(speed);//200
		
		//Can we use grand parent speed property using 'super' keyword
		//if we comment Car class's speed, then it will display Vehicle
		//class speed. Means in this case we can directly use speed from
		//grand parent
		//It means that, if the parent contains the variable then that 
		//will be called first using 'super',
		//if parent does not contain the variable,
		//then, it will check whether grand parent contains variable or
		//not, and if yes, it will call grand parents variable, using
		//'super' keyword
		//'super' --> means always go to the parent first and then grand
		//parent and so on..
		
		//System.out.println(super.speed);
		
		//But if I still want to use grand parents 'speed', 
		//even after my parent has same 'speed' variable name, then?
		
		//we can make speed of grand parent static and then we can call it
		//System.out.println(VehicleS18.speed);
		
		//if you don't want to make it static then, create an object
		//VehicleS18 v = new VehicleS18();
		//System.out.println(v.speed);
		
		//We can create an method in the Car class i.e. in parent class
		//for using vehicle speed and 
		//we can call that method in test class or here in BMW class
		getVehicleSpeed();//inherited from parent i.e. from Car class
		
	}

	//This is method hiding concept
	public static void billing() {
		//Can we use parent variable in static method?
		//super.billing();//Error: Cannot use super in a static context
		//instead of using 'super' keyword in static method, 
		//we can use parent class name
		CarS18.billing();
		System.out.println("BMW -- billing");
	}


}
