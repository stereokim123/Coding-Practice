import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    double n = Double.parseDouble(br.readLine());
    String answer = "";
    if (n >= 1.0) {
        answer = "High";
    } else if (n >= 0.5) {
        answer = "Middle";
    } else{
        answer = "Low";
    }

    System.out.println(answer);


  }
}