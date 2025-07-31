package classPractice.javaWrapperClass;

//Task1: Convert Primitive to Wrapper and Vice Versa 

import java.util.Scanner;

public class Task1_Convert_Pri_to_Wrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int i = sc.nextInt();

        System.out.print("Enter a double: ");
        double d = sc.nextDouble();

        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
        
        System.out.println("\nOriginal data....");
        System.out.println("Original Int: "+i);
		System.out.println("Original double: "+d);
		System.out.println("Original char: "+c);

        // Convert primitives to wrappers using valueOf()
        Integer intWrapper = Integer.valueOf(i);
        Double doubleWrapper = Double.valueOf(d);
        Character charWrapper = Character.valueOf(c);
        
        
        System.out.println("\nAfter Conversion in Wrapper...");
        System.out.println("Wrapper Integer: "+intWrapper);
		System.out.println("Wrapper Double: "+doubleWrapper);
		System.out.println("Wrapper Character: "+charWrapper);

        // Convert wrappers back to primitives using xxxValue()
        int i2 = intWrapper.intValue();
        double d2 = doubleWrapper.doubleValue();
        char c2 = charWrapper.charValue();
        
        System.out.println("\nAfter Conversion back to Original...");
        System.out.println("Back to int: "+i2);
		System.out.println("Back to double: "+d2);
		System.out.println("Back to char: "+c2);

        sc.close();
    }
}

