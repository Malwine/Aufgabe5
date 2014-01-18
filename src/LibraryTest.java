/**
 * @author Jan Dangel, Malwine Gier
 */

public class LibraryTest {

	/**
	 * @param args
	 */
	
	public static void main(String[] argv) {

		System.out.println(" ");
		System.out.println("--------------------------------------------");
		System.out.println("Library Tester");
		System.out.println("--------------------------------------------");
		System.out.println(" ");
		System.out.println("Test 1 - Inserting a book in an empty library:");	
		Library newBib = new Library();
		Book newBook0 = new Book("Java ist auch eine Insel", "Christian Ullenbook", "2009", "Sachbuch", "978-3836213714");
		
		System.out.println(" ");
		System.out.println("---Expected output:");
		System.out.println("Java ist auch eine Insel" + ", " + "Christian Ullenbook"+ "\n" + "2009" + "\n" +"Sachbuch"+ "\n" + "978-3836213714");
		System.out.println(" ");
		System.out.println("---Actual output:");
		newBib.insert(newBook0.toString());
		newBib.print();
		System.out.println("--------------------------------------------");
		
		System.out.println(" ");
		System.out.println("Test 2 - Inserting a book in a partly filled library:");
		System.out.println(" ");
		Library newBib2 = new Library();
		Book newBook1 = new Book("title1", "author1", "1990", "genre1", "111-222344246");
		Book newBook2 = new Book("title2", "author2", "1991", "genre2", "222-318742426");
		Book newBook3 = new Book("title3", "author3", "1992", "genre3", "333-318742426");
		newBib2.insert(newBook1.toString());
		newBib2.insert(newBook2.toString());
		newBib2.insert(newBook3.toString());
		System.out.println("---Expected output:");
		System.out.println(" ");
		System.out.println("title1" +", " + "author1"+  "\n" + "1990" +  "\n"+ "genre1" +  "\n" + "111-222344246");
		System.out.println(" ");
		System.out.println("title2" +", " + "author2"+  "\n" + "1991" +  "\n"+ "genre2" +  "\n" + "222-318742426");
		System.out.println(" ");
		System.out.println("title3" +", " + "author3"+  "\n" + "1992" +  "\n"+ "genre3" +  "\n" + "333-318742426");	
		System.out.println(" ");
		System.out.println("---Actual output:");
		System.out.println(" ");
		newBib2.print();
		
		System.out.println("--------------------------------------------");
		System.out.println(" ");
		System.out.println("Test 3 - Inserting the 11th book in a full library of 10:");
		System.out.println(" ");
		Library newBib3 = new Library();
		Book newBookFull1 = new Book("title1", "author1", "1990", "genre1", "111-222344246");
		Book newBookFull2 = new Book("title2", "author2", "1991", "genre", "222-318742426");
		Book newBookFull3 = new Book("title3", "author3", "1991", "genre", "333-318742426");
		Book newBookFull4 = new Book("title4", "author4", "1991", "genre", "444-318742426");
		Book newBookFull5 = new Book("title5", "author5", "1991", "genre", "555-318742426");
		Book newBookFull6 = new Book("title6", "author6", "1991", "genre", "666-318742426");
		Book newBookFull7 = new Book("title7", "author7", "1991", "genre", "777-318742426");
		Book newBookFull8 = new Book("title8", "author8", "1991", "genre", "888-318742426");
		Book newBookFull9 = new Book("title9", "author9", "1991", "genre", "999-318742426");
		Book newBookFull10 = new Book("title10", "author10", "1991", "genre", "100-318742426");
		Book newBookFull11 = new Book("title11", "author11", "1991", "genre", "111-318742426");
		
		newBib3.insert(newBookFull1.toString());
		newBib3.insert(newBookFull2.toString());
		newBib3.insert(newBookFull3.toString());
		newBib3.insert(newBookFull4.toString());
		newBib3.insert(newBookFull5.toString());
		newBib3.insert(newBookFull6.toString());
		newBib3.insert(newBookFull7.toString());
		newBib3.insert(newBookFull8.toString());
		newBib3.insert(newBookFull9.toString());
		newBib3.insert(newBookFull10.toString());
		newBib3.insert(newBookFull11.toString());
		System.out.println("---Expected output: 11 book objects");
		System.out.println(" ");
		System.out.println("---Actual output:");
		System.out.println(" ");
		newBib3.print();
		
		System.out.println("--------------------------------------------");
		
		System.out.println(" ");
		System.out.println("Test 4 - Deleting a book from an empty library:");
		System.out.println(" ");
		Library newBib4 = new Library();
		Book newBookD = new Book("Delete A Book From Empty Library", "author", "1994", "genre", "978-667457576");
		newBib4.delete(newBookD.toString());
		System.out.println("---Expected output:");
		System.out.println("---Actual output:");
		newBib4.print();
		System.out.println("--------------------------------------------");
		
		System.out.println(" ");
		System.out.println("Test 5 - Deleting the second book from a partly filled library of 3 books:");
		System.out.println(" ");
		Library newBib5 = new Library();
		Book newBookD1 = new Book("Delete Book Test1", "author1", "1994", "genre1", "978-111111111");
		Book newBookD2 = new Book("Delete Book Test2", "author2", "1995", "genre2", "978-222222222");
		Book newBookD3 = new Book("Delete Book Test3", "author3", "1996", "genre3", "978-333333333");
		newBib5.insert(newBookD1.toString());
		newBib5.insert(newBookD2.toString());
		newBib5.insert(newBookD3.toString());
		
		newBib5.delete(newBookD2.toString());
		System.out.println("---Expected output:");
		System.out.println(" ");
		System.out.println("Delete Book Test1" +", " + "author1"+  "\n" + "1994" +  "\n"+ "genre1" +  "\n" + "978-111111111");
		System.out.println(" ");
		System.out.println("Delete Book Test3" +", " + "author3"+  "\n" + "1996" +  "\n"+ "genre3" +  "\n" + "978-333333333");
		System.out.println(" ");
		System.out.println("---Actual output:");
		System.out.println(" ");
		newBib5.print();
		
		
	}
}