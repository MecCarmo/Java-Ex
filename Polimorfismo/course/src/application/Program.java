package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Product #" + (i+1) + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if(type == 'i') {
				System.out.print("Custom fee: ");
				double customsFee = sc.nextDouble();
				Product product = new ImportedProduct(name, price, customsFee);
				list.add(product);
			}
			else if(type == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				Product product = new UsedProduct(name, price, manufactureDate);
				list.add(product);
			}
			else {
				Product product = new Product(name, price);
				list.add(product);
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for(Product product : list) {
			System.out.println(product.priceTag());
			
			sc.close();
		}
	}

}
