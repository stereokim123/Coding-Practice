import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int b = Integer.parseInt((input[0]));

        int a = Integer.parseInt((input[1]));

        for (int i = b; i >= a; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

    }
}
