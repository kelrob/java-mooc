import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        boolean found = false;

        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            Book book = new Book(name, publicationYear);

            for (Book book2 : books) {
                if (book2.equals(book)) {
                    found = true;
                    System.out.println("The book is already on the list. Let's not add the same book again.");

                }
            }

            if (!found) {
                books.add(book);
            }
            found = false;
            
        }

        // NB! Don't alter the line below!
        System.out.println("Thank you! Books added: " + books.size());
    }
}
