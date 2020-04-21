package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of miles you have driven: ");
        int miles = input.nextInt();

        System.out.println("Enter the amount of gas in gallons your vehicle has consumed: ");
        int gas = input.nextInt();

        double mpg = miles / gas;
        System.out.println("You are getting "+ mpg +" miles to the gallon.");

    }
}
