import java.util.Scanner;

public class MainMenu {
    static void menu() {
    Main.clearScreen();
    int userChoice;
    System.out.println("Welcome to the program!");
    System.out.println("What part of the program would you like to use?\n");

    Scanner input = new Scanner(System.in);
    System.out.println("SimpleCalculator(1)");

    System.out.print("Choice: ");
    userChoice = input.nextInt();

    switch (userChoice) {
      case 1:
        simpleCalculator.Calculator();
        break;

      default:
        System.out.println("Invalid input");
    }
  }
}
