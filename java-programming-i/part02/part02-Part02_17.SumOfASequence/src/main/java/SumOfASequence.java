
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Last number? ");
        int lastNumber = Integer.valueOf(scanner.nextLine());

        int sequenceSum = 0;

        for (int i = 1; i <= lastNumber; i++) {
            sequenceSum += i;
        }

        System.out.println("The sum is " + sequenceSum);
    }
}
