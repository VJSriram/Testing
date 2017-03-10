package CoreJava;
// one try can be followed by mutliple catch blocks
// catch block should always follow by try block
public class exceptiondemo {
	
	//int a=4;
	// Using try catch mechanism we can avoid exceptions
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b=7;
		int c=0;
		
		try
		{
			int k=b/c;
			
			//int arr[] = new int[5];
			
			//System.out.println(arr[7]);
		}
		catch (IndexOutOfBoundsException ets)
		{
			System.out.println("I catched index out of bound exception");
		}
		
		catch (ArithmeticException et)
		{
			System.out.println("I catched arithmetic exception");
		}
		
		catch (Exception e)
		{
			// retry again
			System.out.println("I catched the error/exception");
		}
		finally
		{
			System.out.println("delete cookies"); // This block is executed irrespective of exception thrown or not
		}

	}

}
