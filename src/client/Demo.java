
import java.util.Scanner;
import javax.swing.JFrame;

public class Demo {
    private static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) throws InterruptedException{
		JFrame frame = new JFrame("Coin Counter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		System.out.println("Creating a quarter...");
		Coin quarter = new Quarter();
		quarter.manufacture();
		System.out.println("Creating another quarter (added some delay to see response)");
		Thread.sleep(2000);
		Coin quarter2 = new Quarter();
		quarter2.manufacture();
		System.out.println("Creating a penny to see total count go up but not quarter (with more delay)");
		Thread.sleep(2000);
		Coin penny = new Penny();
		penny.manufacture();
		System.out.println("Demo complete (There should be 2 quarters and 3 total coins)");
		interactiveDemo();
    }
    private static void printMenu() {
		System.out.println();
		System.out.println("I'm ready to make you a coin!");
		System.out.println("Enter G for a dollar coin.");
		System.out.println("Enter H for a half dollar coin.");
		System.out.println("Enter Q for a quarter  coin.");
		System.out.println("Enter D for a dime  coin.");
		System.out.println("Enter N for a nickel coin.");
		System.out.println("Enter P for a penny coin.");
		System.out.println();
		System.out.println("Close the dashboard window to exit the demo.");
		System.out.println();
    }
    private static void interactiveDemo() {
		while (true) {
			Coin c;
			printMenu();
			System.out.print("What coin to make? ");
			String response = keyboard.nextLine();
			response = response.trim().toUpperCase();
			switch (response.charAt(0)) {
				case 'G':
				System.out.println("\nGonna make a dollar coin...");
				c = new Dollar();
				c.manufacture();
				break;
				case 'H':
				System.out.println("\nGonna make a half dollar coin...");
				c = new HalfDollar();
				c.manufacture();
				break;
				case 'Q':
				System.out.println("\nGonna make a quarter coin...");
				c = new Quarter();
				c.manufacture();
				break;
				case 'D':
				System.out.println("\nGonna make a dime coin...");
				c = new Dime();
				c.manufacture();
				break;
				case 'N':
				System.out.println("\nGonna make a nickel coin...");
				c = new Nickel();
				c.manufacture();
				break;
				case 'P':
				System.out.println("\nGonna make a penny coin...");
				c = new Penny();
				c.manufacture();
				break;
				default:
				System.out.println("\nInvalid entry, try again.");
				break;
			}
			}
	}
}
