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
        int answer = 0;

        if (a < b && a < c){
            answer = a;
        } else if (b < c && b < a) {
            answer = b;
        } else if (c < b && c < a) {
            answer = c;
        }

        System.out.println(answer);

    }
}