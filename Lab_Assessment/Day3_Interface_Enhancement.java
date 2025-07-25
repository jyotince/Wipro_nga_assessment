package classPractice;

interface Logger
{
	default void logInfo()
	{
		System.out.println("Default logInfo method..");
	}
	static void logError()
	{
		System.out.println("Static logError method..");
	}
}

class AppLogger implements Logger
{

}

public class Day3_Interface_Enhancement {

	public static void main(String[] args) {
		AppLogger log1 = new AppLogger();
		log1.logInfo();
		Logger.logError();
	}

}
