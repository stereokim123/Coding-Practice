import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        if (a == 5) {
            System.out.println("A");
        }
        if (a % 2 == 0) {
            System.out.println("B");
        } else{
            System.out.println("");
        }
    }
}