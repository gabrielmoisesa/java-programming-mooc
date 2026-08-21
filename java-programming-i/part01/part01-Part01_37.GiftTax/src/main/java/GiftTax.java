
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");

        int giftValue = Integer.valueOf(scan.nextLine());
        double taxAmount = 0;

        if (giftValue >= 5000 && giftValue <= 25000) {
            taxAmount = 100 + ((giftValue - 5000) * 0.08);
        } else if (giftValue >= 25000 && giftValue <= 55000) {
            taxAmount = 1700 + ((giftValue - 25000) * 0.1);
        } else if (giftValue >= 55000 && giftValue <= 200000) {
            taxAmount = 4700 + ((giftValue - 55000) * 0.12);
        } else if (giftValue >= 200000 && giftValue <= 1000000) {
            taxAmount = 22100 + ((giftValue - 200000) * 0.15);
        } else if (giftValue >= 1000000) {
            taxAmount = 142100 + ((giftValue - 1000000) * 0.17);
        }

        if (taxAmount == 0) {
            System.out.println("No tax!");
        } else {
            System.out.println("Tax: " + taxAmount);
        }
    }
}
