package Basic;

import java.util.Scanner;

public class Speed {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input distance in meters:");
        double meter = scanner.nextInt();
        System.out.println("Input Hours: ");
        int hour = scanner.nextInt();
        System.out.println("Input minutes:");
        int minute = scanner.nextInt();
        System.out.println("Input seconds:");
        int seconds = scanner.nextInt();
        scanner.close();

        double kilometer = meter/1000;
        double mile = meter/1609;

        double totalSeconds = seconds + (minute*60) + (hour*3600);
        double totalHours = totalSeconds/3600;

        double meterPerSecond = meter / totalSeconds;
        double kmPerHour = kilometer / totalHours;
        double milePerHour = mile / totalHours;
        System.out.println(kilometer+" "+mile+" "+totalSeconds+" "+totalHours);

        System.out.println("Your speed in meters/seconds is "+meterPerSecond);
        System.out.println("Your speed in km/h is "+kmPerHour);
        System.out.println("Your speed in miles/h is "+milePerHour);

    }


}
