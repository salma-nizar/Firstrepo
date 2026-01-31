package exception;

public class ExceptionExample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		try{
			int c=a/0;
		}
		//(Exception e){
		//	System.out.println("Exception handled");
		//}
		finally {
			System.out.println("finally block");
		}
		System.out.println("display");		
		//System.out.println(c);
		//int []arr= {20,10,30};
		//System.out.println(arr[3]);
		//String s=null;
	//System.out.println(s.length());
		}

}
