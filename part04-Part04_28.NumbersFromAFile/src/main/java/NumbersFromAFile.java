import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();

        System.out.print("Lower bound? ");
        int lowerBound = Integer.parseInt(scanner.nextLine());

        System.out.print("Upper bound? ");
        int upperBound = Integer.parseInt(scanner.nextLine());

        int count = 0;
        try (Scanner scanner1 = new Scanner(Paths.get(file))) {
            while (scanner1.hasNextLine()) {
                int number = Integer.parseInt(scanner1.nextLine());
                if (number >= lowerBound && number <= upperBound) {
                    count++;
                }
            }
        } catch (Exception e) {
            System.out.println("There was an error reading this file");
        }

        System.out.println("Numbers: " + count);
    }

}
