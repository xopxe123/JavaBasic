import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class _07_DaysBetweenTwaDates {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		String[] firstDate = input.nextLine().split("-");
		String[] secondDate = input.nextLine().split("-");
		
		LocalDateTime first = LocalDateTime.of(Integer.parseInt(firstDate[2]),
						                	   Integer.parseInt(firstDate[1]),
							                   Integer.parseInt(firstDate[0]),
							                   00, 00);
		
		LocalDateTime second = LocalDateTime.of(Integer.parseInt(secondDate[2]),
         	                                    Integer.parseInt(secondDate[1]),
                                                Integer.parseInt(secondDate[0]),
                                                00, 00);
		
		Duration days = Duration.between(first, second);
		
		System.out.println(days.toDays());
	}
}
