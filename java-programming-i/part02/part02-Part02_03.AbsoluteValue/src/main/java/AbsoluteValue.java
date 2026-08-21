
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInt = Integer.valueOf(scanner.nextLine());

        if (userInt < 0) {
            System.out.println(userInt * -1);
        } else {
            System.out.println(userInt);
        }
    }
}
