package classPractice;

import java.util.Scanner;

public class Do_while {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("Enter your number:");
			num = sc.nextInt();
			System.out.println(num);
		}while(num > 0);
		
		sc.close();
		
	}
}
