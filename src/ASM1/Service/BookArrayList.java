package ASM1.Service;

import ASM1.Interface.InterfaceBook;
import ASM1.Model.Book.Book;

import java.util.ArrayList;

public class BookArrayList implements InterfaceBook {

    ArrayList<Book> books;
    public BookArrayList() {}

    public BookArrayList(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void showBooksDisplay() {
        int stt = 1;
        System.out.println("=---------------------------------------------------------------=");
        System.out.println("=                         DANH SACH SACH                        =");
        System.out.println("=---------------------------------------------------------------=");
        System.out.printf("%-3s %-8s %-25s %-15s %-10s%n", "STT", "idBook", "bookName", "Author", "Quantity");
        for (Book book : books) {
//            System.out.print(stt + ". " + " - idBook: " + book.getIdName() + " - bookName: "  + book.getName() + " - Author:" + book.getAuthor() +" - Quantity: " + book.getQuantity() + "\n");
            System.out.printf("%-3d %-8s %-25s %-15s %-10d%n", stt, book.getIdName(), book.getName(), book.getAuthor(), book.getQuantity());

            stt++;
        }
        System.out.println("=---------------------------------------------------------------=");
    }

    @Override
    public void updateBook(int id) {

    }

    @Override
    public void deleteBook(int id) {

    }

    @Override
    public void hireBook(String idBookName, int quantity) {
        for (Book book : this.books) {
            if (book.getIdName().equals(idBookName)) {
                int quantityBook = book.getQuantity() - quantity;
                System.out.println("So luong ban dau: " + book.getQuantity());
                book.setQuantity(quantityBook);
                System.out.println("So luong sau khi sua: " + book.getQuantity());
            }
        }
    }

    @Override
    public Book findBookByIdName(String idBookName) {
        Book book = new Book();
        for (Book book1 : books) {
            if (book1.getName().equals(idBookName)) {
                book.setIdName(book1.getIdName());
                book.setTitle(book1.getTitle());
                book.setName(book1.getName());
                book.setAuthor(book1.getAuthor());
                book.setDescription(book1.getDescription());
                book.setQuantity(book1.getQuantity());
            }
        }
        return book;
    }




}
