
public class ArithmeticExcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try{
			
			int a = 10/2;
			System.out.println(a);
			
			int b = 10/0;
			System.out.println(b);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("boss u r getting arithmetic exception "+ae.getMessage());
		//	ae.getStackTrace();
		}

	}

}
