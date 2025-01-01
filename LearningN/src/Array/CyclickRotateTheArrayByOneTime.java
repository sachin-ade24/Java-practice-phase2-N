package Array;

import java.util.Arrays;

public class CyclickRotateTheArrayByOneTime {
	
	public static String rotateTheArrayClockwiseOnce(int[] z) {
		int t=z[z.length-1];
		for(int i=z.length-1; i>0; i--) {
			z[i]=z[i-1];
		}
		z[0]=t;
		return Arrays.toString(z);
	}

	public static void main(String[] args) {
		
		//Given an array, the task is to cyclically rotate the array clockwise by one time.
		int z[] = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(z));
		//CyclickRotateTheArrayByOneTime r = new CyclickRotateTheArrayByOneTime();
		//System.out.println(r.rotateTheArrayClockwiseOnce(z));
		rotateTheArrayClockwiseOnce(z);
	}

}
