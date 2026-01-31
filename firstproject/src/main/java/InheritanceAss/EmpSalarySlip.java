package InheritanceAss;

public class EmpSalarySlip extends EmpTotal{
	public void salarySlip()
	{

	System.out.println("Basicpay : "+basicpay);
	System.out.println("Deduction : "+deduction);
	System.out.println("hra : "+hra);
	System.out.println("pf : "+pf);
	System.out.println("Bonus : "+bonus);
	System.out.println("TotalSalary : "+totalSalary);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
EmpSalarySlip  e1=new EmpSalarySlip();
e1.getdetails();
e1.Calc();
e1.total();
e1.salarySlip();
		
	}

}
