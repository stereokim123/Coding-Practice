import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int b = Integer.parseInt(input[0]);
        int c = Integer.parseInt(input[1]);
        int d = Integer.parseInt(input[2]);
        int e = Integer.parseInt(input[3]);

        int[] result = {
                a > b ? 1:0,
                a > c ? 1:0,
                a > d ? 1:0,
                a > e ? 1:0
        };

        Arrays.stream(result).forEach(System.out::println);

    }
}