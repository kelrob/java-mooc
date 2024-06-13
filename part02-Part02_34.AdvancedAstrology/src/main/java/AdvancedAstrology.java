public class AdvancedAstrology {

    public static void printStars(int number) {
        while (number > 0) {
            System.out.print("*");
            number--;
        }
        System.out.print("\n");
    }

    public static void printSpaces(int number) {
        while (number > 0) {
            System.out.print(" ");
            number--;
        }
    }

    public static void printTriangle(int size) {

        int starStartCount = 1;

        while (size > 0) {
            printSpaces(size - 1);
            printStars(starStartCount);
            starStartCount++;
            size--;
        }
    }

    public static void christmasTree(int height) {
        int start = 1;
        int stars = 1;
        int spaceCount = height - 1;

        while (start <= height) {
            printSpaces(spaceCount);
            printStars(stars);
            stars += 2;
            start++;
            spaceCount--;
        }
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        christmasTree(7);
    }
}
