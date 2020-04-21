package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number for the radius:");
        Double radiusInput = input.nextDouble();

        Double areaCalc = Circle.getArea(radiusInput);
        System.out.println("The area of a circle of radius "+ radiusInput + " is " + areaCalc + ".");

    }
}
