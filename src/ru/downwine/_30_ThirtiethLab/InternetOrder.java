package ru.downwine._30_ThirtiethLab;

import java.util.Arrays;
import java.util.Comparator;

public class InternetOrder implements Order {
    private static class Node {
        Node prev, next;
        MenuItem item;

        public Node(Node prev, Node next, MenuItem item) {
            this.prev = prev;
            this.next = next;
            this.item = item;
        }
    }

    private Customer customer;
    private Node head = null, tail = null;
    private int size = 0;

    @Override
    public boolean add(MenuItem item) {
        if (head == null)
            head = tail = new Node(null, null, item);
        else {
            tail.next = new Node (tail, null, item);
            tail = tail.next;
        }
        size += 1;
        return true;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName) {
        Node cur = head;
        int quantity = 0;
        while (cur != null) {
            if (cur.item.getName().equals(itemName))
                quantity += 1;
            cur = cur.next;
        }
        return quantity;
    }

    @Override
    public int itemQuantity(MenuItem item) {
        return itemQuantity(item.getName());
    }

    @Override
    public MenuItem[] getItems() {
        MenuItem[] order = new MenuItem[size];
        Node cur = head;
        for (int i = 0; i < size; i++) {
            order[i] = cur.item;
            cur = cur.next;
        }
        return order;
    }

    @Override
    public boolean remove(String itemName) {
        Node cur = head;
        while (cur != null) {
            if (cur.item.getName().equals(itemName)) {
                if (cur.prev == null)
                    head = cur.next;
                else
                    cur.prev = cur.next;
                size -= 1;
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    @Override
    public boolean remove(MenuItem item) {
        return remove(item.getName());
    }

    @Override
    public int removeAll(String itemName) {
        Node cur = head;
        int count = 0;
        while (cur != null) {
            if (cur.item.getName().equals(itemName)) {
                if (cur.prev == null)
                    head = cur.next;
                else
                    cur.prev = cur.next;
                count += 1;
            }
            cur = cur.next;
        }
        size -= count;
        return count;
    }

    @Override
    public int removeAll(MenuItem item) {
        return removeAll(item.getName());
    }

    @Override
    public int costTotal() {
        Node cur = head;
        int total = 0;
        while (cur != null) {
            total += cur.item.getCost();
            cur = cur.next;
        }
        return total;
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String[] itemsNames() {
        return Arrays.stream(getItems()).map(MenuItem::getName).distinct().toArray(String[]::new);
    }

    @Override
    public MenuItem[] sortedItemByCostDesc() {
        return Arrays.stream(getItems()).sorted(Comparator.comparingInt(MenuItem::getCost)).toArray(MenuItem[]::new);
    }
}
