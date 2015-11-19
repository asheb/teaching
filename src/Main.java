import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println(contains(new int[]{5, 7, 8}, 3));
        System.out.println(contains(new int[]{-5, -7, -8}, -5));
        System.out.println(contains(new int[]{}, 0));
        System.out.println(contains(new int[]{1, 2, 3, 4, 5, 6, 7}, 3));
    }

    public static boolean contains(int[] arr, int s) {
        for (int a : arr)
            if (a == s)
                return true;
        return false;
    }

}
