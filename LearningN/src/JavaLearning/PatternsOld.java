package JavaLearning;

public class PatternsOld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k=1;
//		for(i=1; i<=10; i++) {
//			for(j=2; j<=2; j++) {
//				System.out.println(i*j + "\n");
//			};
//		};
		
//		for(i=1; i<=4; i++) {
//			for(j=1; j<=i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		};
		
//		for(i=1; i<=4; i++) {
//			for(j=i; j<=4; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		};
		
//		for(i=1; i<=10; i=i+4) {
//			for(j=i; j<=10; j++) {
//				System.out.print(j);
//				if(j==4 || j==7) {
//					break;
//				}
//			}
//			System.out.println();
//		};
		
//(1)//=================================================================================		
/*
1 2 3 4 
5 6 7 
8 9 
10 
*/	
		for(i=1; i<=4; i++) {
			for(j=i; j<=4; j++) {
				System.out.print(k);
				k++;
			};
			System.out.println();
		}
      //=================================================================================	
		System.out.println();
		k=1;
		for(i=1; i<=4; i++) {
			for(j=1; j<=5-i; j++) {
				// System.out.print(k + " ");
				System.out.print(k + "\t");
				k++;
			};
			System.out.println();
		};
      //=================================================================================			
		System.out.println();
		k=1;
		for(i=0; i<=3; i++) {
			for(j=4-i; j>=1; j--) {
				// System.out.print(k + " ");
				System.out.print(k + " ");
				k++;
			};
			System.out.println();
		};
     //=================================================================================
		System.out.println();
		k=1;
		for(i=4; i>=1; i--) {
			for(j=i; j>=1; j--) {
				System.out.print(k + " ");
				k++;
			};
			System.out.println();
		};
     //=================================================================================
		System.out.println();
		k=1;
		for(i=4; i>=1; i--) {
			for(j=1; j<=i; j++) {
				System.out.print(k);
				k++;
			};
			System.out.println();
		};		
//(2)//=================================================================================
/*
1  
2  3  
4  5  6  
7  8  9  10 
*/	
		System.out.println();
		k=1;
		for(i=4; i>=1; i--) {
			for(j=5-i; j>=1; j--) {
				System.out.print(k + " ");
				k++;
			};
			System.out.println();
		};
	 //=================================================================================	
		System.out.println();
		k=1;
		for(i=1; i<=4; i++) {
			for(j=1; j<=i; j++) {
				System.out.print(k + "\t");
				k++;
			};
			System.out.println();
		};
     //=================================================================================
		System.out.println();
		k=1;
		for(i=1; i<=4; i++) {
			for(j=4; j>=5-i; j--) {
				System.out.print(k);
				k++;
			};
			System.out.println();
		};
     //=================================================================================	
		System.out.println();
		k=1;
		for(i=4; i>=1; i--) {
			for(j=1; j<=5-i; j++) {
				System.out.print(k + "  ");
				k++;
			};
			System.out.println();
		};		
	 //=================================================================================			
		System.out.println();
		k=1;
		for(i=1; i<=4; i++) {
			for(j=1; j<=i; j++) {
				System.out.print(k);
				k++;
			};
			System.out.println();
		};	
		
//(3)//=================================================================================
		/*
		1  
		1  2  
		1  2  3  
		1  2  3  4 
		*/
		System.out.println();
		for(i=1; i<=4; i++) {
			for(j=1; j<=i; j++) {
				System.out.print(j + "\t");
			};
			System.out.println();
		};
	 //=================================================================================					
		/* 
		1  2  3  4 
		1  2  3
		1  2
		1
		*/
		System.out.println();
		for(i=1; i<=4; i++) {
			for(j=1; j<=5-i; j++) {
				System.out.print(j + "\t");
			};
			System.out.println();
		};
	 //=================================================================================							
		/* 
		1  2  3  4 
		2  3  4
		3  4
		4
		*/
		System.out.println();
		for(i=1; i<=4; i++) {
			for(j=i; j<=4; j++) {
				System.out.print(j + " ");
			};
			System.out.println();
		};
	 //=================================================================================											
		/* 
		4
		3  4
		2  3  4
		1  2  3  4 
		*/
		System.out.println();
		for(i=4; i>=1; i--) {
			for(j=i; j<=4; j++) {
				System.out.print(j + "  ");
			};
			System.out.println();
		};
	 //=================================================================================									
		/* 
		4  3  2  1 
		4  3  2
		4  3
		4
		*/
		System.out.println();
		for(i=1; i<=4; i++) {
			for(j=4; j>=i; j--) {
				System.out.print(j + "  ");
			};
			System.out.println();
		};
	 //=================================================================================											
		/* 
		4
		4  3
		4  3  2
		4  3  2  1 
		*/
		System.out.println();
		for(i=1; i<=4; i++) {
			for(j=4; j>=5-i; j--) {
				System.out.print(j + "  ");
			};
			System.out.println();
		};
	 //=================================================================================													
		/* 
		3
		6 9
		12 15 18
		*/
		System.out.println();
		k=3;
		for(i=1; i<=3; i++) {
			for(j=1; j<=i; j++) {
				System.out.print(k + "  ");
				k = k+3;
			};
			System.out.println();
		};		
	}
}
