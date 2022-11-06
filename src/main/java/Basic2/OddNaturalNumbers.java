package Basic2;

import java.util.Scanner;

public class OddNaturalNumbers {

        public static void main(String[] args) {
            System.out.println("Input Number: ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            scanner.close();
            int sum = 0;
            int looplimit = 2*number;
            System.out.println("The first "+number+" odd Natural numbers are: ");
            for (int i = 1; i <= looplimit; i = i+2)
            {
                System.out.println(i);
                sum = sum + i;
            }
            System.out.println("The Sum of odd Natural Number upto "+number+" terms :" +sum);

        }

}
