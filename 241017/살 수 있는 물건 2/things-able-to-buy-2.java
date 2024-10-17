import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String answer = "";

    if (n >= 3000) {
        answer = "book";
    } else if (n >= 1000) {
        answer = "mask";
    } else if (n >= 500){
        answer = "pen";
    } else {
        answer = "no";
    }

    System.out.println(answer);

  }
}