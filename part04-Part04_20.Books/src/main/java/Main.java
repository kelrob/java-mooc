import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int page = Integer.parseInt(scanner.nextLine());

            System.out.print("Publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            Book book = new Book(title, page, publicationYear);
            books.add(book);
        }

        System.out.print("What information will be printed? ");
        String infoToPrint = scanner.nextLine();

        if (infoToPrint.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        }

        if (infoToPrint.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }
    }
}
