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
        int answer = 0;

        while(a >= 90) {
            if (b >= 95) {
                answer = 100000;
            } else if (b >= 90) {
                answer = 50000;
            }

        }

        System.out.println(answer);

    }
}