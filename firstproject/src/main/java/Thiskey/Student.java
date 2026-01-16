package Thiskey;

 
public class Student {
	String name;
	 int mark;
public void stud(String name,int mark) {
	this.name=name;
	this.mark=mark;
	
}
public void display()
{
	System.out.println("Student name :" +name);
	System.out.println("Student mark: " +mark);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Student t1=new Student();
 t1.stud("Salma",90);
 t1.display();
 
	}

}
