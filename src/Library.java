
public class Library {
	
	private int initialCapacity;
	private int capacityIncrement;
	private String [] Bib;
	
	public Library()	{
		initialCapacity = 10;
		capacityIncrement = 10;
		Bib = new String [initialCapacity];
	}
	
	//public void insert()	{
		
	//}
	
	public void delete(Book b)	{
		Bib [b] = "";
		for (int i = b; i < Bib.length - 2; i++)	{
			Bib [i] = Bib [i + 1];
		}
	}
	
	public void print()	{
			System.out.println("x");
	}
}
