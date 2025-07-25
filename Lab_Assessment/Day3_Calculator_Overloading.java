package classPractice;

class Calculator1 { 
	int add(int a, int b) { 
		return a + b; 
	} 
	double add(double a, double b) { 
		return a + b; 
	} 
	String add(String a, String b) { 
		return a + b; 
	} 
} 


public class Day3_Calculator_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator1 obj = new Calculator1();
		System.out.println("Interger Addition: "+ obj.add(10, 20));
		System.out.println("Double Addition: "+ obj.add(12.2,11.2));
		System.out.println("String Addition: "+ obj.add("Hello","2"));
	}

}
