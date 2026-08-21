
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputCounter = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int userNumber = Integer.valueOf(scanner.nextLine());

            if (userNumber == 0) {
                break;
            }

            inputCounter += 1;
            sum += userNumber;
        }

        System.out.println("Number of numbers: " + inputCounter);
        System.out.println("Sum of the numbers: " + sum);
    }
}
