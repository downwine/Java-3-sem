package ru.downwine._29_TwentyninthLab;

public interface Order {
    boolean add(Item item); //добавление позиции в заказ

    boolean removeItem(String itemName); //удаляет позицию из заказа по названию

    int removeAll(String itemName); //удаляет все позиции с заданным именем

    int itemsCount(); //возвращает общее число позиций в заказе

    Item[] getItems(); //возвращает массив позиций заказа

    int totalCost(); //возвращает общую стоимость заказа

    int itemCount(String itemName); //возвращает число заказанных блюд или напитков

    String[] itemsNames(); //возвращает массив названий заказанных блюд и напитков

    Item[] sortedItemByCostDesc(); //возвращает массив позиций заказа, отсортированный по убыванию цены
}
