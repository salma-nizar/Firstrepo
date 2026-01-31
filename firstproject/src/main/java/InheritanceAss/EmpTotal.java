package InheritanceAss;

public class EmpTotal extends EmpHraPf{
 double totalSalary;
	public void total()
	{
		totalSalary=basicpay+hra-pf-deduction+bonus;
		
	}
}
 