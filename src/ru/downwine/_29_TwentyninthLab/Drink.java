package ru.downwine._29_TwentyninthLab;

public final class Drink implements Item {
    private int cost;
    private String name;
    private String description;

    public Drink(int cost, String name, String description) {
        try {
            this.cost = cost;
            this.name = name;
            this.description = description;
        }
        catch (IllegalArgumentException ex){
            if (cost == 0 || name == null || description == null)
                System.out.println(ex.getMessage());
        }
    }

    @Override
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
