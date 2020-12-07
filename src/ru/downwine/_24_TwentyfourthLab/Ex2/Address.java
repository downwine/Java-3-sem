package ru.downwine._24_TwentyfourthLab.Ex2;



public class Address {
    private String country, region, city, street, house, housing, flat;
    private String address;

    public Address(String country, String region, String city, String street, String house, String housing, String flat) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.house = house;
        this.housing = housing;
        this.flat = flat;
    }

    public Address(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address {" +
                "country = '" + country + '\'' +
                ", region = '" + region + '\'' +
                ", city = '" + city + '\'' +
                ", street = '" + street + '\'' +
                ", house = '" + house + '\'' +
                ", housing = '" + housing + '\'' +
                ", flat = '" + flat + '\'' +
                '}';
    }

    public void converting(String address){
        try {
            String[] str = address.split(",");
            /*for (String s : str) {
                System.out.println(s);
            }*/
            str[0] = str[0].trim();
            country = str[0];
            region = str[1];
            city = str[2];
            street = str[3];
            house = str[4];
            housing = str[5];
            str[6] = str[6].trim();
            flat = str[6];
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
