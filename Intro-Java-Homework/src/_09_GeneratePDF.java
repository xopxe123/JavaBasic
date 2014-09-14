import java.io.FileOutputStream;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

public class _09_GeneratePDF {

	public static void main(String[] args) {
		
		Document cards = new Document();
		
		try {
			
			PdfWriter.getInstance(cards, new FileOutputStream("Cards.pdf"));
			cards.open();
			
			PdfPTable table = new PdfPTable(4);
			table.setWidthPercentage(100F);
			table.getDefaultCell().setFixedHeight(100F);
			
			BaseFont font = BaseFont.createFont("arial.ttf", "Identity-H", true);
			Font black = new Font(font, 50F, 0, BaseColor.BLACK);
			Font red = new Font(font, 50F, 0, BaseColor.RED);
			
			String card = "";
			String face = "";
			char suite = ' ';
			
			for (int i = 2; i <= 14; i++) {
				switch (i) {
				
				case 10: face = i + ""; break;
				case 11: face = "J "; break;
				case 12: face = "Q "; break;
				case 13: face = "K "; break;
				case 14: face = "A "; break;
				default: face = i + " "; break;
				
				}
				
				for (int j = 1; j <= 4; j++) {
					switch (j) {
					
					case 1: suite = '\u2663'; break;
					case 2: suite = '\u2666'; break;
					case 3: suite = '\u2665'; break;
					case 4: suite = '\u2660'; break;
					
					}
					
					card = face + suite;
					
					if (j == 1 || j == 4) {
						
						table.addCell(new Paragraph(card, black));
					} else if (j == 2 || j == 3) {
						
						table.addCell(new Paragraph(card, red));
					}
				}
			}
			
			cards.add(table);
			cards.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
