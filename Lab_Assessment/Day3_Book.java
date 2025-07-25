package classPractice;

class Book
{
	String title;
	String author;
	double price;
	Book(String title, String author, double price)
	{
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void displayDetails()
	{
		System.out.println("Details are: ");
		System.out.println("Title: "+title+ "\nAuthor: "+author+ "\nPrice: "+price+"\n");
	}
}

public class Day3_Book {
	public static void main(String[] args) {
		Book a1 = new Book("The Path", "ABC", 600);
		Book a2 = new Book("The Animal","XYZ", 300);
		
		a1.displayDetails();
		a2.displayDetails();
		
		
	}

}
