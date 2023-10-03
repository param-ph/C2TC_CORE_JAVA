package dayTwo;
import java.util.Scanner;
public class loop1 {

	public static void main(String[] args) {
		int i = 0;
		while( i <= 10){
			System.out.println(i);
			i++;
		}
		System.out.println("finished while loop");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = sc.nextInt();
		int j = 0;
		do {
			System.out.println(j);
			j++;
		}while(j<=n);
		sc.close();
		System.out.println("Do while loop finished");
	}

}
