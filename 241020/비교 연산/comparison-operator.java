import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        int[] result = {
                a >= b ? 1:0,
                a > b ? 1:0,
                b >= a ? 1:0,
                b > a ? 1:0,
                a == b ? 1:0,
                a != b ? 1:0,
        };

        Arrays.stream(result).forEach(System.out::println);

    }
}