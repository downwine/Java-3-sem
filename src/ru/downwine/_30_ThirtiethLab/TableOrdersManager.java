package ru.downwine._30_ThirtiethLab;
import java.util.HashMap;
import java.util.Map;

public class TableOrdersManager implements OrdersManager {
    Map<Integer, Order> orderMap = new HashMap<>();

    public void add(Order order, int tableNumber) {
        orderMap.put(tableNumber, order);
    }

    public void addItem(MenuItem item, int tableNumber) {
        orderMap.get(tableNumber).add(item);
    }

    public Order getOrder(int tableNumber) {
        return orderMap.get(tableNumber);
    }

    public void remove(int tableNumber) {
        orderMap.remove(tableNumber);
    }

    public int remove(Order order) {
        orderMap.remove(orderMap.get(order));
        return 0;
    }

    @Override
    public int itemsQuantity(String itemName) {
        return orderMap.values().stream().map(order -> order.itemQuantity(itemName)).reduce(0, Integer::sum);
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        return itemsQuantity(item.getName());
    }

    public int freeTableNumber() {
        return 0;
    }

    public int[] freeTableNumbers() {
        return new int[0];
    }

    @Override
    public Order[] getOrders() {
        return orderMap.values().toArray(new Order[0]);
    }

    @Override
    public int ordersCostSummary() {
        return orderMap.values().stream().map(Order::costTotal).reduce(0, Integer::sum);
    }

    public int removeAll(String itemName) {
        return 0;
    }

    @Override
    public int ordersQuantity() {
        return orderMap.values().stream().map(Order::itemsQuantity).reduce(0, Integer::sum);
    }
}

