import java.util.Scanner;


public class _06_SumTwoNumbers {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter first number: ");
		int a = input.nextInt();
		System.out.print("Please enter second number: ");
		int b = input.nextInt();
		
		int sum = a + b;
		
		System.out.println("The sum of numbers is: " + sum);
	}
}
