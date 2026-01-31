package Superkeyword;

public class ChildVar extends ParentVar {
String color="red";

public void display() {
	System.out.println(color);
	System.out.println(super.color);
	super.stud();
	
	this.studnt();
}
 public void studnt() {
	 System.out.println("student grade");
	 super.student();
 }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChildVar c1=new ChildVar();

c1.display();

	}

}
