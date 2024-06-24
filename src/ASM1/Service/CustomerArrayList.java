package ASM1.Service;

import ASM1.Model.Book.Book;
import ASM1.Model.Customer.Customer;
import ASM1.Interface.InterfaceCustomer;
import ASM1.Model.Customer.HireBook;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomerArrayList implements InterfaceCustomer
{
    static ArrayList<Customer> customers;

    public CustomerArrayList(){}

    public CustomerArrayList(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public void hireBook(String idNameCustomer, int quantity ,String idNameBook, ArrayList<Book> bookArrayList, int daysQuantity) {
        Customer customer = findCustomerByIdName(idNameCustomer);
        if (customer.getAge() < 16) {
            throw new RuntimeException("The customer age must be at least 16 years");
        }
        ArrayList<HireBook> hireBooks = customer.getHireBooks();

        for (Book book : bookArrayList) {
            if (book.getName().equals(idNameBook)) {
                HireBook hireBook = new HireBook();
                hireBook.setName(book.getName());
                hireBook.setQuantity(quantity);
                hireBook.setDaysHire(daysQuantity);
                hireBook.setDateTime(LocalDateTime.now());
                hireBooks.add(hireBook);
            }
        }
        customer.setHireBooks(hireBooks);

        for (Customer customerCurrent : customers) {
            if (customerCurrent.getIdName().equals(idNameCustomer)) {
                customerCurrent.setHireBooks(hireBooks);
            }
        }

        System.out.println("Da thue thanh cong!");
    }

    @Override
    public void addCustomer(Customer customerExample) {
        Customer customer = new Customer();
        customer.setIdName(customerExample.getIdName());
        customer.setFullName(customerExample.getFullName());
        customer.setAge(customerExample.getAge());
        customers.add(customer);
    }

    @Override
    public void showCustomersDisplay() {
        int stt = 1;
        System.out.println("=---------------------------------------------------------------=");
        System.out.println("=                    DANH SACH KHACH HANG                       =");
        System.out.println("=---------------------------------------------------------------=");
        System.out.printf("%-5s %-10s %-25s %-5s%n", "STT", "Id", "FullName", "Age");
        for (Customer customer : customers) {
            System.out.printf("%-5d %-10s %-25s %-5d%n", stt, customer.getIdName(), customer.getFullName(), customer.getAge());
            stt++;
        }
        System.out.println("=---------------------------------------------------------------=");
    }

    @Override
    public void updateCustomer(Customer customer) {
        for (Customer customersCurrent : customers) {
            if (customersCurrent.getIdName().equals(customer.getIdName())) {

                String customerName = customer.getFullName().equals("abc") ? customer.getFullName() : "";


                customersCurrent.setFullName(customer.getFullName());
                customersCurrent.setAge(customer.getAge());
            }
        }
    }

    @Override
    public Customer findCustomerByIdName(String idName) {
        Customer customer = new Customer();
        for (Customer c : customers) {
            if (c.getIdName().equals(idName)) {
                customer.setIdName(c.getIdName());
                customer.setFullName(c.getFullName());
                customer.setAge(c.getAge());
                return customer;
            }
        }
        return customer;
    }
}
