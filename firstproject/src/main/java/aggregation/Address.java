package aggregation;

public class Address 
{
	String address;
	Student ref;
public Address(String address,Student ref) {
	this.address=address;
	this.ref=ref;
}
public void display() {
	
	System.out.println("Adress: "+address+ " "+"Name :"+ ref.name+" " +"Roll no:" +ref.rollno);

	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student	s=new Student("salma",47)	;
Address a=new Address("house no-236 ", s);
a.display();
	}

}
