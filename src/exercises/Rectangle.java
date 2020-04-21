package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner length = new Scanner(System.in);
        Scanner width = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle:");
        double l = length.nextDouble();

        System.out.println("Enter the width of the rectangle:");
        double w = width.nextDouble();

        double area = l * w;
        System.out.println("The area is " + area);
    }
}
