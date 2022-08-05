package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import model.services.InstallmentService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		double value = sc.nextDouble();
		System.out.print("Enter number of installments: ");
		int installmentNum = sc.nextInt();
		
		
		Contract c1 = new Contract(number, value, date);
		Date iDate = c1.getDate();
		Installment i1 = new Installment(installmentNum, iDate);
		
		InstallmentService installmentParcels = new InstallmentService();
		
		installmentParcels.tax(i1, c1);
		
		sc.close();
		
	}

}
