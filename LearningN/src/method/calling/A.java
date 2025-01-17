package method.calling;

//  Java session 14
public class A {

	public static void main(String[] args) {
		
		System.out.println("A--main..");
		//main method is static ==> goes to meta space 
		
		//Call 'B' class main method
		B.main(args);
		
		//now, while execution happens:
		//two stacks will be created into the stack
		//one for class 'A' main method
		//Another one for class 'B' main method
	}

}
