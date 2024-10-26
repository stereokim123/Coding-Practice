import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int a = Integer.parseInt(input[0]);
    String b = input[1];
    String[] input1 = br.readLine().split(" ");
    int c = Integer.parseInt(input1[0]);
    String d = input1[1];

    int answer;

    if (a >= 19 && b.contains("M")) {
      answer = 1;
    } else if (c >= 19 && d.contains("M")) {
      answer = 1;
    } else {
      answer = 0;
    }

      System.out.println(answer);

  }
}