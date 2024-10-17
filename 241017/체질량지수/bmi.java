import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] input = br.readLine().split(" ");

    int h = Integer.parseInt(input[0]);
    int w = Integer.parseInt(input[1]);

    int bmi = (10000*w)/(h*h);

    if(bmi < 25) {
      System.out.println(bmi);
    } else {
      System.out.println(bmi + "\nObesity");
    }
  }
}