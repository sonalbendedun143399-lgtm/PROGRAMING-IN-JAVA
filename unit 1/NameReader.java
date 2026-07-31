import java.lang.*;
import java.util.Scanner;
class NameReader
{
	public static void main(String args[])
	{
		Scanner scanner= new Scanner(System.in);

		System.out.print("Enter your full name: ");
		String fullName= scanner.nextLine();

		System.out.println("Welcome to the java class, " + fullName +"!");
	}
}