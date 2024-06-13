
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        int evenCount = 0;
        
        System.out.println("Give numbers:");

        while (true) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number != -1) {
                sum += number;
                count += 1;
                
                if (number % 2 == 0) {
                    evenCount++;
                }
                
                continue;
            }

            break;
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + (double) sum / count);
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + (count - evenCount));
    }
}
