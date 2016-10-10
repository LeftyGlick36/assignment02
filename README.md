assignment02

#The Problem
We have been asked to construct a program for libraries that allows books to be checked in and out electronically. A book is represented by an ISBN, an author, and a title, all of which cannot change once the book has been created. (Please note that ISBNs are unique.) A library book is a book together with a holder (representation of the person who has the book checked out) and a due date, both of which can change as needed. (Please note that for our purposes, all holders are unique.)

To make our task more challenging, some of the libraries that will use our program represent holders with names. Others represent holders with phone numbers. Furthermore, we hope to sell our program to even more libraries whose representation of holders we cannot anticipate. Thus, our library program must be generic.

Finally, we hope to squeeze even more money out of our customers by offering two additional features: an operation that retrieves the list of all books in the library sorted either by ISBN or by author (for inventory purposes), and an operation that retrieves the list of all overdue library books.

This is a big job that is best completed in three phases.

* Phase 1: 
	Build the library using a specific representation of the library book holder (a String name). In this phase, the library is not generic. This phase uses the classes Book, LibraryBook, Library, and LibraryTest(see below).
This phase gives you practice using inheritance and Java basics.

* Phase 2: 
Modify the specific implementation completed in Phase 1 to make it generic. This will require using a placeholder for the type of the library book holder (rather than an actual String type). This phase uses the classes Book, LibraryBookGeneric, LibraryGeneric, and LibraryGenericTest(see below).
This phase gives you practice using Java 5 generics.

* Phase 3: 
Add to the generic implementation completed in Phase 2 to include the extra operations of getting a sorted list of library books (based on 2 different orderings) and getting a list of overdue library books. This phase will add to the class LibraryGeneric(see below).

This phase will give you practice using the Java Comparator interface and function objects.

Requirements
* Phase 1
    * Book and LibraryBook classesThe base class Book 
￼
    * has been started for you. The equals method is left for you to fill in. Do not make any other changes to the Book class. Construct a class LibraryBook derived from Book and containing the library book's holder (a String) and due date represented by a GregorianCalendar (Links to an external site.) .  (import java.util.GregorianCalendar) If a library book is checked in, its holder and due date should be set to null. The LibraryBook class must include the following methods (you may add other methods as needed). Please make sure the visibility (public), return type, parameter type and order,  and method name are exactly as you see here. Do not change them!
        * public LibraryBook(long isbn, String author, String title)
        * public String getHolder()
        * public GregorianCalendar getDueDate()
        * Methods for checking a book in and out.
        * Do not override the equals method in Book.
    * Library classThe Library 
￼
    * class has been started for you. Fill in the method implementations as indicated. Do not change the method signatures. 
    * LibraryTest classThe sample test class (Links to an external site.)  LibraryTest
￼
    *  has been provided for you. You should improve this class to include more exhaustive testing.  The LibraryTest class references a text file of books, Mushroom_Publishing.txt
￼
￼
    * . Download this file and place in your Eclipse project folder. 
* Phase 2
    * LibraryBookGeneric classMake a copy of your LibraryBook class and modify it to make the type of the library book's holder generic. The header for your new class should be the following. public class LibraryBookGeneric<Type> extends Book For the most part, modification will involve replacing the String type for the library book's holder in your original class to Type in the new class. (Be careful. It is not correct to replace every occurrence of String with Type.) 
    * LibraryGeneric classMake a copy of your Library class and modify it to make the list of library books a list of generic library books. The header for your new class should be the following. public class LibraryGeneric<Type> For the most part, modification will involve replacing the String type for the library book's holder in your original class to Type in the new class and replacing the ArrayList<LibraryBook> type for the library in your original class to ArrayList<LibraryBookGeneric<Type>> in the new class. 
    * LibraryGenericTest classThe sample test class LibraryGenericTest 
￼
    * has been provided for you. You should extend this class to include more exhaustive testing. The LibraryGenericTest class creates two libraries, one that identifies holders with (String) names and another that identifies holders with PhoneNumber objects. To use the test class, you must download and import the PhoneNumber 
￼
    * class. 
* Phase 3
    * Adding features to the LibraryGeneric classAdd the code given here 
￼
￼
    * to the LibraryGeneric class you completed in Phase 2. (Copy the code and paste it just inside the curly braces of the class. Note that this code requires that you import java.util.Comparator (Links to an external site.) .) Do not change the method signatures. Notice that the provided code includes a method for sorting an ArrayList of items. Both the type of items in the ArrayList and the order of the sort is generic. The ordering is specified by the Comparator object passed to the method. 
    * Feature 1: retrieving a list of library books sorted by ISBN. This feature has been implemented for you. The getInventoryList method first makes a copy of the list of library books and then invokes the sort method with an instance of the OrderByIsbn class (a Comparator function object). 
    * Feature 2: retrieving a list of library books sorted by author. This is similar to Feature 1, except you must provide the code for the OrderByAuthorcomparator (for which the class declaration is provided, you must fill in the code), and you must fill in the getOrderedByAuthormethod. You do not need to sort by last name, just sort by the full author String as is. If two books have the same author, this Comparator should break the tie with the book title. For example, Mushroom_Publishing.txt contains the following two books:           Moyra Caldecott    The Eye of Callanish           Moyra Caldecott    Crystal Legends The OrderByAuthor comparator should treat "Crystal Legends" as less than "The Eye of Callanish", even though they have the same author, but since 'C' is alphabetically less than 'T'. To perform these comparisons, simply use String's built-in compareTo method. Then invoke the sort method with an instance of OrderByAuthor. 
    * Feature 3: retrieving a list of overdue library books sorted by due date (oldest first). This feature is left for you to implement. In getOverdueList, first make a copy of the list of library books, but include only those that are overdue (note that GregorianCalendar has a compareTo method for comparing dates). Then invoke the sort method on the overdue list with an instance of the OrderByDueDate class (a Comparator), for which the class declaration is provided, but you must fill in the rest of the implementation.
        * Be sure to test these features by adding to the LibraryGenericTest or creating a new test class!
