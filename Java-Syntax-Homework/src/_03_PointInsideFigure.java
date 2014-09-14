import java.util.Locale;
import java.util.Scanner;


public class _03_PointInsideFigure {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ROOT);
		
		@SuppressWarnings("resource")
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter point coordinates: ");
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		double xMin1 = 12.5;
		double xMax1 = 17.5;
		double xMin2 = 20;
		double xMax2 = 22.5;
		double yMin1 = 8.5;
		double yMax1 = 13.5;
		double yMin2 = 6;
		double yMax2 = 8.5;
		
		if (x1 >= xMin1 && x1 <= xMax1 && y1 >= yMin1 && y1 <= yMax1) {
			
			System.out.println("Inside");
			
		} else if (x1 >= xMin2 && x1 <= xMax2 && y1 >= yMin1 && y1 <= yMax1) {
			
			System.out.println("Inside");
			
		} else if (x1 >= xMin1 && x1 <= xMax2 && y1 >= yMin2 && y1 <= yMax2) {
			
			System.out.println("Inside");
			
		} else {
			
			System.out.println("Outside");
		}
	}
}
