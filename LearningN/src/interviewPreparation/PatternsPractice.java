package interviewPreparation;

public class PatternsPractice {

	public static void main(String[] args) {
		
		/*
*
**
***
****
*****		 
		*/
		
		for(int i=1; i<6; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("==================================");
		
		/*
		 
*****
****
***
**
*		  		 
		*/
		
		for(int i=1; i<6; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("==================================");
		
		/*

    *
   **
  ***
 ****
*****
		*/
		
		for(int i=1; i<6; i++) {
			for(int j=4; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("==================================");
		
		/*
*****
 ****
  ***
   **
    *
		*/		
		
		for(int i=1; i<6; i++) {
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=5; j>=i; j--) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		System.out.println("==================================");
		
		/*
*
 *
  *
   *
    *
		 */
		
		
		for(int i=1; i<6; i++) {
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=1; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		
		System.out.println("==================================");
		
		/*
    *
   *
  *
 *
*
		 */
		
		for(int i=1; i<6; i++) {
			for(int j=4; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=1; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		
		System.out.println("==================================");
		
		/*
   *
  ***
 *****
*******
		*/
		
	   for(int i=1; i<=4; i++){
	       for(int j=3; j>=i; j--){
	           System.out.print(" ");
	       }
	       for(int j=1; j<=(2 * i - 1); j++){
	           System.out.print("*");
	       }
	       System.out.println();   
	   }

		System.out.println("==================================");
   
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
