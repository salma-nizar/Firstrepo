package InheritanceAss;

import java.util.Scanner;

public class Employee {

	double basicpay;
	double deduction;
	double  bonus;
	
	
Scanner scn = new Scanner(System.in);
public void getdetails()
{
System.out.println("Enter basic pay: ");
basicpay = scn.nextDouble();

System.out.println("Enter deduction: ");
deduction = scn.nextDouble();

System.out.println("Enter bonus: ");
bonus = scn.nextDouble();


}

}
