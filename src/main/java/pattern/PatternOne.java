package pattern;

import java.util.Scanner;

public class PatternOne {

    public static void main(String[] args) {

        System.out.println("Enter the Row :");
        Scanner sc = new Scanner(System.in);
        int numberOfRows = sc.nextInt();
        sc.close();

        int m = numberOfRows;
        for(int i = 1; i<=numberOfRows;i++){

            for (int j = m-1 ; j>0; j--){

                System.out.print(" ");
            }
            m = m-1;
            for(int k = 1; k <= 2*i - 1; k++)
            {
                System.out.print("*");
            }
            System.out.println("");

        }


    }

}
