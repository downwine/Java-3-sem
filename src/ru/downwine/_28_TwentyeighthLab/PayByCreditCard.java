package ru.downwine._28_TwentyeighthLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByCreditCard implements Strategy {
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;

    @Override
    public void collectInformation() {
        try {
            System.out.print("Введите номер карты: ");
            String number = reader.readLine();
            System.out.print("Введите дату окончания срока действия карты 'дд/гг': ");
            String date = reader.readLine();
            System.out.print("Введите CVV/CVC код: ");
            String cvv = reader.readLine();
            card = new CreditCard(number, date, cvv);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }

    @Override
    public boolean pay(int sum) {
        if (cardIsPresent()) {
            System.out.println("Оплачено " + sum + " с помощью Credit Card.");
            card.setBalance(card.getBalance() - sum);
            return true;
        }
        else
            return false;
    }
}
