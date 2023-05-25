package exercises;
import java.util.Scanner;
public class Miles {
    public static void main( String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the number of miles you've driven?");
        Double miles = input.nextDouble();
        System.out.println("How many gallons of gas?");
        Double gallonsOfGas = input.nextDouble();
        Double milesPerGallon = miles / gallonsOfGas;
        System.out.println("This is your miles per gallon: " + milesPerGallon);

    }
}
