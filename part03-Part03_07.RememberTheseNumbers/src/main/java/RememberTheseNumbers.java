import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }

        int index = 0;
        while (index < numbers.size()) {
            System.out.println(numbers.get(index));
            index++;
        }
    }
}
