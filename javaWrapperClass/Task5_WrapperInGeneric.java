package classPractice.javaWrapperClass;


//5. Using Wrapper Classes in Generics 
public class Task5_WrapperInGeneric<T> { 
	T value; 
	void set(T value) 
	{ 
		this.value = value; 
	} 
	
	T get() 
	{ 
		return value; 
	} 
	public static void main(String[] args) { 
		Task5_WrapperInGeneric<Integer> intBox = new Task5_WrapperInGeneric<>(); 
		intBox.set(100); // Autoboxing 
		int x = intBox.get(); // Unboxing 
		System.out.println("Value: " + x); 
	} 
} 