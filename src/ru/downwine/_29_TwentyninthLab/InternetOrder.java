package ru.downwine._29_TwentyninthLab;

public class InternetOrder implements Order {
    private static class Node {
        Node prev, next;
        Item item;

        public Node(Node prev, Node next, Item item) {
            this.prev = prev;
            this.next = next;
            this.item = item;
        }
    }

    private Node head, tail;
    private int size;

    public InternetOrder() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public boolean add(Item item) {
        if (head == null)
            head = tail = new Node(null, null, item);
        else
            tail = new Node (tail, null, item);
        size += 1;
        return true;
    }

    @Override
    public int itemsCount() {
        return size;
    }

    @Override
    public int itemCount(String itemName) {
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
    public Item[] getItems() {
        Item[] order = new Item[size];
        Node cur = head;
        for (int i = 0; i < size; i++) {
            order[i] = cur.item;
            cur = cur.next;
        }
        return order;
    }

    @Override
    public boolean removeItem(String itemName) {
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
    public int totalCost() {
        Node cur = head;
        int total = 0;
        while (cur != null) {
            total += cur.item.getCost();
            cur = cur.next;
        }
        return total;
    }

    @Override
    public String[] itemsNames() {
        return new String[0];
    }

    @Override
    public Item[] sortedItemByCostDesc() {
        return new Item[0];
    }
}
