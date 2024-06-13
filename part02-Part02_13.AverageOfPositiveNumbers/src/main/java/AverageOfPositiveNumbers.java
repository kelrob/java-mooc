
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPositives = 0;
        int sumOfPositives = 0;
        double average = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number > 0) {
                countPositives = countPositives + 1;
                sumOfPositives = sumOfPositives + number;
            }

            average = (double) sumOfPositives / countPositives;
        }

        if (countPositives == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(average);
        }

    }
}
