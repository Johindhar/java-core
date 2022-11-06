package Basic2;

import java.util.Scanner;

public class MaximumOfThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1st integer:");
        int firstInput = scanner.nextInt();
        System.out.println("Input 2nd integer:");
        int secondInput = scanner.nextInt();
        System.out.println("Input 2nd integer:");
        int thirdInput = scanner.nextInt();
        scanner.close();

        if(firstInput > secondInput){
            if(firstInput > thirdInput)
                System.out.println("The Greatest: "+firstInput);
        }
        else if (secondInput > thirdInput)
            System.out.println("The Greatest: "+secondInput);
        else
            System.out.println("The Greatest: "+thirdInput);
    }
}
