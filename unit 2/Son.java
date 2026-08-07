class Father
{
	void house()
	{
		System.out.println("Fathers House");
	}

}
class Son extends Father
{
	void bike()
	{
		System.out.println("This is my bike");
	}
		public static void main(String args[])
		{
			Son b = new Son();
			b.house();
			b.bike();
		}
}