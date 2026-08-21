
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInteger = Integer.valueOf(scanner.nextLine());
        int userIntegerSquare = userInteger * userInteger;

        System.out.println(userIntegerSquare);
    }
}
