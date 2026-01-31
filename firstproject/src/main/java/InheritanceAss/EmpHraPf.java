package InheritanceAss;

public class EmpHraPf extends Employee {
 double hra;
 double pf;
 
public void Calc()
{
	hra=basicpay*0.05;	
	pf=basicpay*0.20;
}
}
