package assignment02;

import java.util.GregorianCalendar;

/**
 * Constructs a class LibraryBook derived from Book and containing the library
 * book's holder (a String) and due date represented by a GregorianCalendar
 * (Links to an external site.). (import java.util.GregorianCalendar)
 * 
 * If a library book is checked in, its holder and due date should be set to
 * null. The LibraryBook class must include the following methods (you may add
 * other methods as needed). Please make sure the visibility (public), return
 * type, parameter type and order, and method name are exactly as you see here.
 * Do not change them!
 * 
 * public LibraryBook(long isbn, String author, String title)
 * 
 * public String getHolder() public GregorianCalendar getDueDate() Methods for
 * checking a book in and out.
 * 
 * Do not override the equals method in Book.
 * 
 * @author mosesmanning
 *
 */
public class LibraryBook extends Book {

	private String holderName = null;
	private GregorianCalendar dueDate = null;

	/**
	 * 
	 * @param isbn
	 * @param author
	 * @param title
	 */
	public LibraryBook(long isbn, String author, String title) {
		super(isbn, author, title);
	}

	/**
	 * Returns the holder of the LibraryBook
	 * 
	 * @return
	 */
	public String getHolder() {
		return this.holderName;
	}

	/**
	 * Returns The dueDate from the LibraryBook
	 * 
	 * @return
	 */
	public GregorianCalendar getDueDate() {
		return this.dueDate;
	}

	/**
	 * Initializes the holderName and dueDate to Null when the book is checked
	 * in
	 */
	public void checkIn() {
		this.holderName = null;
		this.dueDate = null;
	}

	/**
	 * Initializes a holderName and dueDate to a libraryBook when it is checkedOut
	 * @param holder
	 * @param dueDate
	 */
	public void checkOut(String holder, GregorianCalendar dueDate) {
		this.holderName = holder;
		this.dueDate = dueDate;
	}

}
