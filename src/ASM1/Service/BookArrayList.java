package ASM1.Service;

import ASM1.Interface.InterfaceBook;
import ASM1.Model.Book.Book;
import ASM1.Model.Customer.Customer;

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
        System.out.printf("%-3s %-8s %-25s %-15s %-10s%n", "STT", "IdBook", "BookName", "Author", "Quantity");
        for (Book book : books) {
//            System.out.print(stt + ". " + " - idBook: " + book.getIdName() + " - bookName: "  + book.getName() + " - Author:" + book.getAuthor() +" - Quantity: " + book.getQuantity() + "\n");
            System.out.printf("%-3d %-8s %-25s %-15s %-10d%n", stt, book.getIdName(), book.getName(), book.getAuthor(), book.getQuantity());

            stt++;
        }
        System.out.println("=---------------------------------------------------------------=");
    }

    @Override
    public void updateBook(Book book) {
        for (Book bookCurrent : books) {
            if (bookCurrent.getIdName().equals(book.getIdName())) {
                if (!(book.getTitle().equals("0"))) {
                    bookCurrent.setTitle(book.getTitle());
                }
                if (!(book.getName().equals("0"))) {
                    bookCurrent.setName(book.getName());
                }
                if (!(book.getDescription().equals("0"))) {
                    bookCurrent.setDescription(book.getDescription());
                }
                if (!(book.getAuthor().equals("0"))) {
                    bookCurrent.setAuthor(book.getAuthor());
                }
                if (!(book.getQuantity() == 0)) {
                    bookCurrent.setQuantity(book.getQuantity());
                }
            }
        }

    }

    @Override
    public void deleteBook(String idBook) {
        ArrayList<Book> tempBooks = new ArrayList<>();
        for (Book book : books) {
            tempBooks.add(book);
        }
        for (Book book : tempBooks) {
            if (book.getIdName().equals(idBook)) {
                books.remove(book);
            }
        }
        System.out.println("Deleted " + idBook);
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

    @Override
    public void returnBook(String idBook, int quantity) {
        for (Book book : this.books) {
            if (book.getIdName().equals(idBook)) {
                int quantityBook = book.getQuantity() + quantity;
                book.setQuantity(quantityBook);
            }
        }
    }


}
