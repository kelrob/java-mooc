import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("Give two indices to swap:");
        int indicesOne = Integer.parseInt(scanner.nextLine());
        int indicesTwo = Integer.parseInt(scanner.nextLine());
        int helper = array[indicesOne];
        array[indicesOne] = array[indicesTwo];
        array[indicesTwo] = helper;

        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

}
