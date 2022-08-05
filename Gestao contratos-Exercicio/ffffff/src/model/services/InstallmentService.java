package model.services;


import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Contract;
import entities.Installment;

public class InstallmentService {

	public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	@SuppressWarnings("deprecation")
	public void tax(Installment installment, Contract contract) {
		
		
		
		Date date = contract.getDate();
		double contractValue = contract.getValue();
		int installmentNum = installment.getInstallmentNum();
		
		double parcels = contractValue / installmentNum;
		
		for(int i = 0; i < installmentNum; i++) {
			
			double aux = parcels;
			
			aux += aux * 0.01 * (i + 1); //Valor * 1% * parcela ( de 1 a n)
			aux += aux * 0.02; //Adiciona + 2% ao novo valor
			
			date.setDate(date.getDate() + 30);
			
			
			System.out.println(sdf.format(date) + " - " + aux);
		}
		
	}
	
}
