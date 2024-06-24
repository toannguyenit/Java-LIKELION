package ASM1.Interface;

import ASM1.Model.Book.Book;
import ASM1.Model.Customer.Customer;

public interface InterfaceBook {


    public void addBook(Book book);

    public void showBooksDisplay();

    public void updateBook(int id);

    public void deleteBook(int id);

    public void hireBook(String idBookName, int quantity);

    public Book findBookByIdName(String idBookName);
}
