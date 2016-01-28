package teaching.list;

import java.util.function.Function;
import java.util.stream.IntStream;

public class List8 {

    public static void main(String[] args) {
        int[] twenty = IntStream.range(1, 20 + 1).toArray();
        //onAll(twenty, x -> { System.out.println(x * x); return null; }) ;
        onAll(twenty, new PrintSquareFunc()) ;
    }

    private static void onAll(int[] list, Function<Integer, Void> fn) {
        for (int a : list)
            fn.apply(a);
    }


    //


}

class PrintSquareFunc implements Function<Integer, Void> {

    @Override
    public Void apply(Integer x) {
        System.out.println(x * x);
        return null;
    }
}



