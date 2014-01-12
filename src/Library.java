public class Library {

	private int initialCapacity;
	private int capacityIncrement;
	private String [] Bib;

	public Library()	{
		/* correct? */
		initialCapacity = 3;
		capacityIncrement = 3;
		Bib = new String [initialCapacity];
	}

	public void insert(String b)	{
		/* Bib bigger if bib full and a insert.newBook */
		for (int i = 0; i < Bib.length; i++)	{
			if (Bib [i] == null)	{
				Bib [i] = b;
				break;
			}
		}
	}

	public void delete(int b)	{
		/* Bib should get smaller if
		 * deleting a book and:
		 * |books| = initialCapacity - capacityIncrement */
		Bib [b] = "";
		for (int i = b; i < Bib.length - 2; i++)	{
			Bib [i] = Bib [i + 1];
		}
	}

	public void print()	{
		for (int i = 0; i < Bib.length; i++)	{
			if (Bib [i] == null)	break;
			System.out.println(Bib [i]);
		}
	}
}