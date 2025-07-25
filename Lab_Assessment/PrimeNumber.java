package classPractice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Prime Numbers between 1-10 are: ");
		for(int i = 1; i<=10; i++)
		{
			int c = 0;
			for(int j=1; j<=i; j++)
			{
				if(i%j == 0)
				{
					c++;
				}
			}
			
			if(c == 2)
			{
				System.out.print(i+ " ");
			}
		}
		sc.close();
	}
}
