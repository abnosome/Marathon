package marathon.library.model;
//создаем класс Book c полями ISBN, автор, название книги, год издания;
//создаем интерфейс Library с методами:
//добавить книгу;
//удалить книгу;
//найти книгу;
//кол-во книг;
//напечатать список книг.
//создаем класс LibraryImpl, который implements Library;
//создаем класс LibraryImplTest, в котором создаем тесты для вышеперечисленных методов.

public class Book {

    private String title;
    private String author;
    private int yearOfPublication;
    private int isbn;

    public Book(String title, String author, int yearOfPublication, long isbn) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.isbn = (int) isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }


    public int getIsbn() {
        return isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return isbn == book.isbn;
    }

    @Override
    public int hashCode() {
        return (int) (isbn ^ (isbn >>> 32));
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", isbn=" + isbn +
                '}';
    }


}