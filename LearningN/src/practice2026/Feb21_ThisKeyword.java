package practice2026;

public class Feb21_ThisKeyword {
	
	  int modelYear;
	  String modelName;
	  
	  public Feb21_ThisKeyword(String modelName) {
		  this(2025, modelName);
	  }
	  
	  public Feb21_ThisKeyword(int modelYear, String modelName) {
		  this.modelName = modelName;
		  this.modelYear = modelYear;
	  }
	  
	  public void carInfo() {
		  System.out.println(modelYear + " " + modelName);
	  }

	public static void main(String[] args) {
		
		Feb21_ThisKeyword o1 = new Feb21_ThisKeyword("Tata Safari");
		
		o1.carInfo();//2025 Tata Safari
		
		Feb21_ThisKeyword o2 = new Feb21_ThisKeyword(2021, "Tata Indica");
		
		o2.carInfo();//2021 Tata Indica
	}

}
