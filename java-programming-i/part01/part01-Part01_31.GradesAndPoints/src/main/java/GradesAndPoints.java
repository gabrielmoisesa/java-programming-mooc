
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]:");

        int userPoints = Integer.valueOf(scan.nextLine());
        String userGrade = "impossible!";

        if (userPoints > 100) {
            userGrade = "incredible";
        } else if (userPoints >= 90) {
            userGrade = "5";
        } else if (userPoints >= 80) {
            userGrade = "4";
        } else if (userPoints >= 70) {
            userGrade = "3";
        } else if (userPoints >= 60) {
            userGrade = "2";
        } else if (userPoints >= 50) {
            userGrade = "1";
        } else if (userPoints >= 0) {
            userGrade = "failed";
        }

        System.out.println("Grade: " + userGrade);
    }
}
