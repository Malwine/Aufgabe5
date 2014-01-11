
public class Library {
	
	private int initialCapacity;
	private int capacityIncrement;
	String [] Bib;
	
	public Library()	{
		initialCapacity = 10;
		capacityIncrement = 10;
		Bib = new String [initialCapacity];
		for (int i = 0; i < Bib.length - 1; i++)	{
			Bib [i] = "Yeah!";
		}
	}
	
	public void print()	{
		for (int i = 0; i < Bib.length - 1; i++)	{
			System.out.println(Bib [i]);
		}
	}
	
}
