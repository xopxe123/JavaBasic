import java.util.Scanner;


public class _01_SymmetricNumbersInrange {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int start = input.nextInt();	
		int end = input.nextInt();	
		
		for (int i = start; i <= end; i++) {
			
			if (i <= 9) {
				System.out.print(i + " ");
			}
			
			if (i > 9 && i <= 99) {
				int lastNum = i % 10;
				int firstNum = i / 10;
				
				if (lastNum == firstNum) {
					System.out.print(i + " ");
				}
			}
			
			if (i > 99) {
				int lastNum = i % 10;
				int firstNum = i / 100;
				
				if (lastNum == firstNum) {
					System.out.print(i + " ");
				}
			}
		}
	}
}
