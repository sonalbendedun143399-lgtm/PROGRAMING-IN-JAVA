class Father
{
	void house()
	{
	 	System.out.println("father house");
	}
}
class Son extends Father
{
	void bike()
	{
		System.out.println("it's my bike");
	}
}
class Mother extends Son
{
	void car()
	{
		System.out.println("it's mother car");
	}
	public static void main(String args[])
	{
		Mother ob= new Mother();
		ob.bike();
		ob.house();
		ob.car();
	}
}