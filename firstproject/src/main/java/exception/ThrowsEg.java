package exception;

public class ThrowsEg {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
int age=15;
if(age>18)
{
	System.out.println("Eligible");
}else
{
	throw new  Exception("Not eligible");
	//System.out.println
}
	}

}
