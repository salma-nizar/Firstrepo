package Superkeyword;

public class ChildConst extends ParentConst {
	public ChildConst()
	{
		super(23);
		System.out.println("child constructor");
		
	}
public ChildConst(int age)
{
	super();
	System.out.println("Age :" +age);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChildConst c1=new ChildConst();
ChildConst c2=new ChildConst(23);
		
	}

}
