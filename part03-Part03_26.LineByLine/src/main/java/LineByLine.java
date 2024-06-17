import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }

            String[] splittedString = userInput.split(" ");
            printString(splittedString);
        }
    }

    public static void printString(String[] strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
