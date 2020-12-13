package ru.downwine._30_ThirtiethLab;

import java.util.Arrays;

public class InternetOrdersManager implements OrdersManager {
    private static class Node {
        Node prev, next;
        Order value;

        public Node(Node prev, Node next, Order value) {
            this.prev = prev;
            this.next = next;
            this.value = value;
        }
    }

    private Node head = null, tail = null;
    private int size = 0;

    public boolean add(Order order) {
        if (head == null) {
            head = tail = new Node(null, null, order);
        } else {
            tail.next = new Node(tail, null, order);
            tail = tail.next;
        }
        size += 1;
        return true;
    }

    public Order remove() {
        if (tail != null) {
            Order order = tail.value;
            tail = tail.prev;
            size -= 1;
            return order;
        }
        return null;
    }

    public Order order() {
        return tail.value;
    }

    @Override
    public int itemsQuantity(String itemName) {
        return Arrays.stream(getOrders())
                .map(order -> order.itemQuantity(itemName))
                .reduce(0, Integer::sum);
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        return itemsQuantity(item.getName());
    }

    @Override
    public Order[] getOrders() {
        Order[] orders = new Order[size];
        Node current = head;
        for (int i = 0; i < size; i++) {
            orders[i] = current.value;
            current = current.next;
        }
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        return Arrays.stream(getOrders()).map(Order::costTotal).reduce(0, Integer::sum);
    }

    @Override
    public int ordersQuantity() {
        return Arrays.stream(getOrders()).map(Order::itemsQuantity).reduce(0, Integer::sum);
    }
}
