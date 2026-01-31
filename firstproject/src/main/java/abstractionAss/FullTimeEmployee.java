package abstractionAss;

public class FullTimeEmployee extends Employee{
double FulltimeSalary;
	public FullTimeEmployee(double payment) {
		super(payment);
		
	}

	
	@Override
	public void calculateSalary() {
		
		FulltimeSalary=payment*8;
		System.out.println(FulltimeSalary);
	}
	public static void main(String[] args) {
	Employee Contractor=new Contractor(700.0,6);	 
	Employee FullTime=new FullTimeEmployee(600)	;
		Contractor.calculateSalary();
		FullTime.calculateSalary();
	}
}
