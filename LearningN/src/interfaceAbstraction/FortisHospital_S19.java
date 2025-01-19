package interfaceAbstraction;

public class FortisHospital_S19 extends MedicalS19
             implements USMedical_S19, UKMedical_S19, IndiaMedical_S19{
	
	//variable
	int min_fee = 200;
	
	static final int new_min_fee = 225;
	
	//The current class is extending a class and implementing multiple 
	//interfaces
	
	//The above sequence should be maintained
	//i.e. the 'extends' should come first and then 'implements'
	
	//As soon as you write implements, it shows an error
	//Error: The type FortisHospital_S19 must 
	//implement the inherited abstract method 
	//USMedical_S19.oncologyServices()
	//It is asking you to implement the methods from USMedical_S19

	//US:
	@Override
	public void physioServices() {
		System.out.println("FH -US- physioServices");
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH -US- oncologyServices");
	}

	@Override
	public void dentalServices() {
		System.out.println("FH -US- dentalServices");
	}
	
	@Override
	public int payment(int amount) {
		System.out.println(amount);
		return amount;
	}
	
    //UK:
	@Override
	public void orthoServices() {
		System.out.println("FH -UK- orthoServices");
	}

	@Override
	public void neuroServices() {
		System.out.println("FH -UK- neuroServices");
	}

	//India:
	@Override
	public void cardioServices() {
		System.out.println("FH -IN- cardioServices");
	}

	@Override
	public void gynacServices() {
		System.out.println("FH -IN- gynacServices");
	}

	//The common method:
	//common method is implemented only one time, though it is present in 
	//all interfaces
	@Override
	public void emergencyServices() {
		System.out.println("FH -All- emergencyServices");
	}

	//Fortis individual methods
	public void medicalTraining() {
		System.out.println("FH -- medicalTraining");
	}
	
	public void OPTServices() {
		System.out.println("FH -- medicalTraining");
	}
	
	public static void medicalBilling() {
		System.out.println("FH -- medicalBilling");
	}
	
	@Override
	public void medicalNews() {
		System.out.println("FH -- medicalNews");
	}

	//WHO
	@Override
	public void covidVaccination() {
		System.out.println("FH -- covidVaccination");
	}
	
}
