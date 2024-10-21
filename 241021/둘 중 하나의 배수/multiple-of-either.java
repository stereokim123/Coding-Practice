import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int answer = 0;
        if (a % 3 == 0 || a % 5 == 0) {
            answer = 1;

        } else {
            answer = 0;
        }

            System.out.println(answer);

    }
}