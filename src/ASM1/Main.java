package ASM1;

import ASM1.Service.BookArrayList;
import ASM1.Service.CustomerArrayList;
import ASM1.Model.Book.Book;
import ASM1.Model.Customer.Customer;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static CustomerArrayList customerArrayList = new CustomerArrayList();

    static BookArrayList bookArrayList = new BookArrayList();

    static void showFunctionDisplay() {
        System.out.println("=------------------------------------------=");
        System.out.println("+         Quản lý thư viện                 +");
        System.out.println("=------------------------------------------=");
        System.out.println("+ 1. Tao Khach hang                        +");
        System.out.println("+ 2. Xem danh sach Khach hang              +");
        System.out.println("+ 3. Tim va hien thi thong tin khach hang  +");
        System.out.println("+ 4. Chinh sua thong tin Khach hang        +");
        System.out.println("+ 5. Them Sach                             +");
        System.out.println("+ 6. Xem danh sach Sach                    +");
        System.out.println("+ 7. Sua thong tin Sach                    +");
        System.out.println("+ 8. Thue Sach                             +");
        System.out.println("+ 9. Tra Sach                              +");
        System.out.println("+ 0. Thoat                                 +");
        System.out.println("=------------------------------------------=");
    }

    static ArrayList<Customer> initCustomerArrayList() {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("ID01", "Nguyen Duc Tan", 26));
        customers.add(new Customer("ID02", "Nguyen Ha Kien", 25));
        customers.add(new Customer("ID03", "Le Thu Ha", 23));
        customers.add(new Customer("ID04", "Nguyen Manh Khang", 22));
        customers.add(new Customer("ID05", "Nguyen Vo Song Toan", 28));
        return customers;
    }

    static ArrayList<Book> initBookArrayList() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("B01", "Truyen tranh", "Doreamon1", "Tuan Mentor", "Truyen ke ve Mot cau be Nobita va Doreamon", 100));
        books.add(new Book("B02", "Truyen tranh", "Doreamon2", "Tuan Mentor", "Truyen ke ve Mot cau be Nobita va Doreamon", 100));
        books.add(new Book("B03", "Truyen tranh", "Doreamon3", "Tuan Mentor", "Truyen ke ve Mot cau be Nobita va Doreamon", 100));
        books.add(new Book("B04", "Truyen tranh", "Doreamon4", "Tuan Mentor", "Truyen ke ve Mot cau be Nobita va Doreamon", 100));
        books.add(new Book("B05", "Truyen ma", "Ngoi nha co mo 1", "Duong Mentor", "Truyen ke ve mot ngoi nha Ma", 100));
        books.add(new Book("B06", "Truyen ma", "Ngoi nha co mo 1", "Duong Mentor", "Truyen ke ve mot ngoi nha MA", 100));
        return books;
    }

    static int inputFunctionCodeNumber() {
        try {
            int functionCodeNumber = Integer.parseInt(scanner.next());
            scanner.nextLine();
            return functionCodeNumber;
        } catch (RuntimeException e) {
            System.out.println("Loi: " + e.getMessage());
            return -1;
        }
    }

    static Customer inputCustomer() {
        Customer customer = new Customer();
        System.out.print("Vui long nhap id Name: ");
        String idName = scanner.nextLine();
        System.out.print("Vui long nhap ten: ");
        String fullName = scanner.nextLine();
        System.out.print("Vui long nhap tuoi: ");
        int age = scanner.nextInt();
        customer.setIdName(idName);
        customer.setFullName(fullName);
        customer.setAge(age);
        return customer;
    }

    static Book inputBook() {
        Book book = new Book();
        System.out.print("Vui long nhap id Book: ");
        String idBook = scanner.nextLine();

        System.out.print("Vui long nhap title: ");
        String title = scanner.nextLine();

        System.out.print("Vui long nhap ten sach: ");
        String name = scanner.nextLine();

        System.out.print("Vui long nhap ten mo ta: ");
        String description = scanner.nextLine();

        System.out.print("Vui long nhap ten tac gia: ");
        String author = scanner.nextLine();

        System.out.print("Vui long so luong: ");
        int quantity = scanner.nextInt();

        book.setIdName(idBook);
        book.setTitle(title);
        book.setName(name);
        book.setAuthor(author);
        book.setDescription(description);
        book.setQuantity(quantity);
        return book;
    }

    static void clearDisplay(){
        System.out.println("======================================================================================");
    }

    public static void main(String[] args) {
        //  Initial Default ArrayList
        customerArrayList.setCustomers(initCustomerArrayList());
        bookArrayList.setBooks(initBookArrayList());

        // Main
        int functionCodeNumber = -1;
        while (functionCodeNumber != 0) {
            showFunctionDisplay();
            System.out.print("Vui long chon chuc nang: ");
            int inputFunctionCodeNumber = inputFunctionCodeNumber();
            functionCodeNumber = inputFunctionCodeNumber;
            switch (functionCodeNumber) {
                case 1:
                    Customer customer = inputCustomer();
                    customerArrayList.addCustomer(customer);
                    customerArrayList.showCustomersDisplay();
                    break;
                case 2:
                    customerArrayList.showCustomersDisplay();
                    break;
                case 3:
                    System.out.print("Vui long nhap ma khach hang - ID: ");
                    String idName = scanner.nextLine();
                    Customer customerFind = customerArrayList.findCustomerByIdName(idName);
                    customerFind.showInformation();
                    break;
                case 4:
                    System.out.print("Vui long nhap ma khach hang - ID: ");
                    String idNameCase4 = scanner.nextLine();
                    Customer customerFindCase4 = customerArrayList.findCustomerByIdName(idNameCase4);
                    customerFindCase4.showInformation();
                    System.out.println("Duoi day la phan thay doi thong tin, neu nhu khong muon thay doi thong tin cua mot cot nao, hay nhap 'abc' ");
                    Customer customerUpdate = inputCustomer();
                    customerArrayList.updateCustomer(customerUpdate);
                    break;
                case 5:
                    //Book book = new Book("Truyen hai", "Trang Quynh", "Le Thu Ha", "Truyen hai dan gian", 1000);
                    Book book = inputBook();
                    bookArrayList.addBook(book);
                case 6:
                    bookArrayList.showBooksDisplay();
                    break;
                case 7:
                    bookArrayList.showBooksDisplay();
                    break;
                case 8:
                    System.out.println("Vui long nhap ID khach hang: ");
                    String idNameCustomer = scanner.nextLine();

                    System.out.println("Vui long nhap ID sach: ");
                    String idNameBook = scanner.nextLine();

                    System.out.println("Vui long nhap so luong can thue: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Vui long nhap so ngay can thue:  ");
                    int days = scanner.nextInt();
                    scanner.nextLine();
                    customerArrayList.hireBook(idNameCustomer, quantity, idNameBook, bookArrayList.getBooks(), days);
                    System.out.println("Thong tin co ban: idBookName: " + idNameBook + ", quantity: " + quantity + ", days: " + days);

                    bookArrayList.hireBook(idNameBook, quantity);
                    bookArrayList.showBooksDisplay();
                    break;

                case 9:
                    // todo
                    break;

                default:
                    functionCodeNumber = -1;
                    break;
            }
            clearDisplay();
        }
    }
}
