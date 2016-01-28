package teaching.list;

public class List9 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[]{6, 7, 8, 9};
//        System.out.println(concat(a, b));
        printArray(concat(a, b));

    }

    private static void printArray(int[] z) {
        for (int a : z)
            System.out.print(a + " ");
    }

    private static int[] concat(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = (a.length > i) ? a[i] : b[i - a.length];
        }
        return result;
    }
}

