package InheritanceAss;

public class Addch extends AdditionP{
	
public void display() {

int res=super.add(6,2);
System.out.println("The result is : "+res);
if(res % 10==0) {
	System.out.println(res + " "+"divisble by 10");
}else {
		System.out.println(res +" " +" is not divisble by 10");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Addch a=new Addch();
a.display();
	}

}
