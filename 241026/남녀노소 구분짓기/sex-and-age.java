import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());

    String answer = "";

    if (a == 0) {
        if (b >= 19) {
            answer = "MAN";
        } else if (b < 19) {
            answer = "BOY";
        }

    } 
    else {
        if (a == 1) {
            if (b >= 19) {
                answer = "WOMAN";
            } else if (b < 19) {
                answer = "GIRL";
            }
        }
    }

      System.out.println(answer);

  }
}