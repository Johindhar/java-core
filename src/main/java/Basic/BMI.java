package Basic;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input weight in Kg:");
        int weight = scanner.nextInt();
        System.out.println("Input height in Cm:");
        int height = scanner.nextInt();
        scanner.close();

        double heightSquare = height * height;
        double result = (weight/heightSquare) * 10000;

        System.out.println("Body Mass Index is :"+ result);

    }

}
