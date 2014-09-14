import java.util.Locale;
import java.util.Scanner;


public class _06_FormattingNumbers {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ROOT);
		
		@SuppressWarnings("resource")
		
		Scanner input = new Scanner(System.in);

		int num1 = input.nextInt();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		String hexNum1 = Integer.toHexString(num1).toUpperCase();
		String binNum1 = Integer.toBinaryString(num1);
		String paddedBinNum1 = String.format("%10s", binNum1).replace(' ', '0');
		
		System.out.printf("|" + "%-10s" + "|" + paddedBinNum1 + "|" +
						  "%10.2f" + "|" + "%-10.3f" + "|", hexNum1, num2, num3);
		
	}			
}
