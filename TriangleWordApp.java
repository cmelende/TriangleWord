import java.io.PrintStream;
import java.util.Scanner;

import TriangleWord.TriangleWord;

public class TriangleWordApp {
    public static void main(final String[] args) {
        final Scanner Input = new Scanner(System.in);
        final PrintStream Output = System.out;
        boolean quitProgram = false;
        final String exitKey = "Q";

        Output.println("----------------------------------------------------------------------------");
        Output.println("Welcome to my Triangle Word app!");
        Output.println("----------------------------------------------------------------------------");

        while (!quitProgram) {
            Output.println("Please enter the word you want to make into a triangle or press 'Q' to exit");
            final String userInput = Input.nextLine();
            quitProgram = userInput.equals(exitKey);

            Output.println("----------------------------------------------------------------------------");
            if (!quitProgram)
                Run(userInput, Output);
            Output.println("----------------------------------------------------------------------------");
        }

        Output.println("Goodbye");
    }

    private static void Run(final String userInput, final PrintStream stream) {
        try {
            final TriangleWord triangle = new TriangleWord(userInput);
            triangle.Output();
        } catch (final Exception e) {
            stream.println(e.getMessage());
        }
    }
}