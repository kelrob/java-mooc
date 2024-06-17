import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestAge = 0;
        String oldestName = "";

        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }

            String[] profiles = userInput.split(",");
            int currentAge = Integer.parseInt(profiles[1]);
            String currentName = profiles[0];

            if (oldestAge < currentAge) {
                oldestAge = currentAge;
                oldestName = currentName;
            }

        }
        System.out.println("Name of the oldest: " + oldestName);
    }
}
