package interfaceAbstraction;

public class testHospitalS19 {

	public static void main(String[] args) {
		
		FortisHospital_S19 fh = new FortisHospital_S19();
		fh.physioServices();
		fh.dentalServices();
		fh.cardioServices();
		fh.oncologyServices();
		fh.neuroServices();
		fh.gynacServices();
		fh.emergencyServices();
		
		//If a 'default' method is present in parent interface and that 
		//method is not overridden by child class then we need to use 
		//parent interface 'default' method only.
		//If same 'default' method is overridden by child class with
		//'public' access, then we need to use the child class method
		fh.medicalNews();
		
		//
		fh.medicalRND();//coming from Medical class
		//the above method can be overridden
		
		//WHO
		fh.covidVaccination();
		
		//variable
		System.out.println(fh.min_fee);
		//the above variable can be manipulated if it is not final
		//final and static variable
		System.out.println(FortisHospital_S19.new_min_fee);
		
		System.out.println("=================================");
		
		//static method
		FortisHospital_S19.medicalBilling();
		
		//static method
		USMedical_S19.medicalBilling();
		
		//static and final variable in an interface
		System.out.println(USMedical_S19.min_fee);
		
		System.out.println("=================================");
		
		//
		//We cannot create an Object of the interface
		//USMedical_S19 us = new USMedical_S19();//invalid
		//Error: Cannot instantiate the type USMedical_S19
		
		//
		//let's try top casting 
		//Top casting: child class Object can be referred by parent 
		//interface reference variable
		USMedical_S19 us = new FortisHospital_S19();//valid
		us.physioServices();
		us.dentalServices();
		us.oncologyServices();
		us.emergencyServices();
		
		//
		UKMedical_S19 uk = new FortisHospital_S19();//valid
		uk.neuroServices();
		uk.orthoServices();
		uk.emergencyServices();
		
		//
		IndiaMedical_S19 in = new FortisHospital_S19();//valid
		in.cardioServices();
		in.gynacServices();
		in.emergencyServices();
		
		//
		//down casting --> create the Object of the parent class referred 
		//by child class reference variable
		//down casting is not possible --> we cannot create the Object 
		//of the interface
		//FortisHospital_S19 fh1 =  new USMedical_S19();
		//Error: Cannot instantiate the type USMedical_S19
		//meaning that the Object cannot be created for the interface

		
	}

}
