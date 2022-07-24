package entities;

public class NaturalPerson extends TaxPayer{
	
	private Double healthExpend;
	double taxesPaid = 0;
	
	public NaturalPerson() {
		super();
	}
	
	public NaturalPerson(String name, Double anualIncome, Double healthExpend) {
		super(name, anualIncome);
		this.healthExpend = healthExpend;
	}

	

	public Double getHealthExpend() {
		return healthExpend;
	}

	public void setHealthExpend(Double healthExpend) {
		this.healthExpend = healthExpend;
	}
	

	@Override
	public double tax() {
		
		if(anualIncome < 20000 && healthExpend == 0) {
			taxesPaid = anualIncome * 0.15;
		}
		else if(anualIncome < 20000 && healthExpend > 0) {
			taxesPaid = (anualIncome * 0.15) - (healthExpend * 0.5);
		}
		else if(anualIncome > 20000 && healthExpend == 0) {
			taxesPaid = anualIncome * 0.25;
		}
		else if(anualIncome > 20000 && healthExpend > 0) {
			taxesPaid = (anualIncome * 0.25) - (healthExpend * 0.5);
		}
		return taxesPaid;
	}

	public String toString() {
		return name + ": $"
				+ tax();
	}
	
	
}
