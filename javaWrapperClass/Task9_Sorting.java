package classPractice.javaWrapperClass;

//Task 10: Wrapper Classes with Sorting 
import java.util.*; 
public class Task9_Sorting { 
public static void main(String[] args) 
{ 
	Integer[] nums = {20, 10, 40, 30, 50}; 
	Arrays.sort(nums); // sort ascending 
	System.out.println("Sorted: " + Arrays.toString(nums)); 
	System.out.println("2nd highest: " + nums[nums.length - 2]); 
	} 
} 
