/**
 * @author Jan Dangel, Malwine Gier
 */

public class Library {

	private int initialCapacity;
	private int capacityIncrement;
	private String [] Bib;

	/**
	 * Constructs a Library
	 * @param initialCapacity 
	 * @param capacityIncrement
	 * 
	 */
	public Library()	{
		initialCapacity = 3;
		capacityIncrement = 3;
		Bib = new String [initialCapacity];
	}

	/**
	 * Inserts a book object in the library and increments the capacity of the array.
	 */
	
	public void insert(String b)	{
		/* Bib bigger if bib full and a insert.newBook */
		if (Bib [Bib.length - 1] != null)	{
			String [] newBib = new String [Bib.length + capacityIncrement];
			for (int i = 0; i < Bib.length; i++)	{
				newBib [i] = Bib [i];
				if (newBib [i] == null)	{
					newBib [i] = b;
					break;
				}
			}
			newBib [Bib.length] = b;
			Bib = newBib;
		}	else	{
			for (int i = 0; i < Bib.length; i++)	{
				if (Bib [i] == null)	{
					Bib [i] = b;
					break;
				}
			}
		}
	}

	/**
	 * Deletes a book object in the library and decrements the capacity of the array.
	 */
	
	public void delete(int b)	{
		b = b - 1;
		/* Bib gets smaller if
		 * deleting a book and:
		 * |books| = BibCapacity - capacityIncrement */
		if (b > Bib.length - 1)	{
			;
		}	else if (Bib [b] == null)	{
			;
		}	else if (Bib [Bib.length - capacityIncrement + 1] != null && Bib [Bib.length - capacityIncrement + 2] == null)	{
				String [] newBib = new String [Bib.length - capacityIncrement];
				for (int i = 0; i < b; i++)	{
					newBib [i] = Bib [i];
				}
				for (int i = b; i < newBib.length; i++)	{
					newBib [i] = Bib [i+1];
				}
				Bib = newBib;
		}	else	{
			Bib [b] = "";
			int i;
			for (i = b; i < Bib.length - 2 && Bib [i + 1] != null; i++)	{
				Bib [i] = Bib [i + 1];
			}
			Bib [i] = null;
		}	
	}
	
	public void printLength()	{
		
		System.out.print(Bib.length);
	}
	
	/**
	 * Output of all books in the array.
	 */

	public void print()	{
		for (int i = 0; i < Bib.length; i++)	{
			if (Bib [i] == null)	break;
			System.out.println(Bib [i]);
		}
	}
}