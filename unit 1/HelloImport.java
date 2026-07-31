import java.lang.*;
import java.util.Scanner;
class HelloImport
{
	public static void main(String args[])
	{
		int no1;

		System.out.println("Entered no: ");
		Scanner sc = new Scanner(System.in);

		no1 = sc.nextInt();
		System.out.println("Entered no: " + no1);
	}
}