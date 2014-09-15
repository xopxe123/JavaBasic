import java.util.Locale;
import java.util.Scanner;


public class _05_AngleUnitConverter {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ROOT);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			double num = input.nextDouble();
			String angle = input.next();
			
			if (angle.equals("deg")) {
				
				System.out.println(degreeToRadians(num) + " rad");
			} else {
				
				System.out.println(radiansToDegree(num) + " deg");
			}
		}
	}

	private static double degreeToRadians(double angle) {
		double radNum = Math.toRadians(angle);
		return radNum;
	}

	private static double radiansToDegree(double angle) {
		double degNum = Math.toDegrees(angle);
		return degNum;
	}
}
