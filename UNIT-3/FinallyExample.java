class FinallyExample 
{
    public static void main(String[] args) 
	{
        	try 
		{
            		int a = 10, b = 0;
            		int c = a / b;
           		System.out.println("Result = " + c);
        	}
        	catch (ArithmeticException e)
		{
            		System.out.println("Exception: Cannot divide by zero");
        	}
        	finally 
		{
           	 System.out.println("Finally block is always executed");
       		 }
    	}
}