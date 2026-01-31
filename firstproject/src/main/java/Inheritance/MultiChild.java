package Inheritance;


public class MultiChild extends MultiIntermediate {
public void mul(int r,int j)
{
	int  mult=r*j;
	System.out.println(mult);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MultiChild c1=new MultiChild();
c1.mul(5, 7);
c1.sum(7,2);
c1.sub(6, 4);
	}

}
