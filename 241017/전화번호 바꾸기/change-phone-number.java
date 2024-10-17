import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    sc.useDelimiter("-");
    String y = sc.next();
    int m = sc.nextInt();
    int d = sc.nextInt();
    System.out.println(y + "-" + d + "-" + m);
  }
}