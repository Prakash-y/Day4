package Day4;

public class FinalExample {

	public static void main(String[] args) {
		
		final int num = 10;
		
		int a =6;
		int b =0;
	
		try
		{
			int res = a/b;
			System.out.println(res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by zero!");
		}
		finally
		{
			System.out.println("Finally block executed");
		}
		
		//Finalize method
		FinalExample Fx = new FinalExample(); 
		Fx = null;
		System.gc();
	}
	@Override
	public void finalize() throws Throwable
	{
		System.out.println("Finalize method called ");
	}
}
