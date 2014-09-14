import java.util.Scanner;


public class _07_CountOfBitsOne {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();
		
		int counter = 0;
		
		while (num > 0) {
			
			int bit = num & 1;
			
			if (bit == 1) {
				
				counter++;
			}
			num >>= 1;
		}
		
		System.out.println(counter);
	}

}
