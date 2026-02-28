package practice2026;

public class Feb22_SuperKeywordTest {

	public static void main(String[] args) {
		
		Feb22_SuperKeywordParent o1 = new Feb22_SuperKeywordParent();
		
		Feb22_SuperKeywordChild o2 = new Feb22_SuperKeywordChild();
		
		Feb22_SuperKeywordParent o3 = new Feb22_SuperKeywordChild();
		
		o3.mtd1();
		
		o2.mtd1();
		
		o1.mtd1();
		
		o2.printCity();
	}

}
