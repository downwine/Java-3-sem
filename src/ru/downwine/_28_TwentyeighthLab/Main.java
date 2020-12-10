package ru.downwine._28_TwentyeighthLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static final Map<Integer, Integer> priceList = new HashMap<>();
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static final Order order = new Order();
    private static Strategy strategy;

    static {
        priceList.put(1, 6000);
        priceList.put(2, 8000);
        priceList.put(3, 60000);
        priceList.put(4, 120000);
    }

    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            int cost;
            String nextChoice;

            do {
                System.out.print("Пожалуйста, выберите товар:" + "\n" +
                        "1 - обычная кошка" + "\n" +
                        "2 - редкая кошка" + "\n" +
                        "3 - эпическая кошка" + "\n" +
                        "4 - особая кошка" + "\n");
                int choice = Integer.parseInt(reader.readLine());
                cost = priceList.get(choice);
                System.out.print("Кол-во: ");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalSum(cost * count);
                System.out.print("Хотите продолжить покупку? Д/Н: ");
                nextChoice = reader.readLine();
            }
            while (nextChoice.equalsIgnoreCase("Д"));

            if (strategy == null) {
                System.out.println("Пожалуйста, выберите способ оплаты:" + "\n" +
                        "1 - электронный кошелёк" + "\n" +
                        "2 - кредитная карта");
                String paymentMethod = reader.readLine();

                if (paymentMethod.equals("1"))
                    strategy = new PayByEWallet();
                else if (paymentMethod.equals("2"))
                    strategy = new PayByCreditCard();
            }
            order.processOrder(strategy);

            System.out.print("Оплатить " + order.getTotalSum() + " или Продолжить покупку? О/П: ");
            String request = reader.readLine();
            if (request.equalsIgnoreCase("О")) {
                if (strategy.pay(order.getTotalSum()))
                    System.out.println("Оплата прошла успешно.");
                else
                    System.out.println("Ошибка.");
                order.setClosed();
            }
        }
    }
}
