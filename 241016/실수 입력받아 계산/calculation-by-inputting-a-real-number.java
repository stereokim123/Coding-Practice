import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());

        double result = a + b;

        System.out.printf("%.2f", result);
        }
}