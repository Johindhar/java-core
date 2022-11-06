package Basic2;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        System.out.println("Enter a year:");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();

        if(year%4 == 0)
            System.out.println(year+"  is a leap year");
        else
            System.out.println(year+"  is a not a leap year");
    }
}
