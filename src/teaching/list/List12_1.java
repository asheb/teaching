package teaching.list;

import teaching.list.utils.ArrayUtils;

public class List12_1 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        int k = 5;
        ArrayUtils.printArray(rotate(a, k));
    }

    private static int[] rotate(int[] a, int k) {
        int temp = 0;
        for (int j = 0; j < k; j++) {
            temp = a[0];
            for (int i = 0; i < a.length; i++) {

                if (i < a.length - 1) a[i] = a[i + 1];
            }
            a[a.length - 1] = temp;

        }
        return a;
    }
}
