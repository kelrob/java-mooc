import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner scanner1 = new Scanner(Paths.get(file))) {
            while (scanner1.hasNextLine()) {
                String line = scanner1.nextLine();
                String[] array = line.split(",");
                String name = array[0];
                int age = Integer.parseInt(array[1]);

                System.out.println(name + ", age: " + age + " years");
            }


        } catch (Exception e) {
            System.out.println("There was an error reading this file");
        }
    }
}
