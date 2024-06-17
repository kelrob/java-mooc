import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int longestNameLength = 0;
        int yearsSum = 0;
        int profileCount = 0;

        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }

            String[] profile = userInput.split(",");
            String currentName = profile[0];

            if (currentName.length() > longestNameLength) {
                longestNameLength = currentName.length();
                longestName = currentName;
            }

            yearsSum += Integer.parseInt(profile[1]);
            profileCount++;
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (double) yearsSum / profileCount);
    }
}
