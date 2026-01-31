package Inheritance;

public class HeirChild2 extends HeirParent {
	public void mul(int h,int e) {
		int mult=h*e;
		System.out.println(mult);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HeirChild2 t1=new HeirChild2();
t1.mul(6, 8);
t1.sum(5, 7);
	}

}
