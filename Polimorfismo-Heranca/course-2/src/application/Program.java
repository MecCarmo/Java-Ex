package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.LegalPerson;
import entities.NaturalPerson;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		double totalTax = 0.0;
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Tax payer #" + (i+1) + " data: ");
			System.out.print("Individual or company (i/c)?");
			char taxType = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if(taxType == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpend = sc.nextDouble();
				TaxPayer taxPayer = new NaturalPerson(name, anualIncome, healthExpend);
				list.add(taxPayer);
			}else if(taxType == 'c'){
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				TaxPayer taxPayer = new LegalPerson(name, anualIncome, numberOfEmployees);
				list.add(taxPayer);
			}
			
			
		}
		System.out.println();
		System.out.println("TAXES PAID: ");
		for(TaxPayer taxP : list) {
			System.out.println(taxP);
			totalTax += taxP.tax();
		}
		System.out.println();
		System.out.print("TOTAL TAXES: $ " + totalTax);
		
		sc.close();
	}

}
