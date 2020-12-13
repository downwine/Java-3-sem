package ru.downwine._32_ThirtysecondLab;

public interface OrdersManager {
    int itemsQuantity(String itemName);

    int itemsQuantity(MenuItem item);

    Order[] getOrders();

    int ordersCostSummary();

    int ordersQuantity();
}
