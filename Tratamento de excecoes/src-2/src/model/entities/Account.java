package model.entities;

import model.exceptions.AccountException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void deposit(double amount) {
		
	}
	
	public void withdraw(double amount) {
		if(amount > balance) {
			throw new AccountException("Not enough balance");
		}
		if(amount > withdrawLimit) {
			throw new AccountException("The amount exceeds withdraw limit");
		}
		else {
			balance -= amount;
			System.out.println("Updated balance: " + balance);
		}
	}
	
	
	
}
