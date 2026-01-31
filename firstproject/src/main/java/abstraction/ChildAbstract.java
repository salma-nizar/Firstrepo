package abstraction;

public class ChildAbstract extends ParentAbstract{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ParentAbstract p=new ChildAbstract();
p.display();
p.normalMethod("salma");
p.parameterAbstract(23);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("abstract method");
	}

	

	@Override
	public void parameterAbstract(int age) {
		// TODO Auto-generated method stub
		System.out.println("parameter abstract method");
	}

}
