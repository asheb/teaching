import java.util.function.Function;
import java.util.stream.IntStream;

public class List8a {

    public static void main(String[] args) {
        int[] twenty = IntStream.range(1, 20 + 1).toArray();
        for (int a : map(twenty, x -> x * x))
            System.out.println(a);
    }

    private static int[] map(int[] list, Function<Integer, Integer> fn) {
        int[] result = new int[list.length];
        for (int i = 0; i < list.length; i++)
            result[i] = fn.apply(list[i]);
        return result;
    }

}


