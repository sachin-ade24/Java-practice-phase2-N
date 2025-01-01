package JavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {
		
		int in = 10;
		in = 20; 
		in =30;
		System.out.println(in);
		
		// I want to keep all values of 'i'. So, how can I do that?
		// the answer is: by using Array
		
		// Limitations of array:
		// 1. Size is fixed in the static array: To overcome this issue we have to use dynamic arrays: i.e.
		// ArrayList(collections)
		// 2. stores similar types of data: We can use Object(Class) array, but this is still a static array
		
		// Array is a non-primitive ==> data type
		// It will hold only the similar type of data
		
		// Declaration:
		// 1. new keyword
		// 2. array literals
		
		// int array: new keyword
		// int i[] = new int[];// not allowed
		int i[] = new int[4];
		// int [] i1 = new int[4];// allowed
		// total no. of elements is 4 here
		// length of array is 4
		// lowest index is 0 (always)
		int LI = 0;
		// highest index is 3 (highest index = length of Array -1) i.e 4-1 = 3
		// length = highest index + 1
		// data tpye here is 'int'
		// here the array is holding 4 integers and one integer require 4 bytes
		// so, total memory allocated for the above array is 4*(4bytes)=16bytes
		
		// add int data in the above array
		//i[0] = 1.4;// Type mismatch: cannot convert from double to int
		i[0]=10;
		i[1]=20;
		i[3]=40;
		i[2]=30;
		//i[4]=50;//not allowed at run time 
		// You can write but at the run time you will get ArrayIndexOutOfBoundException
		// at line no. 40 and you will get no compiler time error but run time exception
		//i[-1]=70;//not allowed at run time ==> ArrayIndexOutOfBoundsException
		
		//length of an array
		int lenght = i.length;
		System.out.println("Length of an array is: " + lenght);
		System.out.println("Highest index of array is: " + (lenght-1));
		System.out.println("Number of elements in the array is: " + lenght);// (highest index + 1)
		System.out.println("Lowest index is always: " + LI);//0
		
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
		
		int j[] = new int[5];
		// LI = 0, HI=4-1, L=5
		j[1] = 100;
		System.out.println(j[1]);// 100
		System.out.println(j[0]);// 'null' is wrong answer. The right answer is 0 (zero).
		// And its a default value of the 'int' i.e. 0
		// it is not mandatory to define all the values of array.
		
		System.out.println(j[2]);
		System.out.println(j[3]);
		System.out.println(j[4]);
		// System.out.println(j[5]);// ArrayIndexOutOfBoundsException
		
		int len = j.length;
		System.out.println("Length of an array is: " + len);// 5 => 
		System.out.println("Lowest index is always: " + LI);// 0
		System.out.println("Highest index is: " + (len-1));// 5-1 =4
		
		System.out.println("---------------------------------------");
		
		// *****important*****
		int k[] = new int[0];
		int lenghtK = k.length;
		System.out.println("LI is: " + LI);// 0
		System.out.println("Length of array is: " + lenghtK);// 0
		System.out.println("HI is: " + (lenghtK - 1));// -1
		
		// int p[] = new int[-1];// no compile time exception
		// negative array index does not exist
		// but rub time exception => NegativeArraySizeException: -1
		
		System.out.println("---------------------------------------");
		
		byte b[] = new byte[3];
		b[0] = 10;
		b[1] = 30;
		b[2] = 40;
		
		System.out.println("---------------------------------------");
		
		float f[] = new float[2];
		f[0] = 12.33f;
		System.out.println(f[0]);// 12.33
		System.out.println(f[1]);// 0.0 ==> default value of float
		
		System.out.println("---------------------------------------");
		
		char ch[] = new char[3]; 
		ch[0] = 'a';
		ch[1] = 'A';
		ch[2] = '1';		
		System.out.println(ch[0]);// a
		System.out.println(ch[1]);// A
		System.out.println(ch[2]);// 1
		
		System.out.println("---------------------------------------");
		
		char ch1[] = new char[4];
		ch1[0] = 'a';
		ch1[1] = 'A';
		ch1[2] = '1';		
		System.out.println(ch1[0]);// a
		System.out.println(ch1[1]);// A
		System.out.println(ch1[2]);// 1
		System.out.println(ch1[3]);// space ==> default value of 'char' is a 'space'
		System.out.println((int)ch[0]);
		System.out.println("-----------");
		
		// add one more
		ch = new char[4];// it will create a new array
		System.out.println(ch[3]);// space
		System.out.println(ch[2]);// space
		
		System.out.println("---------------------------------------");
		
		boolean flag[] = new boolean[2];
		flag[0] = true;
		System.out.println(flag[0]);// true
		System.out.println(flag[1]);// false ==> default value of a 'boolean'


		//Default values
		// integer/byte/short: 0
		// float/double: 0.0
		// char: space
		// boolean: false
		

		
	}

}
