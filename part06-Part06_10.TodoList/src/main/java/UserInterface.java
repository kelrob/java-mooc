import java.util.Scanner;

public class UserInterface {

    private final Scanner scanner;
    private final TodoList todoList;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            processCommand(command);
        }
    }

    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        }

        if (command.equals("list")) {
            list();
        }

        if (command.equals("remove")) {
            remove();
        }
    }

    public void add() {
        System.out.print("To add: ");
        this.todoList.add(this.scanner.nextLine());
    }

    public void list() {
        this.todoList.print();
    }

    public void remove() {
        System.out.print("Which one is removed? ");
        int toBeRemoved = Integer.parseInt(this.scanner.nextLine());

        this.todoList.remove(toBeRemoved);
    }
}
