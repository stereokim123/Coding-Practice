import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String answer = "";

        if (n % 2 != 0 && n % 3 == 0 || n % 5 == 0 && n % 2 == 0) {
            answer = "true";

        } else {
            answer = "false";
        }

            System.out.println(answer);

    }
}