package HW4_Architect;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter date = DateTimeFormatter.ofPattern("2023-10-10");
        List<Ticket> tickets = new ArrayList<>();
        Ticket ticket1 = new Ticket(1, 5, 100, date, true);
        Ticket ticket2 = new Ticket(2, 7, 10000, date, true);

        Customer customer1 = new Customer(123, new CashProvider(12345, true, 123, 1000), tickets);
        customer1.buyTicket(ticket1);
        customer1.buyTicket(ticket2);
        customer1.buyTicket(ticket1);

        customer1.searchTicket(date);
    }
}
