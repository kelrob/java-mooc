
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int taxLimit = 100;
        double taxRate = 0.08;
        boolean shouldTax = false;
        double taxValue = 0;
        String response = "";

        System.out.println("Value of the gift?");
        int giftValue = Integer.valueOf(scan.nextLine());

        if (giftValue < 5000) {
            response = "No tax!";
        } else if (giftValue >= 5000 && giftValue <= 25000) {
            taxValue = taxLimit + ((giftValue - 5000) * taxRate);
        } else if (giftValue > 25000 && giftValue <= 55000) {
            taxLimit = 1700;
            taxRate = 0.10;
            taxValue = taxLimit + ((giftValue - 25000) * taxRate);
        } else if (giftValue > 55000 && giftValue <= 200000) {
            taxLimit = 4700;
            taxRate = 0.12;
            taxValue = taxLimit + ((giftValue - 55000) * taxRate);
        } else if (giftValue > 200000 && giftValue <= 1000000) {
            taxLimit = 22100;
            taxRate = 0.15;
            taxValue = taxLimit + ((giftValue - 200000) * taxRate);
        } else if (giftValue > 1000000) {
            taxLimit = 142100;
            taxRate = 0.17;
            taxValue = taxLimit + ((giftValue - 1000000) * taxRate);
        }

        if (response.equals("No tax!")) {
            System.out.println(response);
        } else {
            System.out.println("Tax: " + taxValue);
        }
    }
}
