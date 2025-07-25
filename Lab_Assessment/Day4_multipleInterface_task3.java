package classPractice;


interface Printable {
	void print(String doc);
}


interface Scannable {
	void scan(String doc);
}

class MultifunctionPrinter implements Printable, Scannable {
	private String brand;

	 MultifunctionPrinter(String brand) {
	     this.brand = brand;
	 }
	
	 @Override
	 public void print(String doc) {
	     System.out.println(brand + " Printer is printing: " + doc);
	 }
	
	 @Override
	 public void scan(String doc) {
	     System.out.println(brand + " Printer is scanning: " + doc);
	 }
}


public class Day4_multipleInterface_task3 {
 public static void main(String[] args) {
     MultifunctionPrinter obj = new MultifunctionPrinter("HP");
     obj.print("Java OOP Concepts");
     obj.scan("Project Report");
 }
}

