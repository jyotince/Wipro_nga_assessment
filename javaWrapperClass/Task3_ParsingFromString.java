package classPractice.javaWrapperClass;

import java.util.Scanner;

//Task 3: Parsing from Strings

public class Task3_ParsingFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer string: ");
        String intStr = sc.nextLine();

        System.out.print("Enter a double string: ");
        String doubleStr = sc.nextLine();

        System.out.print("Enter a boolean string: ");
        String boolStr = sc.nextLine();

        int parsedInt = Integer.parseInt(intStr);
        double parsedDouble = Double.parseDouble(doubleStr);
        boolean parsedBoolean = Boolean.parseBoolean(boolStr);

        System.out.println("After Parsing String : ");
        System.out.println("Integer value: " + parsedInt + " (Type: int)");
        System.out.println("Double value: " + parsedDouble + " (Type: double)");
        System.out.println("Boolean value: " + parsedBoolean + " (Type: boolean)");

        sc.close();
        
    }
}   
        
