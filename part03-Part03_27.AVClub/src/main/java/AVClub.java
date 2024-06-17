import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] splittedString = input.split(" ");
            printStringsWithAV(splittedString);
        }
    }

    public static void printStringsWithAV(String[] strings) {
        for (String string : strings) {
            if (string.contains("av")) {
                System.out.println(string);
            }
        }
    }
}
