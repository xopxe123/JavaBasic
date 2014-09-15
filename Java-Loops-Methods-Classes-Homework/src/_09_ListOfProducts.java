import java.io.*;
import java.util.*;


public class _09_ListOfProducts {

	public static void main(String[] args) {
		
		ArrayList<Product> products = new ArrayList<Product>();
		BufferedReader reader;
		Writer writer = null;
		
		try {
			reader = new BufferedReader(new FileReader("input_09.txt"));
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				String[] split = line.split(" ");
				
				products.add(new Product(split[0], Double.parseDouble(split[1])));
             }
			
             Collections.sort(products);
			
			writer = new BufferedWriter(new FileWriter("output_09.txt"));
			for (Product product : products) {
				writer.write(product.getPrice() + " " + product.getName() + "\r\n");
			}
			writer.close();
			
			
		} catch (Exception e) { 
			e.printStackTrace();
		}

}

static class Product implements Comparable<Product> {
	private String name;
	private double price;
	
	public Product(String name, double price) {
		this.name = name;
        this.price = price;
	}

	public String getName() {
		return name;
	}
	
	
	public double getPrice() {
		return price;
	}
	
	
	public int compareTo(Product compare) {
		
		double otherPrice = ((Product) compare).getPrice();
		
		if (this.price > otherPrice) {
			return 1;
		} else if (this.price == otherPrice) {
			return 0;
		} else {
			return -1;
		}
	}
	}
}