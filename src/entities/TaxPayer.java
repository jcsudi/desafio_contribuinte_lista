package entities;

public class TaxPayer {
	private Double salaryIncome;
	private Double servicesIncome;
	private Double capitalIncome;
	private Double healthSpendding;
	private Double educationSpending;
	
	public TaxPayer(Double salaryIncome, Double servicesIncome, Double capitalIncome, Double healthSpendding,
	   Double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpendding = healthSpendding;
		this.educationSpending = educationSpending;
	}

	public Double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(Double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public Double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(Double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public Double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(Double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public Double getHealthSpendding() {
		return healthSpendding;
	}

	public void setHealthSpendding(Double healthSpendding) {
		this.healthSpendding = healthSpendding;
	}

	public Double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(Double educationSpending) {
		this.educationSpending = educationSpending;
	}
	
	public double salaryTax() {
		double parcela = salaryIncome / 12;
		if(parcela < 3000) {
			return 0;
		}
		else if(parcela < 5000) {
			return salaryIncome  * 0.1;
		}
		else {
			return salaryIncome * 0.2;
		}	
	}
	
	public double servicesTax() {
		return servicesIncome * 0.15;
			
	}
	
	public double capitalTax() {
		return  capitalIncome * 0.20;
	}
	
	public double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
		
	}
	
	public double taxRebate() {
		if(grossTax()  <  healthSpendding + educationSpending) {
			return grossTax() * 0.30;
		}else {
			return healthSpendding + educationSpending;
			}		
	}
	
	public double netTax() {
		return grossTax() - taxRebate();
		
	}
	

}
