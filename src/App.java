import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display the question and get user input
        System.out.println(question());
        String userInput = input.next();

        // Check user input and perform corresponding action
        if ("go".equalsIgnoreCase(userInput)) {
            go();
        } else if ("stop".equalsIgnoreCase(userInput)) {
            stop();
        } else {
            System.out.println("Invalid input. Please type 'go' or 'stop'.");
        }
    }

    // Method to simulate moving the car
    static void go() {
        System.out.println("The car is now moving.");
    }

    // Method to simulate stopping the car
    static void stop() {
        System.out.println("The car is now stopped.");
    }

    // Method to display the question
    static String question() {
        return "Type 'go' to move or 'stop' to stop:";
    }
}
