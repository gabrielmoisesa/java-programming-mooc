
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCounter = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int userNumber = Integer.valueOf(scanner.nextLine());

            if (userNumber == 0) {
                break;
            }

            numberCounter += 1;
            sum += userNumber;
        }

        double average = Double.valueOf(sum) / numberCounter;
        System.out.println("Average of the numbers: " + average);
    }
}
