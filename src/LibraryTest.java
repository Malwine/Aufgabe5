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
		Book newBook5 = new Book("666tll", "666autor", "669", "66uch", "66746");
		Book newBook6 = new Book("777tll", "777autor", "779", "77uch", "77746");
		Book newBook7 = new Book("888tll", "888autor", "889", "88uch", "88746");

		newBib.insert(newBook.toString());
		newBib.insert(newBook1.toString());
		newBib.insert(newBook2.toString());
		newBib.insert(newBook3.toString());
		newBib.insert(newBook4.toString());
		newBib.insert(newBook5.toString());
		newBib.insert(newBook6.toString());
		newBib.insert(newBook7.toString());

		newBib.delete(3);
		newBib.delete(5);
		//newBib.delete(6);

		newBib.print();
<<<<<<< HEAD

		/* Test missing for method delete(), array gets shorter test!
		 * and testing increment of bib */
=======
		 
		
		System.out.println("-----------------------");
		
		newBib.delete(1);  //newBook1 is deleted
		newBib.print();
		
		/* Test missing for testing increment of bib */
>>>>>>> dd236065ecc7d56dbd12eaa3d09859a0a595a671
	}
}