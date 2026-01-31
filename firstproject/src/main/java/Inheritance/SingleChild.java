package Inheritance;

public class SingleChild extends SingleParent{

	public void mul(int d,int e) {
		int mult=d*e;
		System.out.println(mult);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SingleChild i1=new SingleChild();
i1.sum(5, 6);
i1.mul(3, 4);
System.out.println(i1.division(9, 7));
	}

}
