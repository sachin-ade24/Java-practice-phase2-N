package practice2026;

public class Feb19_BreakContinue {

	public static void main(String[] args) {
		
		/*
		1. Break:
	
			The break statement can be used to jump out of a loop.
	
			This example stops the loop when i is equal to 4:
			
			for (int i = 0; i < 10; i++) {
				  if (i == 4) {
				    break;
				  }
				  System.out.println(i);
			}
			
	    */
		
	    for (int i = 0; i < 10; i++) {
	        if (i == 4) {
	          break;
	        }
	        System.out.println(i);
	    }
	    
	    /*
	     Output:
	     	0
			1
			2
			3
	     * */
		
		/*
		
		2. Continue:
			The continue statement breaks one iteration (in the loop), 
			if a specified condition occurs, and continues with the next 
			iteration in the loop.
			
			This example skips the value of 4:
			
			for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    continue;
			  }
			  System.out.println(i);
			}			
		
		*/
	    
	    for (int i = 0; i < 10; i++) {
	        if (i == 4) {
	          continue;
	        }
	        System.out.println(i);
	    }
	    
	    /*
	     Output:
			0
			1
			2
			3
			5
			6
			7
			8
			9
	     * */
		
	    /*
	     * 
			Good to Remember:
				break = stop the loop completely.
				continue = skip this round, but keep looping.    
	     * 
	     * */

	}

}
