package classPractice;

@FunctionalInterface
interface MathOperation{
		int operate(int a, int b);
}


public class Day3_Lambda_with_FuncInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperation add = (a,b) -> a+b;
		MathOperation sub = (a,b) -> a-b;
		MathOperation mul = (a,b) -> a*b;
		MathOperation div = (a,b) -> a/b;
		
		System.out.println("Addition: "+ add.operate(10,12));
		System.out.println("Substraction: "+ sub.operate(10,12));
		System.out.println("Multiplication: "+ mul.operate(10,2));
		System.out.println("Division: "+ div.operate(16,4));
	}

}
