
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int userNumber = Integer.valueOf(scanner.nextLine());

            if (userNumber == 0) {
                break;
            }

            sum += userNumber;
        }

        System.out.println("Sum of the numbers: " + sum);
    }
}
