import java.util.*;



public class _06_RandomHandesOfFiveCards {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		String[] face = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		char[] suite = {'♣', '♦', '♥', '♠'};
		ArrayList<String> cards = new ArrayList<>(52);
		
		for (int i = 0; i < face.length; i++) {
			for (int j = 0; j < suite.length; j++) {
				String currentCard = face[i] + suite[j];
				cards.add(currentCard);
			}
		}
		
		for (int i = 0; i < n; i++) {
			Collections.shuffle(cards);
			
			for (int j = 0; j <= 5; j++) {
				System.out.print(cards.get(j) + " ");
			}
			System.out.println();
		}
	}
}
