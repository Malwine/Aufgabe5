
public class LibraryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Library newBib = new Library();
		
		Book newBook = new Book("1tite", "1au", "12009", "1uch", "1326");
		Book newBook1 = new Book("22222", "2oor", "222009", "22Sach", "2246");
		Book newBook2 = new Book("3tlll", "33aor", "3309", "333Sach", "318746");
		Book newBook3 = new Book("444tl", "444autor", "4449", "444bh", "448746");
		Book newBook4 = new Book("555tll", "555autor", "559", "55uch", "55746");

		newBib.insert(newBook.toString());
		newBib.insert(newBook1.toString());
		newBib.insert(newBook2.toString());
		newBib.insert(newBook3.toString());
		newBib.insert(newBook4.toString());

		newBib.print();
		
		/* Test missing for method delete() and testing increment of bib */
	}
}
