import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split();

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        String answer1 = "";
        String answer2 = "";
        if (a % 2 == 0) {
            answer1 = "even";
        } else {
            answer1 = "odd";
        }

        if (b % 2 == 0) {
            answer2 = "even";
        } else {
            answer2 = "odd";
        }
        System.out.println(answer1);
        
        System.out.println(answer2);

    }
}