
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);

        int totalSum = 0;
        int numberCounter = 0;
        int evenCounter = 0;
        int oddCounter = 0;

        System.out.println("Give numbers:");

        while (true) {
            int userNumber = Integer.valueOf(scanner.nextLine());

            if (userNumber == -1) {
                System.out.println("Thx! Bye!");
                break;
            }

            if (userNumber % 2 == 0) {
                evenCounter += 1;
            } else {
                oddCounter += 1;
            }

            totalSum += userNumber;
            numberCounter += 1;
        }

        double average = Double.valueOf(totalSum) / numberCounter;

        System.out.println("Sum: " + totalSum);
        System.out.println("Numbers: " + numberCounter);
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenCounter);
        System.out.println("Odd: " + oddCounter);
    }
}
