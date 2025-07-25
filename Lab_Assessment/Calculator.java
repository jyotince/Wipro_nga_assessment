package classPractice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
		
		System.out.println("Enter operator:");
		char op = sc.next().charAt(0);
		
		switch(op)
		{
		case '+' : System.out.println("Sum is "+ (num1+num2));
		break;
		
		case '-' : System.out.println("Subtraction is "+ (num1-num2));
		break;
		
		case '/' : System.out.println("Division is "+ (num1/num2));
		break;
		
		case '%' : System.out.println("Remainder is "+ (num1%num2));
		break;
		
		case '*' : System.out.println("Multiplication is "+ (num1*num2));
		break;
		
		default: System.out.println("Invalid operator");
		}
		
		sc.close();
	}

}
