package polymorphismAss;


public class Offseason extends Onseason{

	@Override
	public void discount(double totalAmount) {
		
		double discountAmount=totalAmount*15/100;
		System.out.println("Discount amount in Offseason(15%) : "+discountAmount );
	    super.discount(2300);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Offseason clothes=new Offseason();
		clothes.discount(2500);
		
	}

}
