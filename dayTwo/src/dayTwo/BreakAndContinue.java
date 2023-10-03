package dayTwo;

public class BreakAndContinue {

	public static void main(String[] args) {
		for (int i = 0; i<=10; i++) {
			if(i==9) 
				//System.out.println("skip 9");
				continue;
			
			System.out.println(i);
			System.out.println("Java is great");
			
			//break;
		}

	}

}
