package Array;

import java.util.Arrays;

public class CyclickRotateTheArrayByNTimes extends CyclickRotateTheArrayByOneTime{

	int n=1;
	public void rotateTheArrayByNTimes(int[] f) {
		for(int i=0; i<=n; i++) {
			rotateTheArrayClockwiseOnce(f);
		}
		System.out.println(Arrays.toString(f));
	}
	
	public static void main(String[] args) {
		
		int d [] = {11, 12, 13, 14, 15}; 
		int p [] = {6, 7, 8, 9, 10};
		System.out.println(rotateTheArrayClockwiseOnce(d));
		CyclickRotateTheArrayByNTimes ra = new CyclickRotateTheArrayByNTimes();
		ra.rotateTheArrayByNTimes(p);
	}

}
