
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int integerValue = Integer.valueOf(scanner.nextLine());
        int squaredValue = integerValue * integerValue;
        
        System.out.println(squaredValue);

    }
}
