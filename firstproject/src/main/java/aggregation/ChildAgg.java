package aggregation;

public class ChildAgg {
 
	String city;
	int id;
	ParentAgg ref;
	public ChildAgg(String city,int id,ParentAgg ref) {
		this.city=city;
		this.id=id;
		this.ref=ref;
	}
	public void display()
	{
		
		System.out.println("City  name : "+city );
		System.out.println("Id is  : "+id );
		System.out.println("Name: "+ref.name + " ,"+ "Age :" +ref.age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ParentAgg p=new ParentAgg("Salma",23);		
   ChildAgg c=new ChildAgg("kollam",02,p);
   c.display();
	}

}
