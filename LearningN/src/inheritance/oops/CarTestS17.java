package inheritance.oops;

public class CarTestS17 {

	public static void main(String[] args) {

		BMW_S17 b = new BMW_S17();
		
		//Though Car has start method 
		//but It is coming from BMW  i.e. individual method
		b.start();//This is BMW start method
		//child (BMW) -- overridden
		
		
		//Inherited from Car i.e. from parent
		b.stop();//This is Car stop method
		b.refuel();//This is Car refuel method
		b.engine();//This is VehicleS17 class but overridden by BMW
		
		//Its own method - from BMW 
		b.autoParking();//individual method of BMW
		
		System.out.println(b.speed);
		
		System.out.println("=======================================");
		
		//
		Audi_S17 au = new Audi_S17();
		au.start();//parent method i.e. from Car
		au.refuel();//parent method i.e. from Car
		au.stop();//parent method i.e. from Car
		au.theftSafty();//Individual method i.e. Audi class method
		au.engine();//This is VehicleS17 class i.e. grand parent class
		System.out.println(au.speed);
		
		System.out.println("=======================================");
		
		//
		CarS17 c = new CarS17();
		c.start();
		c.stop();
		c.refuel();
		c.engine();//This is VehicleS17 class i.e. grand parent class
		System.out.println(c.speed);
		
        //Important**************************************************
		System.out.println("=======================================");
		
		//****Top Casting***//
		CarS17 c1 = new BMW_S17();
		c1.refuel();//parent -- Car
		c1.stop();//parent -- Car
		c1.start();//Overridden method
		c1.engine();//grand parent
	    //c1.autoParlking();//invalid
	    //because it is completely belongs to BMW class
		//here 'reference type check' concept is applicable
		//'reference type check' will fail here, because
		//autoParlking() method is not at all connected with Car class
		//it belongs to BMW --> individual method
		
		
		//down casting
		//BMW_S17 b1 = new CarS17();//invalid
		//error: Type mismatch: cannot convert from CarS17 to BMW_S17
		
		//we can forcefully cast  it into BMW
		//BMW_S17 b1 = (BMW_S17) new CarS17();//does not show error but
		//we will get exception at run time
		//Exception: ClassCastException
		//down casting is not allowed
		
		//again top casting examples we will see:
		c1.getInfo();//valid
		//c1.getBMWInfo();//invalid --> Reference type check will fail
		c1.increaseSpeed();//valid
		BMW_S17.billing();//inherited from Car class
		//But if you add BMW's billing method, it will give you 
		//BMW billing
		
		
		System.out.println("=======================================");
		
		//
		VehicleS17 v1 = new BMW_S17();
		v1.engine();//overridden by BMW
		
		//down casting
		//BMW_S17 b1 = new VehicleS17();//invalid
		//error: Type mismatch: cannot convert from CarS17 to BMW_S17
		
		//we can forcefully cast  it into BMW
		//BMW_S17 b1 = (BMW_S17) new VehicleS17();//does not show error but
		//we will get exception at run time
		//Exception: ClassCastException
		//down casting is not allowed
		
		//
		//Following method cannot be overridden but can be inherited
		b.increaseSpeed();
		
		//Car class static method cannot be overridden by BMW or Audi
		//BMW or Audi can hide the static method of Car class by
		// Creating their own static method with 
		//same name (which is in Car class)
		//but, static method of parent can be inherited by child
		//b.billing();//better use class name
		
		BMW_S17.billing();//Here Car class billing method will be called
		//but BMW is having its own billing method then
		//BMW billing method will be called not Car class billing method
		//we can call it using its own class
		CarS17.billing();
		
		
		//
		//b.getCarInfo()//invalid --> because its a private method of BMW class
		//to access private method, we need to create a public method,
		//and we need to call the private method into that public method
		//and later we can call the public method to access both the methods at a time
		b.getBMWInfo();
		b.getInfo();
		
		
	}

}
