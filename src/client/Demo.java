
import java.util.Scanner;

public class Demo {
    private static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
	System.out.println();
	System.out.println();
	System.out.println("Welcome to the CoinFlips Demo!");

	fixedDemo();
	interactiveDemo();
	
	System.out.println();
	System.out.println();
	System.out.println("Thanks for watching the CoinFlips Demo.");
	System.out.println("Have a wonderful day!");
	System.out.println();
    }
    private static void fixedDemo() {
	System.out.println();
	System.out.println();
	System.out.println("Making a Coin(0.01)");
	System.out.println("Result:" + new Penny(1));
	System.out.println("Making a Coin(0.05)");
	System.out.println("Result:" + new Dime(1));
	System.out.println("Making a Coin(0.10)");
	System.out.println("Result:" + new Nickel(1));
	System.out.println("Making a Coin(0.25)");
	System.out.println("Result:" + new Quarter(1));
	System.out.println("Making a Coin(0.50)");
	System.out.println("Result:" + new HalfDollar(1));
	System.out.println("Making a Coin(1.00)");
	System.out.println("Result:" + new Dollar(1));
    }
    private static void printMenu() {
	System.out.println();
	System.out.println();
	System.out.println("I'm ready to make you a coin!");
	System.out.println("Enter G for a dollar coin.");
	System.out.println("Enter H for a half dollar coin.");
	System.out.println("Enter Q for a quarter  coin.");
	System.out.println("Enter D for a dime  coin.");
	System.out.println("Enter N for a nickel coin.");
	System.out.println("Enter P for a penny coin.");
	System.out.println();
	System.out.println("Enter X to exit the demo.");
	System.out.println();
    }
    private static void interactiveDemo() {
	System.out.println();
	System.out.println();
	System.out.println("Would you like to make more coins yourself? (Y/n) ");
	String response = keyboard.nextLine();
	response = response.trim();
	if (response.charAt(0) == 'Y' || response.charAt(0) == 'y')
	    runDemo();
    }
    private static void runDemo() {
	Coin c;
	

	while (true) {
	    System.out.println();
	    System.out.println();

	    printMenu();
	    System.out.print("What coin to make? ");
	    String response = keyboard.nextLine();
	    response = response.trim();
	    switch (response.charAt(0)) {
	        case 'G':
		    System.out.println("Gonna make a dollar coin...");
		    c = new Dollar(1);
		    break;
	        case 'H':
		    System.out.println("Gonna make a half dollar coin...");
		    c = new HalfDollar(1);
		    break;
	        case 'Q':
		    System.out.println("Gonna make a quarter coin...");
		    c = new Quarter(1);
		    break;
	        case 'D':
		    System.out.println("Gonna make a dime coin...");
		    c = new Dime(1);
		    break;
	        case 'N':
		    System.out.println("Gonna make a nickel coin...");
			c = new Nickel(1);
		    break;
	        case 'P':
		    System.out.println("Gonna make a penny coin...");
		    c = new Penny(1);
		    break;
	        case 'X':
		    return;
	        default:
		    System.out.println("Invalid entry, try again.");
		    break;
	    }
	}
    }
}
