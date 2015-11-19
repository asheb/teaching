import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(oddElements(new int[]{5, 7, 8})));
        System.out.println(Arrays.toString(oddElements(new int[]{-5, -7, -8})));
        System.out.println(Arrays.toString(oddElements(new int[]{-5, -7, -8, 2})));
        System.out.println(Arrays.toString(oddElements(new int[]{-5, -7})));
        System.out.println(Arrays.toString(oddElements(new int[]{})));
        System.out.println(Arrays.toString(oddElements(new int[]{1, 2, 3, 4, 5, 6, 7})));
    }

    public static int[] oddElements(int[] arr) {
        int[] odd = new int[(arr.length + 1) / 2];
        for (int i = 0; i < odd.length; i++) {
            odd[i] = arr[i * 2];
        }
        return odd;
    }

}
