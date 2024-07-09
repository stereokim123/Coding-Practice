import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int min = arr[0]; // 배열의 첫 번째 요소를 최소값으로 초기화
        int max = arr[0]; // 배열의 첫 번째 요소를 최대값으로 초기화

        for (int i = 1; i < arr.length; i++) { // 배열의 두 번째 요소부터 순회
            if (arr[i] < min) { // 현재 요소가 최소값보다 작으면
                min = arr[i]; // 최소값을 현재 요소로 갱신
            }
            if (arr[i] > max) { // 현재 요소가 최대값보다 크면
                max = arr[i]; // 최대값을 현재 요소로 갱신
            }
        }

        System.out.println(min + " " + max); // 최소값 출력

    }
}


