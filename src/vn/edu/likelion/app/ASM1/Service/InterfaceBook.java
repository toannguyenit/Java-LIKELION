package ASM1.Service;

import ASM1.Model.Book.Book;

public interface InterfaceBook {


    public void addBook(Book book);

    public void showBooksDisplay();

    public void updateBook(Book book);

    public void deleteBook(String idBook);

    public void hireBook(String idBookName, int quantity);

    public Book findBookByIdName(String idBookName);

    public void returnBook(String idBook, int quantity);
}
