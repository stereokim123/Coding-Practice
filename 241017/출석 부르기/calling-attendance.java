import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    String answer = "";
    if (n == 1) {
      answer = "John";
    } else if (n == 2){
      answer = "Tom";
    } else if (n == 3) {
      answer = "Paul";
    } else {
        answer = "Vacancy";
    }

    System.out.println(answer);

  }
}