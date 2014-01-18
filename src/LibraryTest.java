/**
 * @author Jan Dangel, Malwine Gier
 */

public class LibraryTest {

	/**
	 * @param args
	 */
	
	public static void main(String[] argv) {

		Library newBib = new Library();

		Book newBook0 = new Book("Java ist auch eine Insel", "Christian Ullenbook", "2009", "Sachbuch", "978-3836213714");
		Book newBook1 = new Book("title2", "author2", "1990", "genre2", "978-222344246");
		Book newBook2 = new Book("title3", "author3", "1991", "genre3", "978-318742426");
		Book newBook3 = new Book("title4", "author4", "1992", "genre4", "978-448742426");
		Book newBook4 = new Book("title5", "author5", "1993", "genre5", "978-557457756");
		Book newBook5 = new Book("title6", "author6", "1994", "genre6", "978-667457576");
		Book newBook6 = new Book("title7", "author7", "1995", "genre7", "978-777457576");
		Book newBook7 = new Book("title8", "author8", "1996", "genre8", "978-887445456");
		Book newBook8 = new Book("title9", "author9", "1997", "genre9", "978-887434556");
		Book newBook9 = new Book("title10", "author10", "1998", "genre10", "978-88744546");

		newBib.insert(newBook0.toString());
		newBib.insert(newBook1.toString());
		newBib.insert(newBook2.toString());
		newBib.insert(newBook3.toString());
		newBib.insert(newBook4.toString());
		newBib.insert(newBook5.toString());
		newBib.insert(newBook6.toString());
		newBib.insert(newBook7.toString());
		//newBib.insert(newBook8.toString());
		//newBib.insert(newBook9.toString());

		newBib.delete(newBook0.toString());
		newBib.delete(newBook7.toString());
	/*	newBib.delete();
		newBib.delete();
		newBib.delete();
		newBib.delete();
		newBib.delete();
		newBib.delete();
		newBib.delete();*/

		newBib.print();

		newBib.printLength(); // prints the length of the current array


	}
}