
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class List6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String x = reader.readLine();
        System.out.println(isAPalindrome(x));
    }

    public static boolean isAPalindrome(String x) {
        for (int i = 0; i < x.length() / 2; i++)
            if (x.charAt(i) != x.charAt(x.length() - 1 - i)) return false;
        return true;
    }
}