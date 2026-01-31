package Polymorphism;

public class PolyChild extends PolyParent {
	public void display() {
		System.out.println("child method");
		super.display();
	}

	public int  sum(int a,int b) {
		System.out.println(super.sum(2, 3));
		int c=a+b;
		return c;
		
	}
	
	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		int c=a*b;
		System.out.println(c);
		super.mul(4,6);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PolyChild p=new PolyChild();
p.display();
System.out.println(p.sum(5, 7));
p.mul(4, 3);
	}

}
