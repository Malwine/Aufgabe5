
public class Book {

	private String title;
	private String author;
	private String year;
	private String genre;
	private String isbn;
	
	/**
	 * Contructs a Book
	 * @param title
	 * @param author
	 * @param year
	 * @param genre
	 * @param isbn
	 * 
	 */
	
	public Book(String title, String author, String year, String genre, String isbn) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.genre = genre;
		this.isbn = isbn;
	}
	
	/**
	 * Returns a string for single book object output.
	 */
	public String toString() {
		return (title + ", " + author + "\n" + year + "\n" + genre + "\n" + isbn);
	}	
}
