package Basic2;

import java.util.Scanner;

public class PositiveOrNegavtive {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a input: ");
        int input = scanner.nextInt();
        scanner.close();
        if(input > 0)
            System.out.println("Number is Positive");
        else
            System.out.println("Number is Negative");
    }


}
