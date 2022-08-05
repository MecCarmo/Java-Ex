package entities;

import java.util.Date;

public class Contract {

	private Integer number;
	private Double value;
	private Date date;
	
	public Contract() {
	}
	
	public Contract(Integer number, Double value, Date date) {
		this.number = number;
		this.value = value;
		this.date = date;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
}
