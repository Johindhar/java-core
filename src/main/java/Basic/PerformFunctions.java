package Basic;

import java.util.Scanner;

public class PerformFunctions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1st integer:");
        int firstInput = scanner.nextInt();
        System.out.println("Input 2nd integer:");
        int secondInput = scanner.nextInt();
        scanner.close();
        int max, min;

        if(firstInput > secondInput){
            max = firstInput;
            min = secondInput;
        }
        else
        {
            max = secondInput;
            min = firstInput;
        }

        System.out.println("Sum of two integers :"+ (max+min));
        System.out.println("Difference of two integer: "+ (max-min));
        System.out.println("Product of two integer: "+ (max*min));
        System.out.println("Average of two integer: "+ ((max+min)/2));
        System.out.println("Distance of two integer: "+ (max-min));
        System.out.println("Maximum Integer: "+max);
        System.out.println("Minimum Integer: "+min);

    }


}
