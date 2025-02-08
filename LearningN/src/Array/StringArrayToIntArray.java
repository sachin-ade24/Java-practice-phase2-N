package Array;

public class StringArrayToIntArray {
    public static void main(String[] args) {
        String[] strArray = {"1", "2", "3", "4", "5"};
        int[] intArray = new int[strArray.length];

        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }

        // Printing the converted integer array
        for (int num : intArray) {
            System.out.print(num + " ");
        }
    }
}
