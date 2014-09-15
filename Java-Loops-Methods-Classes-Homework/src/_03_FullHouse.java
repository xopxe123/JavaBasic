
public class _03_FullHouse {

	public static void main(String[] args) {
		
		int counter = 0;
		
		for (int i = 2; i <= 14; i++) {
			for (int j = 2; j <= 14; j++) {
				for (int k = 1; k <= 4; k++) {
					for (int l = k + 1; l <= 4; l++) {
						for (int m = l + 1; m <= 4; m++) {
							for (int n = 1; n <= 4; n++) {
								for (int p = n + 1; p <= 4; p++) {
								
									if (i != j) {
										
										System.out.println(getCardFace(i) + getCardSuite(k) + " " +
														   getCardFace(i) + getCardSuite(l) + " " +
														   getCardFace(i) + getCardSuite(m) + " " +
														   getCardFace(j) + getCardSuite(n) + " " +
														   getCardFace(j) + getCardSuite(p));
										counter++;
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(counter + " full houses");
	}

	private static char getCardSuite(int j) {
		char suite = ' ';
		switch (j) {
		
		case 1: suite = '♣'; break;
		case 2: suite = '♦'; break;
		case 3: suite = '♥'; break;
		case 4: suite = '♠'; break;
		}
		return suite;
	}

	private static String getCardFace(int i) {
		String face = "";
		switch (i) {
		case 2: face = "2"; break;
		case 3: face = "3"; break;
		case 4: face = "4"; break;
		case 5: face = "5"; break;
		case 6: face = "6"; break;
		case 7: face = "7"; break;
		case 8: face = "8"; break;
		case 9: face = "9"; break;
		case 10: face = "10"; break;
		case 11: face = "J"; break;
		case 12: face = "Q"; break;
		case 13: face = "K"; break;
		case 14: face = "A"; break;
		}
		return face;
	}
}
