import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String answer = "";
        if (a < 10 || a > 20){
            answer = "yes";
        } else {
            answer = "no";
        }
        System.out.println(answer);

    }
}