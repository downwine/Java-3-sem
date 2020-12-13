package ru.downwine._29_TwentyninthLab;

import java.util.HashMap;
import java.util.Map;

public class OrderManager {

    private final Map<String, Order> orderMap = new HashMap<>();

    public void addOrder(String address, Order order) { //метод добавления заказа
        if (orderMap.containsKey(address))
            throw new OrderAlreadyAddedException();
        orderMap.put(address, order);
    }

    public Order getOrder(String address) { //метод получения заказа
        return orderMap.get(address);
    }

    public void deleteOrder(String address) { //метод удаления заказа
        orderMap.remove(address);
    }

    public void addToOrder(String address, Item item) { //метод добавления позиции к заказу
        orderMap.get(address).add(item);
    }

    public Order[] getOrdersArray() { //возвращает массив имеющихся на данный момент заказов
        return orderMap.values().toArray(new Order[0]);
    }

    public int getInternetTotal() { //возвращает сумму имеющихся на данный момент заказов
        int total = 0;
        for (Order order : orderMap.values()) {
            total += order.totalCost();
        }
        return total;
    }

    public int itemsAmount(String itemName) { //возвращает общее среди всех заказов количество заказанных порций
        int quantity = 0;                   //заданного блюда по его имени
        for (Order order : orderMap.values()) {
            quantity += order.itemCount(itemName);
        }
        return quantity;
    }
}