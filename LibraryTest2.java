package assignment02;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class LibraryTest2 {

	Library lib = new Library();
	ArrayList<LibraryBook> empty = new ArrayList<LibraryBook>();

	/**
	 * Setup for our tests
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		lib.addAll("Mushroom_Publishing.txt");
	}

	@Test
	public void testLookupLongISBN() {
		fail("Not yet implemented");
	}

	@Test
	public void testLookupStringHolder() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckout() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckinLongISBN() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckinStringHolder() {
		fail("Not yet implemented");
	}

	@Test
	public void testLibraryEqualsMethod() {

	}

}
