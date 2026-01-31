package abstractionAss;

public class Contractor extends Employee{
    int workinghours;
    double ContractorSalary;
	public Contractor(double payment,int workinghours) {
		super(payment);
		this.workinghours=workinghours;
		
	}

	
	@Override
	public void calculateSalary() {
		ContractorSalary=payment*workinghours;
		System.out.println(ContractorSalary);
		
	}

	

}
