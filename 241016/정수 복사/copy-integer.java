public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println(a + " " + (b = a));
        System.out.println(a * b);
    }
}