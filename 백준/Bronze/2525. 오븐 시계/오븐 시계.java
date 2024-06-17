import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();  
        int B = in.nextInt();  
        int C = in.nextInt();  

  
        int totalMinutes = B + C;


        int newHour = A + (totalMinutes / 60);
        int newMin = totalMinutes % 60;


        newHour = newHour % 24;

        System.out.println(newHour + " " + newMin);
    }
}