package classPractice;

public class DefaultValueOfInstanceVariable {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean bool;
	String str;
	
	public void showDefaults()
	{
		System.out.println("byte: "+ b);
		System.out.println("short: "+ s);
		System.out.println("int: "+i);
		System.out.println("long: "+l);
		System.out.println("float: "+f);
		System.out.println("double: "+d);
		System.out.println("char:" +c);
		System.out.println("boolean: "+bool);
		System.out.println("String: "+str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultValueOfInstanceVariable ob = new DefaultValueOfInstanceVariable();
		ob.showDefaults();
		
	}

}
