package encapsulation.oops;

public class UserTestS16 {

	public static void main(String[] args) {

		UserS16 u1 = new UserS16("Naman", 40, 34.55, true);//POST call
		
		System.out.println(u1.getName() + " " +
				           u1.getAge() + " " +
				           u1.getSalary() + " " +
				           u1.isActive()
				);
		
		//Now, if we are not going to use Setters, and we are using only
		//the constructor for initializing the values of the global 
		//variables, in this case, we need to create one more object or we
		//need to create one object by just updating its relevant 
		//parameter's value
		//e.g.
		u1 = new UserS16("Naman", 40, 35, true);//POST call
		//GET call --> read
		System.out.println(u1.getName() + " " +
		           u1.getAge() + " " +
		           u1.getSalary() + " " +
		           u1.isActive()
		);
		
		//if we are following above approach, it will absolutely wrong
		//approach, though the value gets updated, we are creating one 
		//more object and it is pointed by already existing reference variable
		//'u1'. This way we are again unnecessarily keeping other values
		//like: "Naman", 34.55, true along with 35.
		
		//we can avoid this by using setters
		//this way we need to just update only one variable's value
		
		u1.setSalary(45.55);//Update --> PUT/PATCH call
		//Read --> GET call
		System.out.println(u1.getName() + " " +
		           u1.getAge() + " " +
		           u1.getSalary() + " " +
		           u1.isActive()
		);
		
		u1.setAge(41);//Update --> PUT/PATCH call
		//Read --> GET call
		System.out.println(u1.getName() + " " +
		           u1.getAge() + " " +
		           u1.getSalary() + " " +
		           u1.isActive()
		);
		
		
		

	}

}
