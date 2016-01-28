package teaching.list;

import teaching.list.utils.ArrayUtils;


class List11 {

    public static void main(String[] args) {
        int[] b = new int[] {1, 1, 5, 7};
        int[] a = new int[] {1, 4};
        ArrayUtils.printArray(merge(a, b));
    }

    private static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];

        int a1 = 0, b1 = 0;
        for (int i = 0; i < result.length; i++) {
            if (a1 < a.length && a [a1] < b [b1]) {result [i] = a [a1]; a1++;}
            else {result [i] = b [b1]; b1++;}
        }
        return result;
    }


}
