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
 * public String getHolder()
 * 
 * public GregorianCalendar
 * 
 * getDueDate()
 * 
 * Methods for checking a book in and out.
 * 
 * Do not override the equals method in Book.
 * 
 * @author mosesmanning
 *
 */
public class LibraryBook extends Book {

	// If a library book is checked in, its holder and due date should be set to
	// null
	private String holderName = null;
	private GregorianCalendar dueDate = null;

	public LibraryBook(long isbn, String author, String title) {
		super(isbn, author, title);
	}

	/**
	 * Gets the holder of the library book
	 */
	public String getHolder() {
		return this.holderName;

	}

	/**
	 * Gets the due date of the library book
	 * 
	 * @return
	 */
	public GregorianCalendar getDueDate() {
		return this.dueDate;

	}

	/**
	 * If a library book is checked in, its holder and due date should be set to
	 * null.
	 */
	public void checkIn() {
		this.holderName = null;
		this.dueDate = null;
	}

	/**
	 * If this book is checked out declare the holder of this book to the
	 * current holder and construct a due Date
	 * 
	 * @param holder
	 * @param dueDate
	 */
	public void checkOut(String holder, GregorianCalendar dueDate) {
		this.holderName = getHolder();
		this.dueDate = getDueDate();
	}

}
