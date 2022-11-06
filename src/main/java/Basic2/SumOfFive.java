package Basic2;

import java.util.Scanner;

public class SumOfFive {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        int firstInput = scanner.nextInt();
        int secondInput = scanner.nextInt();
        int thirdInput = scanner.nextInt();
        int fourthInput = scanner.nextInt();
        int fifthInput = scanner.nextInt();
        scanner.close();

        int sum = firstInput+secondInput+thirdInput+fifthInput+fourthInput;
        double avg = sum/5;
        System.out.println("The sum of 5 no is "+sum);
        System.out.println("The Average is "+avg);
    }
}
