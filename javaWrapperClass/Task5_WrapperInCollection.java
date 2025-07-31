package classPractice.javaWrapperClass;

//Task 6: Wrapper with ArrayList (Grades Tracker) 
import java.util.*; 
public class Task5_WrapperInCollection { 
	public static void main(String[] args) { 
	ArrayList<Integer> grades = new ArrayList<>(Arrays.asList(85, 75, 90, 
	60, 88)); 
	Collections.sort(grades); 
	grades.remove(0); // remove lowest 
	int max = Collections.max(grades); 
	int min = Collections.min(grades); 
	int sum = 0; 
	
	for (int g : grades) sum += g; 
	System.out.println("Grades: " + grades); 
	System.out.println("Max: " + max + ", Min: " + min + ", Avg: " + (sum 
	/ grades.size())); 
	} 
}  
