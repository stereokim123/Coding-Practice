import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String answer1;
        String answer2;
        if (a % 3 == 0) {
            answer1 = "YES";
        } else {
            answer1 = "NO";
        }

        if (a % 5 == 0) {
            answer2 = "YES";
        } else {
            answer2 = "NO";
        }

        System.out.println(answer1 + "\n" + answer2);

    }
}