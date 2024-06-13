public class StarSign {

    public static void main(String[] args) {
        printTriangle(3);
    }

    public static void printStars(int number) {
        while (number > 0) {
            System.out.print("*");
            number--;
        }
        System.out.print("\n");
    }

    public static void printSquare(int size) {
        int starNumber = size;
        while (size > 0) {
            printStars(starNumber);
            size--;
        }
    }

    public static void printRectangle(int width, int height) {
        while (height > 0) {
            printStars(width);
            height--;
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(i);
        }
    }
}
