import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ages = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] splittedString = input.split(",");
            ages.add(Integer.parseInt(splittedString[1]));
        }

        System.out.println("Age of the oldest: " + getAgeOfOldest(ages));
    }

    public static int getAgeOfOldest(ArrayList<Integer> ages) {
        int oldestAge = 0;
        for (int age : ages) {
            if (oldestAge < age) {
                oldestAge = age;
            }
        }

        return oldestAge;
    }
}
