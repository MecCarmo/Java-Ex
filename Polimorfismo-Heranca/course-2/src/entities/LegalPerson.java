package entities;

public class LegalPerson extends TaxPayer{

	private Integer numberOfEmployees;
	private Double taxesPaid = 0.0;
	
	public LegalPerson() {
		super();
	}
	
	public LegalPerson(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		if(numberOfEmployees > 10) {
			taxesPaid =  anualIncome * 0.14;
		}
		return taxesPaid;
	}

	public String toString() {
		return name + ": $"
				+ tax();
	}
	
}
