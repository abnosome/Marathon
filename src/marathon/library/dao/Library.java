package marathon.library.dao;


import marathon.library.model.Book;

public interface Library {

        // объявляем метод
        boolean addBook(Book book); //класс и тип переменной
        Book removeBook(int isbn);
        Book findBook(int isbn);
        int  quantity();
        void printBook();

}
