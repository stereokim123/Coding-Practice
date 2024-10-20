import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());
        String answer = "";
        if (a >= 1.0 && b >= 1.0){
            answer = "High";
        } else if (a >= 0.5 && b >= 0.5){
            answer = "Middle";
        } else {
            answer = "Low";
        }

        System.out.println(answer);
    }
}