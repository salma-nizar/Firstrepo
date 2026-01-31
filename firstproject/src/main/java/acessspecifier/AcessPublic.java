package acessspecifier;

public class AcessPublic{
	public void display() {
		System.out.println("public method..");
	}
	private void stud() {
		System.out.println("private method..");
	}
		void studnt()
		{
			System.out.println("default method");
		}
	protected void grade()
	{
		System.out.println("protected method");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AcessPublic a=new AcessPublic();
a.display();
a.stud();
a.studnt();
a.grade();
	}

}
