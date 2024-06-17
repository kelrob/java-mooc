import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] strings = input.split(" ");
            printLastWords(strings);
        }
    }

    public static void printLastWords(String[] strings) {
        System.out.println(strings[strings.length - 1]);
    }
}
