package ASM1.Model.Customer;

import java.time.LocalDateTime;

public class HireBook {

    String name;
    int daysHire;
    LocalDateTime dateTime;
    int quantity;

    public HireBook(){}

    public HireBook(String name, int daysHire, LocalDateTime dateTime, int quantity) {
        this.name = name;
        int daysHired = daysHire;
        this.dateTime = dateTime;
        this.quantity = quantity;
    }

    public int getDaysHire() {
        return daysHire;
    }

    public void setDaysHire(int daysHire) {
        this.daysHire = daysHire;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
