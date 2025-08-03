import java.util.Scanner;

public class inputTaking {
    public static void main(String[] args){
        System.out.println("Enter your input: ");
        Scanner input = new Scanner(System.in);  // System.in means standard input stream
        String userInput = input.nextLine();  // Read user input as a string
        System.out.println("You entered: " + userInput);  // Output the user input

    }
}
