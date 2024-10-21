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
        int c = Integer.parseInt(input[2]);
        int answer1;
        int answer2;

        if (a <= b && a <= c) {
            answer1 = 1;
        } else {
            answer1 = 0;
        }

        if (a == b && a == c) {
            answer2 = 1;
        } else {
            answer2 = 0;
        }

        System.out.println(answer1 + " " + answer2);

    }
}