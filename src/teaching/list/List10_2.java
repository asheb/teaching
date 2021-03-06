package teaching.list;

import static teaching.list.utils.ArrayUtils.printArray;


class List10_2 {

    public static void main(String[] args) {
        String[] a = new String[] {"1", "1", "1", "3"};
        String[] b = new String[] {"8", "8"};
        printArray(combines(a, b));
    }

    private static String[] combines(String[] a, String[] b) {
        String[] result = new String[a.length + b.length];
        int a1 = 0, b1 = 0;
        for (int i = 0; i < result.length; i++) {
            if      (i % 2 == 0 && a1 < a.length) { result[i] = a[a1]; a1++; }
            else if (i % 2 == 0 && b1 < b.length) { result[i] = b[b1]; b1++; }
            else if (i % 2 != 0 && b1 < b.length) { result[i] = b[b1]; b1++; }
            else if (i % 2 != 0 && a1 < a.length) { result[i] = a[a1]; a1++; }
        }
        return result;
    }
}

