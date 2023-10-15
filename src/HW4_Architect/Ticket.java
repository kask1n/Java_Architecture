package HW4_Architect;

import java.time.format.DateTimeFormatter;

public class Ticket {
    public int rootNumber;
    public int place;
    public int price;
    public DateTimeFormatter date;
    public boolean isValid;

    public Ticket(int rootNumber, int place, int price, DateTimeFormatter date, boolean isValid) {
        this.rootNumber = rootNumber;
        this.place = place;
        this.price = price;
        this.date = date;
        this.isValid = isValid;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "rootNumber=" + rootNumber +
                ", place=" + place +
                ", price=" + price +
                ", date=" + date +
                ", isValid=" + isValid +
                '}';
    }
}
