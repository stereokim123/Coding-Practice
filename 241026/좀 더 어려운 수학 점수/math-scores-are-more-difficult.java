import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int a = Integer.parseInt(input[0]);
    int b = Integer.parseInt(input[1]);
    String[] input1 = br.readLine().split(" ");
    int c = Integer.parseInt(input1[0]);
    int d = Integer.parseInt(input1[1]);

    String answer = "";

    if (a > c) {
      answer = "A";
    } else if (c > a) {
      answer = "B";
    } else if (a == c && b > d) {
      answer = "A";
    } else if (a == c && d > b) {
      answer = "B";
    }
    System.out.println(answer);

  }
}