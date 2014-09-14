import java.util.Scanner;


public class _01_RectangleArea {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter rectangle sides: ");
		int a = input.nextInt();
		int b = input.nextInt();
		
		int area = a * b;
		
		System.out.println("The rectangle area is: " + area);
	}
}
