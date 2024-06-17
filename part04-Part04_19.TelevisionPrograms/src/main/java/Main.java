import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("Duration: ");
            int duration = Integer.parseInt(scanner.nextLine());

            TelevisionProgram program = new TelevisionProgram(name, duration);
            programs.add(program);

        }

        System.out.println("\n");
        System.out.print("Program's maximum duration? ");
        int maxDuration = Integer.parseInt(scanner.nextLine());

        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= maxDuration) {
                System.out.println(program);
            }
        }

    }
}
