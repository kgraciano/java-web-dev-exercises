package exercises;
import java.util.Scanner;
public class Area {
    public static void main( String[] args){
        Scanner input = new Scanner(System.in); //created a Scanner object
        System.out.println("What is the length of the rectangle?");

        int length = input.nextInt();


        System.out.println("What is the width?");
        int width = input.nextInt();


        int sum = length * width;
        System.out.println("The area of your rectangle is: " + sum);

    }
}
