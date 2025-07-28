import java.util.Scanner;
public class Add
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int a = sc.nextInt();
		System.out.println("Enter num2: ");
		int b = sc.nextInt();
		System.out.println("Sum of num1 and num2 is : " + (a+b));

	}
}