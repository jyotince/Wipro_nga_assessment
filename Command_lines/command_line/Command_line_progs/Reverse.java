import java.util.Scanner;
public class Reverse
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.next();
		
		System.out.println("Reverse : "+ (s.reverse()));

	}
}