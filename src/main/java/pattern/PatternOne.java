package pattern;

import java.util.Scanner;

public class PatternOne {

    public static void main(String[] args) {

        System.out.println("Enter the Row :");
        Scanner scanner = new Scanner(System.in);
        int numberOfRows = scanner.nextInt();
        scanner.close();

        int numberOfSpaces = numberOfRows;
        for (int rows = 1; rows <= numberOfRows; rows++) {

            for (int spaces = numberOfSpaces - 1; spaces > 0; spaces--) {
                System.out.print(" ");
            }
            numberOfSpaces--;
            for (int stars = 1; stars <= 2 * rows - 1; stars++) {
                System.out.print("*");
            }
            System.out.println("");

        }


    }

}
