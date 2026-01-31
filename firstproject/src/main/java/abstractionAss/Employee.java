package abstractionAss;

public abstract class Employee {
	double payment;

public Employee(double payment) {
    this.payment = payment;
}
public abstract void calculateSalary();
}
