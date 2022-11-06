package Basic2;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number:");
        int table = scanner.nextInt();
        System.out.println("Input 2nd integer:");
        int terms = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= terms; i++)
            System.out.println(table+" X "+i+" = "+(i*table));
    }
}
