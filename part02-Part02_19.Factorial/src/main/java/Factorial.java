
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        int factorial = 1;
        
        if (number == 0) {
            System.out.println(1);
        } else {
            for (int i = number; i > 0; i --) {
                factorial = factorial * i;
            }
        }
        
        System.out.println("Factorial: " + factorial);
    }
}
