package ru.downwine._29_TwentyninthLab;

public final class Dish implements Item {
    private String description;
    private String name;
    private int cost;

    public Dish(int cost, String name, String description) {
        try {
            this.cost = cost;
            this.name = name;
            this.description = description;
        }
        catch (IllegalArgumentException ex) {
            if (cost == 0 || name == null || description == null)
                System.out.println(ex.getMessage());
        }
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }
}
