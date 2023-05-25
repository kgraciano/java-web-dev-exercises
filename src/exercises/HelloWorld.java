package exercises;
import java.util.Scanner;
public class HelloWorld {
    public static void main( String[] args) {
        //exercise 1:  Prompting the user for their name and greet them by name:
        //Declaring a variable of type Scanner called input
Scanner input = new Scanner(System.in);
        //Add a question to ask the user
System.out.println("Hello, what is your name?");
        //Creating a variable to store the users response using the Scanner's .nextLine() method
String name = input.nextLine();
        //Using concatenation to print the greeting
System.out.println("Hello " + name);

        //width

    }
}
