
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInt1 = Integer.valueOf(scanner.nextLine());
        int userInt2 = Integer.valueOf(scanner.nextLine());

        if (userInt1 > userInt2) {
            System.out.println(userInt1 + " is greater than " + userInt2);
        } else if (userInt1 < userInt2) {
            System.out.println(userInt1 + " is smaller than " + userInt2);
        } else {
            System.out.println(userInt1 + " is equal to " + userInt2);
        }
    }
}
