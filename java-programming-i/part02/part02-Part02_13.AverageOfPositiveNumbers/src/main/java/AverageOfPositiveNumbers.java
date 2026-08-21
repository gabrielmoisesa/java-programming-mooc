
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveNumberCounter = 0;
        int sumOfPositive = 0;

        while (true) {
            System.out.println("Give a number:");
            int userNumber = Integer.valueOf(scanner.nextLine());

            if (userNumber == 0) {
                break;
            }

            if (userNumber > 0) {
                positiveNumberCounter += 1;
                sumOfPositive += userNumber;
            }
        }

        if (sumOfPositive <= 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double averageOfPositives = Double.valueOf(sumOfPositive) / positiveNumberCounter;
            System.out.println(averageOfPositives);
        }
    }
}
