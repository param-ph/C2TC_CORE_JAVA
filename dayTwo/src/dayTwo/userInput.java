package dayTwo;
import java.util.Scanner;
public class userInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter your age");
		int name = scanner.nextInt();
		System.out.println("hello," + name + "!");
		scanner.close();
		

	}

}
