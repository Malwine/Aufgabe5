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
	
	public void delete(String b)	{
		if (Bib [Bib.length - 1] == b)	{
			Bib [Bib.length - 1] = null;
		}	else	{
			for (int i = 0; i < Bib.length - 1; i++)		{
				if (b == Bib [i])	{
					for (int j = i; j < Bib.length - 2; j++)	{
						Bib [j] = Bib [j + 1];
					}
					Bib [Bib.length] = null;
					break;
				}
			}
		}
		//Bib [i] = null;
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