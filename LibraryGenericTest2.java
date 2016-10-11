package assignment02;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class LibraryGenericTest2 {
	
	LibraryGeneric<PhoneNumber> lib = new LibraryGeneric<PhoneNumber>();
	ArrayList<LibraryBook> empty = new ArrayList<LibraryBook>();
	

	/**
	 * Setup For our tests
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		lib.addAll("Mushroom_Publishing.txt");
	
		
	}

	
	@Test
	public void testLibraryGeneric() {
		fail("Not yet implemented");
	}

	@Test
	public void testAdd() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddAllArrayListOfLibraryBookGenericOfType() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddAllString() {
		fail("Not yet implemented");
	}

	@Test
	public void testLookupLong() {
		fail("Not yet implemented");
	}

	@Test
	public void testLookupType() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckout() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckinLong() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckinType() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetInventoryList() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetOrderedByAuthor() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetOverdueList() {
		fail("Not yet implemented");
	}

}
