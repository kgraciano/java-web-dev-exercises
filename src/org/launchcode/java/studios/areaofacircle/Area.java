package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;


public class Area {
    public static void main( String[] args) {
        //declaring a data type for variables
        double radius;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");


        radius = input.nextDouble();


        input.close();

        area = Circle.getArea(radius);
System.out.println("The area of the circle of radius " + radius + " is: " + area);


    }
}
