package teaching.list;

import teaching.list.utils.ArrayUtils;

/**
 * Created by Женя on 30.01.2016.
 */
public class List13 {
    public static void main(String[] args) {
        int[] fibonachiList = new int[100];
        fibonachiList[0] = 0;
        fibonachiList[1] = 1;
        for (int i = 2; i < 100; i++) {
            fibonachiList[i] = fibonachiList[i - 1] + fibonachiList[i - 2];
        }
        ArrayUtils.printArray(fibonachiList);

    }
}
