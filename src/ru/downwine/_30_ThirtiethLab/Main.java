package ru.downwine._30_ThirtiethLab;

public class Main {
    public static void main(String[] args) {
        InternetOrder order = new InternetOrder();
        order.add(new Drink(50,"Milk","From an Alpine cow",0, DrinkTypeEnum.MILK));
        order.add(new Drink(500,"Red Wine","Perfect taste!",16, DrinkTypeEnum.WINE));
        order.add(new Dish(250,"Fried potatoes","Best for dinner"));
        order.add(new Drink(0,"Cold water","Free for every customer",0, DrinkTypeEnum.WATER));
        order.setCustomer(Customer.MATURE_UNKNOWN_CUSTOMER);

        InternetOrdersManager ordersManager = new InternetOrdersManager();
        ordersManager.add(order);

        System.out.println("Total cost: " + ordersManager.ordersCostSummary());
    }
}
