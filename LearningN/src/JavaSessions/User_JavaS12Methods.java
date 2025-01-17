package JavaSessions;

public class User_JavaS12Methods {
	
	public void printInfo1() {
		System.out.println("User info1:");
		return;//valid
	}
	
	public void printInfo2() {
		System.out.println("User info2:");
		//no return - valid
	}
	
	public int getUserMarks(String userName) {
		System.out.println("Calculating user marks: " + userName);
		int marks = -1;
		
		switch (userName) {
		case "Nitin":
			marks=90;
			break;
		case "Anu":
			marks=95;
			break;
		case "Rajat":
			marks=100;
			break;
		default:
			System.out.println("Please supply the right username.." + userName);
			break;
			//throw new IllegalArgumentException("Unexpected value: " + userName);
		}
		
		return marks;
	}
	
	// improved method (better than above one)
	public int getStudentMarks(String studentName) {
		
		switch(studentName) {
		case "Sachin":
			return 89;
		case "Supriya":
			return 91;
		case "Sarika":
			return 93;
		case "Suraj":
			return 97;
		default:
			System.out.println("Please pass the right user name.");
		    return -1;
		}
		
	}
	
	public int printMarksheet(String studentName) {
		return getStudentMarks(studentName);
	}

	public static void main(String[] args) {
		
		User_JavaS12Methods u1 = new User_JavaS12Methods();
		u1.printInfo1();
		u1.printInfo2();
		
		//u1.getStudentMarks("Kalpana");
		//o/p: Please pass the right user name.
		System.out.println(u1.getStudentMarks("Kalpana"));
		//o/p: Please pass the right user name.
		//-1
		System.out.println(u1.getStudentMarks("Sarika"));
		
		if(u1.printMarksheet("Naveen")>-1) {
			System.out.println("Print the marksheet.");
		} else {
			System.err.println("Invalid student name.");
		}
	}

}
