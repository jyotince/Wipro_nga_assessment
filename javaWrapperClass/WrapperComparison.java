package classPractice.javaWrapperClass;

//Task 4: Comparing Wrapper Objects 

public class WrapperComparison {
    public static void main(String[] args) {
        // Autoboxing
        Integer a = 100;
        Integer b = 100;

        // Explicit object creation
        Integer x = new Integer(100);
        Integer y = new Integer(100);

        System.out.println("--- Autoboxed Integers ---");
        System.out.println("a == b: " + (a == b));          
        System.out.println("a.equals(b): " + a.equals(b));  

        System.out.println("\n--- Explicitly Created Integers ---");
        System.out.println("x == y: " + (x == y));           
        System.out.println("x.equals(y): " + x.equals(y));

        System.out.println("\n--- Mixed Comparison ---");
        System.out.println("a == x: " + (a == x));       
        System.out.println("a.equals(x): " + a.equals(x)); 
    }
}

