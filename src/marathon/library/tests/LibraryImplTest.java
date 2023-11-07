package marathon.library.tests;


import marathon.library.dao.Library;
import marathon.library.dao.LibraryImpl;
import marathon.library.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryImplTest {

   Library library;
    Book[] books;

    @BeforeEach
    void setUp() {
        library = new LibraryImpl(5);
        books = new Book[4];
        books[0] = new Book("Lord of the Ring", "J. R. R. Tolkien",1954, 100);
        books[1] = new Book("Harry Potter and the Philosopher's Stone", "Joan Rowling", 1997,300);
        books[2] = new Book("The Witcher", "Andrzej Sapkowski ", 1986, 400);
        books[3] = new Book("A Song of Ice and Fire ","George R.R. Martin", 1996,500);

        for (int i = 0; i < books.length; i++) {
            library.addBook(books[i]);
        }
    }

    @Test
    void addBook() {
        assertFalse(library.addBook(null));
        //не можем добавить второй раз
        assertFalse(library.addBook(books[1]));
        Book book1 = new Book("Repka", "Folklore",100,600);
        assertTrue(library.addBook(book1));
        assertEquals(5,library.quantity());
        Book book2 = new Book("Island","Aldous Huxsley", 1962,700);
        assertFalse(library.addBook(book2));
    }

    @Test
    void removeBook() {
        assertEquals(books[2],library.removeBook(500));
        assertEquals(3,library.quantity());
        assertNull(library.removeBook(500));
        assertNull(library.removeBook(500));
    }

    @Test
    void findBook() {
        assertEquals(books[1], library.findBook(500));
        assertNull(library.findBook(800));
    }

    @Test
    void quantity() {
        assertEquals(4,library.quantity());
    }

    @Test
    void printBook() {
    library.printBook();
    }
}