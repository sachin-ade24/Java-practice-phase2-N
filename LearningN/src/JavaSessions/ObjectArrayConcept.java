package JavaSessions;

import java.util.Arrays;

public class ObjectArrayConcept {

	public static void main(String[] args) {
		
		// Employee data:
		// name(String), age(int), salary(double), gender(char), isPermanent(boolean)
		// Different types of data in one array
		
		// Object:
		// Class Object is the root of the class hierarchy. Every class has Object 
		// as a superclass. 
		// All objects,including arrays, implement the methods of this class.
		
		// emp
		Object emp[] = new Object[5];// 0-4
		// Range; 0-4, size: 5
		System.out.println(emp.length);
		System.out.println(Arrays.toString(emp));// [null, null, null, null, null]
		// Object is a Class and it is non-premitive ==> its (non-premitive) default value 
		// is always 'null'.
		emp[0] = "Naman";// name
		emp[1] = 30;// Age
		emp[2] = 45.55;// Salary
		emp[3] = 'm';// Gender
		emp[4] = true;// isPermanent
		// emp[5] = "Pune";// City // will get AIOB here because index crossed its upper limit
		System.out.println(Arrays.toString(emp));
		
		System.out.println("=======================================");
		
		// emp1
		Object emp1[] = new Object[5];
		emp1[0] = "Ravi";// name
		emp1[1] = 31;// Age
		emp1[2] = 34.55;// Salary
		emp1[3] = 'm';// Gender
		emp1[4] = false;// isPermanent
		System.out.println(Arrays.toString(emp1));
		
		

	}

}
