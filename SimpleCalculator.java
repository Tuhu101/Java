// Imports. \\
import java.util.Scanner;

// This class is for the simple calculator. \\
class simpleCalculator {
    public static void Calculator() {
        // Variables for the numbers. \\
        double num1, num2;

        Scanner input = new Scanner(System.in);

        // Calls the clearscreen method from the main class. \\
        Main.clearScreen();
        System.out.print("Hello and welcome to the simple calculator");
        System.out.print("This calculator takes just 2 numbers " +
                "and does the basic math operations\n");
        System.out.println("\nPLease enter first number: ");
        num1 = input.nextDouble();
        System.out.println("\nPlease enter second number: ");
        num2 = input.nextDouble();

        System.out.println("\nEnter an operator (+, -, *, /): ");
        char op = input.next().charAt(0);
        double o = 0;

        // Switch case for the user choice. \\
        switch (op) {
            case '+':
                o = num1 + num2;
                break;

            case '-':
                o = num1 - num2;
                break;

            case '*':
                o = num1 * num2;
                break;

            case '/':
                o = num1 / num2;
                break;

            default:
                System.out.println("Invalid operator");
        }

        System.out.println("The final result: ");
        System.out.println();

        System.out.print("Operation made: " + num1 + " " + op + " " + num2 + " = " + o);
    }
}
