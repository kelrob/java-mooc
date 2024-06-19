import java.util.Scanner;

public class UserInterface {
    private final JokeManager jokeManager;
    private final Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.println("Commands");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");

            String command = this.scanner.nextLine();
            if (command.equals("X")) {
                break;
            }
            processCommand(command);
        }
    }

    public void processCommand(String command) {
        if (command.equals("1")) {
            addJoke();
        }

        if (command.equals("2")) {
            drawJoke();
        }

        if (command.equals("3")) {
            listJokes();
        }
    }

    public void addJoke() {
        System.out.println("Write the joke to be added:");
        this.jokeManager.addJoke(this.scanner.nextLine());
    }

    public void drawJoke() {
        System.out.println(this.jokeManager.drawJoke());
    }

    public void listJokes() {
        System.out.println("Printing the jokes.");
        this.jokeManager.printJokes();
    }

}
