package entities;

import java.util.Date;

public class Installment {

	private Integer installmentNum;
	private Date dueDate;
	
	Contract contract = new Contract();
	
	public Installment(Integer installmentNum, Date date) {

		this.installmentNum = installmentNum;
		this.dueDate = contract.getDate();
	}

	public Integer getInstallmentNum() {
		return installmentNum;
	}

	public void setInstallmentNum(Integer installmentNum) {
		this.installmentNum = installmentNum;
	}

	public Date getDate() {
		return dueDate;
	}

	public void setDate(Date date) {
		this.dueDate = date;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}
	
	
	
}
