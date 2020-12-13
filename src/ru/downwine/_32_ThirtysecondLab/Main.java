package ru.downwine._32_ThirtysecondLab;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        InternetOrder order = new InternetOrder();
        order.add(new Drink(50,"Milk","From an Alpine cow",0, DrinkTypeEnum.MILK));
        order.add(new Drink(500,"Red Wine","Perfect taste!",16, DrinkTypeEnum.WINE));
        order.add(new Dish(250,"Fried potatoes","Best for dinner"));
        order.add(new Drink(0,"Cold water","Free for every customer",0, DrinkTypeEnum.WATER));

        order.setCustomer(Customer.MATURE_UNKNOWN_CUSTOMER);

        InternetOrdersManager ordersManager = new InternetOrdersManager();
        ordersManager.add(order);

        FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(ordersManager);
        objectOutputStream.close();


        FileInputStream fileInputStream = new FileInputStream("test.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ordersManager = (InternetOrdersManager) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println("Total cost: " + ordersManager.ordersCostSummary());
    }
}
