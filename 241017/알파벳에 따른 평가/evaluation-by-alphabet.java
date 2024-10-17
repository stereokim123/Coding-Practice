import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = (br.readLine());
    String answer = "";
    if (str.equals("S")) {
      answer = "Superior";
    } else if (str.equals("A")){
      answer = "Excellent";
    } else if (str.equals("B")){
      answer = "Good";
    } else if (str.equals("C")) {
      answer = "Usually";
    } else if (str.equals("D")) {
        answer = "Effort";
    } else{
        answer = "Failure";
    }

    System.out.println(answer);

  }
}