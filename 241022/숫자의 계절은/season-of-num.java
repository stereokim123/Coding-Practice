import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        String answer = "";

        if (a >= 3 && a < 6) {
            answer = "Spring";
        } else if (a >= 6 && a < 9) {
            answer = "Summer";
        } else if (a >= 9 && a < 12) {
            answer = "Fall";
        } else {
            answer = "Winter";
        }
            System.out.println(answer);

    }
}