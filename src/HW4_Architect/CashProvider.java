package HW4_Architect;

import java.util.Scanner;

public class CashProvider {
    private long numberCard;
    private boolean isAuthorization;
    private int password;
    private int accountSum;

    public CashProvider(long numberCard, boolean isAuthorization, int password, int accountSum) {
        this.numberCard = numberCard;
        this.isAuthorization = isAuthorization;
        this.password = password;
        this.accountSum = accountSum;
    }

    public boolean authorization(Customer customer) {
        System.out.print("Введите пароль от карты: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextInt() == customer.cash.password) {
            System.out.println("Пароль верный.");
            return true;
        } else {
            System.out.println("Пароль неверный.");
            return false;
        }
    }

    public boolean buy(Ticket ticket) {
        if (ticket.price <= this.accountSum) {
            this.accountSum -= ticket.price;
            System.out.println("Оплачен билет #" + ticket.rootNumber);
            System.out.println("У Вас осталось " + this.accountSum + " руб. на карте.");
            return true;
        } else {
            System.out.println("Недостаточно средств на карте!");
            return false;
        }
    }
}
