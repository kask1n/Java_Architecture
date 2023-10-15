package HW4_Architect;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    public int id;
    public CashProvider cash;
    public List<Ticket> tickets;

    public Customer(int id, CashProvider cash, List<Ticket> tickets) {
        this.id = id;
        this.cash = cash;
        this.tickets = tickets;
    }

    public boolean buyTicket(Ticket ticket) {
        cash.authorization(this);
        if (ticket.isValid)
            ticket.isValid = false;


        if (cash.buy(ticket)) {
            tickets.add(ticket);
            return true;
        } else {
            System.out.println("Не удалось оплатить билет.");
            return false;
        }
    }

    public List<Ticket> searchTicket(DateTimeFormatter date) {
        List<Ticket> foundTickets = new ArrayList<>();
        for (Ticket ticket : this.tickets) {
            if (date == ticket.date)
                foundTickets.add(ticket);
        }

        System.out.println("Найдены следующие билеты: ");
        System.out.println(List.of(foundTickets));
        return null;
    }
}
