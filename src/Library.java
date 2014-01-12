
public class Library {
	
	private int initialCapacity;
	private int capacityIncrement;
	private String [] Bib;
	
	public Library()	{
		initialCapacity = 10;
		capacityIncrement = 10;
		Bib = new String [initialCapacity];
	}
	
	public void insert(String b)	{
		for (int i = 0; i < Bib.length; i++)	{
			if (Bib [i] == null)	{
				Bib [i] = b;
				break;
			}
		}
	}
	
	public void delete(int b)	{
		Bib [b] = "";
		for (int i = b; i < Bib.length - 2; i++)	{
			Bib [i] = Bib [i + 1];
		}
	}
	
	public void print()	{
		for (int i = 0; i < Bib.length; i++)	{
			System.out.println(Bib [i]);
		}
	}
}