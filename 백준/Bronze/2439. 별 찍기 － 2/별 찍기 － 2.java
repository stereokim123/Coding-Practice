import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { // 1~N행까지 출력
            for (int j = 1; j <= n - i; j++) { // 공백 출력
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) { // for문 변수 k를 이용하여 * 출력
                System.out.printf("*");

            }
            System.out.println();
        }
    }
}
