import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    if (n < 80) {
        System.out.println((80-n) + " more score");
    } else{
        System.out.println("pass");
    }
  }
}