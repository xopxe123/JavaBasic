import java.io.*;

public class _08_SumNumbersFromTextFile {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader;
		
		double sum = 0;
		
		try {
			reader = new BufferedReader(new FileReader("input_08.txt"));
			String emptyFile = null;
			
			while ((emptyFile = reader.readLine()) != null) {
				
				sum += Integer.parseInt(emptyFile);
			}
			reader.close();
			System.out.println(sum);
			
		} catch (FileNotFoundException notFound) {
			System.out.println("Error");
		}
	}
}