import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);

        int mpg = 0;
        double tank = 0.0;
        double percentage = 0.0;
        double rawRange = 0.0;

        System.out.println("Enter your car’s MPG rating (miles/gallon) as a positive integer: ");
        mpg = scnr.nextInt();

        if (mpg <= 0) {
            System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
            return;
        } else {
            System.out.println("Enter your car’s tank capacity (gallons) as a positive decimal number: ");
        }

        tank = scnr.nextDouble();

        if (tank <= 0) {
            System.out.println("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
            return;
        } else {
            System.out.println("Enter the percentage of the gas tank that is currently filled (from 0-100%): ");
        }

        percentage = scnr.nextDouble();

        if ((percentage < 0) || (percentage > 100)) {
            System.out.println("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100" +
                    "(INCLUSIVE)!!!");
            return;
        } else {
            rawRange = (mpg * (percentage * 0.01) * tank);
        }

        long range = Math.round(rawRange);

        System.out.println("Miles left in range: " + range);

        if (range <= 25) {
            System.out.println("Attention! Your current estimated range is running low!!!");
        } else {
            System.out.println("You can keep driving for a good long while!:D");
        }

        return;



    }
}
