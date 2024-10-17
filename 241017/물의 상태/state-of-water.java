import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    String answer = "";
    if (n < 0) {
      answer = "ice";
    } else if (n >= 100){
      answer = "vapor";
    } else {
      answer = "water";
    }

    System.out.println(answer);

  }
}