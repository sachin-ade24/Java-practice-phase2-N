package JavaLearning;

public class Patterns {

	public static void main(String[] args) {
		
		int i, j;
		for(i=1; i<=5; i++) {
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("============================");
		for(i=1; i<=5; i++) {
			for(j=5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("============================");
		for(i=1; i<=5; i++) {
			for(j=2; j<=i; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		System.out.println("============================");
		for(i=1; i<=5; i++) {
			for(j=4; j>=i; j--) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		System.out.println("============================");
		for(i=1; i<=5; i++) {
			for(j=4; j>=i; j--) {
				System.out.print(" ");
			}
			for(j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
//		System.out.println("============================");
//		int k=1;
//		for(i=1; i<=4; i++) {
//			for(j=1; j<=i; j++) {
//				System.out.print(k + " ");
//				k++;
//			};
//			System.out.println();
//		};
//		System.out.println("============================");
//		k=1;
//		for(i=1; i<=4; i++) {
//			for(j=i; j<=4; j++) {
//				System.out.print(k + " ");
//				k++;
//			};
//			System.out.println();
//		};
//		System.out.println("============================");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
