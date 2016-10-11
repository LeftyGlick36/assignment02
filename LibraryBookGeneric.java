package assignment02;

import java.util.GregorianCalendar;

/**
 * For the most part, modification will involve replacing the String type for
 * the library book's holder in your original class to Type in the new class.
 * (Be careful. It is not correct to replace every occurrence of String with
 * Type.)
 * 
 * @author mosesmanning
 *
 */
public class LibraryBookGeneric<Type> extends Book {

	public LibraryBookGeneric(long isbn, String author, String title) {
		super(isbn, author, title);
	}

	// If a library book is checked in, its holder and due date should be set to
	// null
	private Type holderName = null;
	private GregorianCalendar dueDate = null;

	/**
	 * Gets the holder of the library book
	 */
	public Type getHolder() {
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
	public void checkOut(Type holder, GregorianCalendar dueDate) {
		this.holderName = getHolder();
		this.dueDate = getDueDate();
	}

}
