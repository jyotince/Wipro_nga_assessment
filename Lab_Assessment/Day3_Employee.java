package classPractice;

class Employee { 
	static int count = 0; 
	String name; 
	Employee(String name) { 
		this.name = name; 
		count++;  // increments for every object 
	} 
	void show() { 
		System.out.println("Employee Name: " + name); 
	} 
	static void showCount() { 
		System.out.println("Total Employees: " + count); 
	} 
} 


public class Day3_Employee { 
	public static void main(String[] args) { 
		Employee e1 = new Employee("Alice"); 
		Employee e2 = new Employee("Bob"); 
		e1.show(); 
		e2.show(); 
		Employee.showCount();  // Access static method 
	} 
} 