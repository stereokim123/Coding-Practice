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
        String[] input2 = br.readLine().split(" ");
        int c = Integer.parseInt(input2[0]);
        int d = Integer.parseInt(input2[1]);

        int answer;
        if (a > c && b > d) {
            answer = 1;
        } else{
            answer = 0;
        }

        System.out.println(answer);
    }
}