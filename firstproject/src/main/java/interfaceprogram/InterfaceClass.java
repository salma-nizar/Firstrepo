package interfaceprogram;

public class InterfaceClass implements InterfaceParent,InterfaceParent2{

	public static void main(String[] args) {
		
		InterfaceClass p=new InterfaceClass();
        p.display();
        p.example();
        InterfaceParent.example1();
        System.out.println(num);
        p.display2();
	}

	@Override
	public void display() {
		System.out.println("interface example")	;	
	}

	@Override
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("multiple inheritance");
	}

}
