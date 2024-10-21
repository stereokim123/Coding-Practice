import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        String answer = "";

        if (a % 13 == 0 || a % 19 == 0) {
            answer = "True";

        } else {
            answer = "False";
        }

            System.out.println(answer);

    }
}