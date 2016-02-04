package teaching.list;

import teaching.list.utils.ArrayUtils;


public class List12_0 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        int k = 29;
        ArrayUtils.printArray(rotate(a, k));
    }

    private static int[] rotate(int[] a, int k) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++)
            result[i] = a[(i + k) % a.length];
        return result;
    }
}

