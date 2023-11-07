package marathon.library.dao;


import marathon.library.model.Book;

public class LibraryImpl implements Library{

    private Book[] books;
    private int size;

    public LibraryImpl(int capacity){

        books = new Book[capacity];
    }


    @Override
    public boolean addBook(Book book) {
        if(book == null ||size == books.length || findBook(book.getIsbn())!= null){
            return false;
        }
        books[size]=book;
        size++;
        return false;
    }

    @Override
    public Book removeBook(int isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn) { //isbn is concured
                Book victim = books[i];
                books[i] = books[size - 1];
                books[size - 1] = null;
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Book findBook(int isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn()==isbn){
                return books[i];
            }
        }
        return null;
    }


    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printBook() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }
}
