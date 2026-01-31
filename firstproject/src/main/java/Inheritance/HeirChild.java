package Inheritance;

public class HeirChild extends HeirParent {

	public void div(int f,int g) {
		int divt=f/g;
		System.out.println(divt);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HeirChild c1=new HeirChild();
c1.div(8, 3);
c1.sum(6, 2);
	}

}
