package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Product;
import entities.Order;
import entities.OrderItem;
import entities.enums.OrderStatus;


public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		
		String name, email;
		Date birthDate;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Email: ");
		email = sc.next();
		System.out.print("Birth Date (DD/MM/YYYY): ");
		birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);

		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many items to this order?");
		int n = sc.nextInt();
		for(int i = 1; i < n; i++) {
			System.out.printf("Enter #%d item data: ",i);
			System.out.print("\nProduct name: ");
			sc.nextLine(); 
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			
			System.out.print("Quantity: ");
			int productQtd = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			
			OrderItem orderItem = new OrderItem(productQtd, productPrice, product); 

			order.addItem(orderItem);
			
		}
		
		
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		sc.close();
	}

}
