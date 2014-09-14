import java.util.Arrays;
import java.util.Scanner;


public class _08_SortArrayOfStrings {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String output[] = new String[n];
		
		for (int i = 0; i < n; i++) {
			output[i] = input.next();
		}
		
		Arrays.sort(output);
		
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}
