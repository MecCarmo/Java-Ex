package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter file path:");
		String filePath = sc.nextLine();
		
		String outPath = "c:\\temp\\summary.csv";
		
		
		List<Product> list = new ArrayList<>();
		
		//File file = new File(filePath);
		//File outFile = new File(outPath);
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
			
			String line = br.readLine();
			
			while(line != null){
				System.out.println(line);
				String[] parts = line.split(";");
				
				line = br.readLine();
				
					
				list.add(new Product(parts[0], Double.parseDouble(parts[1]), Integer.parseInt(parts[2])));
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(outPath))){
				
				for(Product item: list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}
				
			}catch(IOException e) {
				System.out.println("Erro:" + e.getMessage());
			}
			
		}
		catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		
		
		sc.close();
	}

}
