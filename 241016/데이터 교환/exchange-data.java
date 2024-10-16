public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;
        System.out.println((b = a));
        System.out.println((c = b + 1));
        System.out.println((a = c + 1));

    }
}