import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int countA = 0; 

        for (int i = 0; i < 3; i++) {
            String[] input = reader.readLine().split(" ");
            String symptom = input[0];
            int temperature = Integer.parseInt(input[1]);

            if (symptom.equals("Y") && temperature >= 37) {
                countA++; 
            }
        }

        if (countA >= 2) {
            System.out.println("E");  
        } else {
            System.out.println("N"); 
        }
    }
}