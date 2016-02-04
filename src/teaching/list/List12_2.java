package teaching.list;

import teaching.list.utils.ArrayUtils;

public class List12_2 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        int k = 100;
        ArrayUtils.printArray(rotate(a, k));
    }

    private static int[] rotate(int[] a, int k) {
        int numberOfRotates = (k < a.length) ? k:(k % a.length);
        int[] temp = new int[numberOfRotates];
        for (int i = 0; i < numberOfRotates; i++) {
            temp[i] = a[i];
        }
        for (int j = 0; j < a.length; j++) {
            if (j < a.length - numberOfRotates) a[j] = a[j + numberOfRotates];
                else a[j] = temp[j - a.length + numberOfRotates];
        }
        return a;
    }
}
