package Basic2;

import java.util.Scanner;

public class CubeNumbers {

    public static void main(String[] args) {

        System.out.println("Input Number of terms : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        for (int iterator = 1; iterator <= number; iterator++ ){

            System.out.println("Number is : "+iterator+" and cube of "+iterator+" is : "+(iterator*iterator*iterator));
        }

    }
}
