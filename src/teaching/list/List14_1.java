package teaching.list;

import teaching.list.utils.ArrayUtils;

public class List14_1 {
    public static void main(String[] args) {
        int number = 123456789;
        ArrayUtils.printArray(listOfDigits(number));
    }

    private static int[] listOfDigits(int number) {
        String sNumber = Integer.toString(number);
        int numberOfDigits = sNumber.length();
        int[] intDigits = new int[numberOfDigits];
        int i = 0;
        for (i = numberOfDigits - 1; 0 <= i; i--) {
            intDigits[i] = number % 10;
            number = number / 10;
        }
        return intDigits;
    }
}
