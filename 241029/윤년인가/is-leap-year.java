import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int y = Integer.parseInt(br.readLine());
    String answer = "";

    if ((y % 4 != 0) || (y % 100 == 0 && y % 400 != 0)) {
        answer = "false";
    } else {
        answer = "true";
    }

      System.out.println(answer);

  }
}