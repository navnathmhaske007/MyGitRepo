import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExceptionHandlingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* types of exception handling
 		1- by using try catch block
 		2- by using throws keyword
		
		
//=========================== BY USING TRY-CATCH BLOCK ===============================
/*
// Example no 1 - abnormal termination of program
		
		System.out.println("durga");
		System.out.println("software");
		System.out.println(10/0);
		System.out.println("solutions");
		
		
//=====================================================================================
  
 
 
 
// Example no 2 - handling exception by using try catch
		
		System.out.println("durga");
		System.out.println("solutions");
		try{
			System.out.println(10/0);
		}
	
	catch(ArithmeticException ae)
		{
		System.out.println("you are getting ae : "+ae);
		}
		
		System.out.println("slutions");
	

//=====================================================================================
		
		

// Example no 3 - Array index out of bound example
		
		System.out.println("program starts");
		
		try{
			int [] a = {10,20,30};
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);
			}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("you are getting AIOOBE :"+ ai);
		}
		System.out.println("rest of the code ");

		
//====================================================================================
		
// Example No 4 - if corresponding catch block is  not matching with exception
		
System.out.println("program starts");
		
		try{
			int [] a = {10,20,30};
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);
			}
		catch(ArithmeticException ae)
		{
			System.out.println("you are getting AIOOBE :"+ ae);
		}
		
		System.out.println("rest of the code ");
		
//====================================================================================
 

 

// Example No 5 - if no exception try block then catch block is not executing
		
		System.out.println("program starts");
				
				try{
					System.out.println("ratan sir");
					System.out.println("how are you");
					}
				catch(ArithmeticException ae)
				{
					System.out.println("you are getting AE :"+ ae);
				}
				
				System.out.println("rest of the code ");
				
//=====================================================================================
				
// Example No 6 - independent try block is not allowed in java it gives error
				
				System.out.println("program starts");
						
						try{
							int [] a = {10,20,30};
							System.out.println(a[0]);
							System.out.println(a[1]);
							System.out.println(a[2]);
							System.out.println(a[3]);
							}
						
						System.out.println("rest of the code ");
						
//======================================================================================


		
// Example No 7 - in between try and catch block independent statements are not allowed
		
		System.out.println("program starts");
				
				try{
					int [] a = {10,20,30};
					System.out.println(a[0]);
					System.out.println(a[1]);
					System.out.println(a[2]);
					System.out.println(a[3]);
					}
				
				System.out.println("in between try and catch ");
				catch(ArithmeticException ae)
				{
					System.out.println("you are getting AIOOBE :"+ ae);
				}
				
				System.out.println("rest of the code ");
				
	
//=====================================================================================

	

// Example No 8 - once the control is out of the try block then it never entered into try block
								
		System.out.println("program starts");
									
		try	{
				System.out.println("durgasoft");
				int  a=10/0;
				System.out.println("hi ");// these two lines are never get executed
				System.out.println("how are you");// these two lines are never get executed
			}
		catch (ArithmeticException ae)
		{
			int  a=10/5;
			System.out.println(a);
		}
										
		System.out.println("rest of the code ");
										

//======================================================================================

		
// Example No 9 - multiple catch blocks with  single try block
		
		System.out.println("proogram starts");
		Scanner s = new Scanner(System.in);
		System.out.println("provide the division value");
		int n = s.nextInt();
		try
		{
			System.out.println(10/n);
			String str =null;
			System.out.println(" ur name is :"+str);
			System.out.println("ur name length is --->"+str.length());
			
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("zero is not allowed to enter"+ae);
		}
		
		catch (NullPointerException ne)
		{
			System.out.println("string is null"+ne);
		}
		
		System.out.println("rest of the code");

	
//======================================================================================


		
// Example No 10 - using root class exception we can hold any type of exceptions
		
		Scanner s = new Scanner(System.in);
		System.out.println("proovide the division rule");
		int n = s.nextInt();
		try
		{
			System.out.println(10/0);
			String str = null;
			System.out.println("ur name is"+str);
			System.out.println("ur name length is -->"+str.length());
		}
		catch (Exception e)
		{
			System.out.println("getting exception"+e);
		}
		
		System.out.println("rest of the code");

		
//======================================================================================


		
// Example No 11 - for multiple catch blocks order should be child to parent if we give parent to child it will rise compile error

		
		Scanner s = new Scanner(System.in);
		System.out.println("proovide the division rule");
		int n = s.nextInt();
		try
		{
			System.out.println(10/0);
			String str = null;
			System.out.println("ur name is"+str);
			System.out.println("ur name length is -->"+str.length());
		}
		
		catch (ArithmeticException ae)
		{
			System.out.println("arithmetic exceptionn :"+ae);
		}
		catch (Exception e)
		{
			System.out.println("getting exception"+e);
		}
		
		System.out.println("rest of the code");


//======================================================================================


		
// Example No 12 - exception in catch block it is always abnormal termination
		
		System.out.println("program starts");
		try{
			
			int a=10/0;
			
		}
		catch (ArithmeticException ae)
		{
			int a =10/0;
			System.out.println(a);
		}
		System.out.println("rest of the code is available");

		
//======================================================================================

	
		
		
// Example No 12 - multiple times try catch block
		
		 String st=null;
		
		try{
			
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("arithmetic exception "+ae);
		}
		
		try {
			System.out.println(st.length());
			
		}
		catch (NullPointerException ne)
		{
			System.out.println("we are getting null pointer "+ne);
		}
		
		System.out.println("if we provide the try-catch");
		System.out.println("the rest of the code is provided");
		
		
		
//=====================================================================================
		

		
		
// Example No 13 - nested try catch 		
		
		try
		{
			try {
				System.out.println("first try block");
				int a=10/0;
				System.out.println(a);
				}
			catch(ArithmeticException ae)
			{
				System.out.println("first catch block "+ae);
			}
			try{
				System.out.println("second try block");
				int [] a = {10,20,30};
				System.out.println(a[5]);
			}
			catch(ArrayIndexOutOfBoundsException aiobe)
			{
				System.out.println("second catch block"+aiobe);
			}
		}
		catch(Exception e)
		{
			System.out.println("main catch "+e);
		}
		
		System.out.println("normal flow of execution");
		
		
		
//=====================================================================================



		
		
// Example No 14 - catch with try-catch
		
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			try 
			{
				System.out.println("hi ratan");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}

//=====================================================================================
		

		
		
// Example No 15 -  try-catch with finally block
		
		try {
			
			System.out.println("durga");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("u r getting :"+ae );
		}
		
		finally
		{
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code");
		
//=====================================================================================




		
		
// Example No 16 -  if catch unble too catch the exception then also finally block is get executed


try {
			
			System.out.println("durga");
			System.out.println(10/0);
		}
		catch(NullPointerException ae)
		{
			System.out.println("u r getting :"+ae );
		}
		
		finally
		{
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code");
		


		

// Example No 17 -  when finally block is not executed

		try {
			
			System.out.println("durga");
		//	System.exit(0);
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("u r getting :"+ae );
			System.exit(0);
		}
		
		finally
		{
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code");

		
		

//=====================================================================================


		
		
//=========================== BY USING THROW KEYWORD====================================

// Example No 18 -  Using throw keyword basic example - main method is not responsible for creation of exception oobjet

		{
			throw new ArithmeticException("we are getting exception");
		}
		

		

//=====================================================================================

		
		

		
// Example No 19 -  throw keyword
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your age");
		int n = sc.nextInt();
		validate(n);
		System.out.println("rest of the code");

	}

	public static void validate(int age) {
		// TODO Auto-generated method stub
	if(age<18)
	{
		throw new ArithmeticException("not eigible for vote");
	}
	else{
		System.out.println("welcome to the voting");
	}

	

	
//=====================================================================================

	
	
	
	
	

	
// Example No 20 -  by using throws keyword
		
		
		public static void main(String[] args) throws IOException {
			
		
		ExceptionHandlingClass ehc = new ExceptionHandlingClass();
		ehc.studentDetails();

	}

	private void studentDetails() throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("please enter your name");
		String sname = br.readLine();
		System.out.println("ur name is"+sname);
	
		}
		
		
//=======================================================================================

	*/	

		
// Example No 21 -  by using throws keyword

		
		

		ExceptionHandlingClass ehc = new ExceptionHandlingClass();
		try {
			ehc.studentDetails();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("this is my handling code");
		}

	}

	private void studentDetails() throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("please enter your name");
		String sname = br.readLine();
		System.out.println("ur name is "+sname);

	}
	
	
//=======================================================================================

	
	
		

//	}

	

}
