import java.util.Locale;
import java.util.Scanner;


public class _04_TheSmallestOfThreeNumbers {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.ROOT);
		
		@SuppressWarnings("resource")
		
		Scanner input = new Scanner(System.in);
		
		double max = Double.MAX_VALUE;
		double a = Double.MAX_VALUE;
		
		for (int i = 0; i < 3; i++) {
			
			System.out.print("Please enter number: ");
			a = input.nextDouble();
			
			if (a < max) {
				
				max = a;
			} 
		}
		
		System.out.println(a);
	}
}
