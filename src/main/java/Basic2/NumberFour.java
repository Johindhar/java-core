package Basic2;

import java.util.Scanner;

public class NumberFour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number:");
        int input = scanner.nextInt();
        scanner.close();
        int n;
        if(input > 0)
            n = 1;
        else if (input == 0)
            n = 0;
        else
            n = -1;

        System.out.println("The value of m is :"+input);
        System.out.println("The value of n is :"+n);

    }
}
