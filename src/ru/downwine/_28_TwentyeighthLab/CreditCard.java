package ru.downwine._28_TwentyeighthLab;

public class CreditCard {
    private int balance;
    private final String number;
    private final String date;
    private final String cvv;

    CreditCard(String number, String date, String cvv) {
        this.balance = 100_000;
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
}
