import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    String answer = "";
    if (n >= 90) {
      answer = "A";
    } else if (n >= 80){
      answer = "B";
    } else if (n >= 70) {
      answer = "C";
    } else if (n >= 60){
        answer = "D";
    } else {
        answer = "F";
    }

    System.out.println(answer);

  }
}