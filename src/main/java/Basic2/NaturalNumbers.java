package Basic2;

import java.util.Scanner;

public class NaturalNumbers {

    public static void main(String[] args) {
        System.out.println("Input Number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        int sum = 0;
        System.out.println("The first "+number+" Natural numbers are: ");
        for (int i = 1; i <= number;i++)
        {
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println("The Sum of Natural Number upto "+number+" terms :" +sum);

    }
}
