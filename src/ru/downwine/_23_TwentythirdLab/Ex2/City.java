package ru.downwine._23_TwentythirdLab.Ex2;

public class City {
    private String town;
    private String country;

    public City(String town, String country) {
        this.town = town;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public String getTown() {
        return town;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
