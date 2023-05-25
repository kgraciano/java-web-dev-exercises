package exercises;
import java.util.Scanner;
public class Alice {
    public static void main( String[] args){
        //Concatenated String sentence
        String sentence = "Alice was beginning to get very tired of sitting by her sister" +
                " on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, but it " +
                "had no pictures or conversations in it, 'and what is the use of a book,' thought Alice" +
                "'without pictures or conversation?'";
//creating an instance of the Scanner object to prompt the user
        Scanner input = new Scanner(System.in);
        //Prompting the user
        System.out.println("Enter a term to indicate if the term is present within the sentence: ");

        String word = input.next().toLowerCase();
        System.out.println("this is the word user entered: " + word);
Boolean search = sentence.toLowerCase().contains(word);
        if (search) {
            int termIndex = sentence.toLowerCase().indexOf(word);
            System.out.println("This is the index of the term within the sentence: " + termIndex);
            System.out.println("The length of the term is: " + word.length());
        } else {
System.out.println("This term is not present in the sentence.");
        }
String removed = sentence.replaceAll(word, "");
        System.out.println(removed);

//why is alice still displayed after entering alice in lowercase? how do I fix this?
        }
    }

