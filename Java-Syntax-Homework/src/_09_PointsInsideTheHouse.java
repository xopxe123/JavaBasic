import java.util.Locale;
import java.util.Scanner;


public class _09_PointsInsideTheHouse {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.ROOT);
		@SuppressWarnings("resource")
		
		Scanner input = new Scanner(System.in);
		
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double line1 = (22.5f - 12.5f) * (y - 8.5f) - (8.5f - 8.5f) * (x - 12.5f);
		double line2 = (17.5f - 12.5f) * (y - 8.5f) - (3.5f - 8.5f) * (x - 12.5f);
		double line3 = (22.5f - 17.5f) * (y - 3.5f) - (8.5f - 3.5f) * (x - 17.5f);
		
		if ((line1 <= 0 && line2 >= 0 && line3 >= 0) ||
			(line1 >= 0 && y <= 13.5 && x >= 12.5 && x <= 17.5) ||
			(line1 >= 0 && y <= 13.5 && x >= 20 && x <= 22.5)) {
			
			System.out.println("Inside");
		} else {
			
			System.out.println("Outside");
		}
		
	}
}
