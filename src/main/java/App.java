import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Welcome to Caleb's Event Planning App!\n" +
    "Please answer the following questions and a quote will be generated for you.");

    System.out.println("How many attendees are you expecting?\n" +
    "Please enter a number:");
    int guests = Integer.parseInt(myConsole.readLine());

    System.out.println("Which food option would you prefer?\n" +
    "Please enter 'snacks', 'buffet', or 'catered' :");
    String food = myConsole.readLine();

    System.out.println("Will you be booking a live band?\n" +
    "Please enter 'yes' or 'no' :");
    String band = myConsole.readLine();

    System.out.println("Would you like a full bar provided?\n" +
    "Please enter 'yes' or 'no' :");
    String bar = myConsole.readLine();

    System.out.println("Is your event scheduled on a weekend?\n" +
    "Please enter 'yes' or 'no' :");
    String weekend = myConsole.readLine();

  }
}
