package dayTwo;
import java.util.Scanner;
public class loop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		if(age >= 18 ) {
			System.out.println("can vote");
			}
			else {
				System.out.println("Can't vote");
			}
		System.out.println("Enter the number");
		//Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for( int i = 0; i <= n; i ++) {
			System.out.println(i);
		}
		System.out.println("for loop finished");
	}

}
