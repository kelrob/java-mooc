import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        int index = 0;
        int greatestNumber = list.get(index);
        while (index < list.size()) {
            if (greatestNumber < list.get(index)) {
                greatestNumber = list.get(index);
            }
            index++;
        }

        System.out.println("The greatest number: " + greatestNumber);
    }
}
