import com.sun.tools.javac.Main;

import java.util.Scanner;

public class MainApplication {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a input: ");
        int input = scanner.nextInt();
        scanner.close();
        MainApplication mainApplication = new MainApplication();
        mainApplication.sequenceOfIndividualDigits(input);


    }

    public void farenheitToCelcius(int degree)
    {
        int result = (degree - 32) * 5 / 9 ;
        System.out.println("degree Fahrenheit is equal to"+result+"Celcius");

    }

    public void inchToMeters(int inch){

        double result = inch * 0.0254;
        System.out.println(inch+"inch is "+result+"meters");

    }

    public void sumOfDigits(int number){

        int temp = number;
        int ones,result = 0;

        while (temp > 0) {

            ones = temp%10;
            result = result+ones;
            temp = temp/10;
        }
        System.out.println("The Sum of all digit in "+number+" is"+result);
    }

    public void minuteToYears(int minutes){

        double temp = minutes / 1440 ;
        int years = (int) (temp / 365);
        int days = (int) (temp % 365);

        System.out.println("minutes is approximately "+years+"years and "+days+"days");
    }

    public void power(int number){

        int square = number * number;
        double cube = square * number;
        double fourth = cube * number;

        System.out.println("Square: "+square);
        System.out.println("Cube: "+cube);
        System.out.println("Fourth power: "+fourth);

    }

    public void sequenceOfIndividualDigits(int number){

        int result=0;
        while(number>0){
            result = (result*10)+(number%10);
            number = number/10;
        }
        while(result>0){
            System.out.print(" "+(result%10));
            result = result/10;
        }


    }


}


