import java.util.Scanner;


public class _08_CountOfEqualBitPairs {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();
		
		int counter = 0;
		int bitOne = num & 1;
		num >>= 1;
		
		while (num > 0) {
			
			int bit = num & 1;
			
			if (bitOne == bit) {
				
				counter++;
			}
			
			bitOne = bit;
			num >>= 1;
		}
		
		System.out.println(counter);
	}
}
