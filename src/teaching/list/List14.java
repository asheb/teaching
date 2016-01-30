package teaching.list;

import teaching.list.utils.ArrayUtils;

/**
 * Created by Женя on 30.01.2016.
 */
public class List14 {
    public static void main(String[] args){
        int number = 123456789;
        ArrayUtils.printArray(listOfDigits(number));
    }

    private static char[] listOfDigits(int number) {
        String sNumber = Integer.toString(number);
        char[] charDigits = sNumber.toCharArray();
        return charDigits;
    }
}
