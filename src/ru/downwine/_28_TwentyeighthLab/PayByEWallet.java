package ru.downwine._28_TwentyeighthLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PayByEWallet implements Strategy {
    private static final Map<String, String> database = new HashMap<>();
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

    @Override
    public void collectInformation() {
        try {
            while (!signedIn) {
                System.out.print("Введите адрес электронной почты: ");
                email = reader.readLine();
                System.out.print("Введите пароль: ");
                password = reader.readLine();
                if (verify())
                    System.out.println("Верификация пройдена.");
                else
                    System.out.println("Неверный адрес электронной почты или пароль.");
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private boolean verify() {
        setSignedIn(email.equals(database.get(password)));
        return signedIn;
    }

    static {
        database.put("0119", "inbo-01-19@mail.ru");
        database.put("111", "ksusha@gmail.com");
    }

    @Override
    public boolean pay(int paymentSum) {
        if (signedIn) {
            System.out.println("Оплачено " + paymentSum + " с помощью электронного кошелька.");
            return true;
        }
        else
            return false;
    }
}