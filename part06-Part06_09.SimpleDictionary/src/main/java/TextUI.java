import java.util.Scanner;

public class TextUI {

    private final Scanner scanner;
    private final SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (command.equals("add")) {
                addWordToDictionary();
                continue;
            }

            if (command.equals("search")) {
                searchFromDictionary();
                continue;
            }

            System.out.println("Unknown command");
        }
    }

    private void addWordToDictionary() {
        System.out.print("Word: ");
        String word = this.scanner.nextLine();

        System.out.print("Translation: ");
        String translation = this.scanner.nextLine();

        this.simpleDictionary.add(word, translation);
    }

    private void searchFromDictionary() {
        System.out.print("To be translated: ");
        String word = this.scanner.nextLine();
        String translation = this.simpleDictionary.translate(word);

        if (translation == null) {
            System.out.println("Word " + word + " was not found");
        } else {
            System.out.println("Translation: " + translation);
        }

    }

}
