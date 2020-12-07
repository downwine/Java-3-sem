package ru.downwine._22_TwentysecondLab.Ex2;

public class Date {
    private final String date;
    private String day;
    private String month;
    private String year;

    public Date(String date) {
        this.date=date;
        date_calendar();
    }

    @Override
    public String toString() {
        return "Date {" +
                "day = '" + day + '\'' +
                ", month = '" + month + '\'' +
                ", year = '" + year + '\'' +
                '}';
    }

    public void date_calendar(){
        String[] str = date.split(">");
        day = str[0].substring(1);
        month = str[1].substring(1);
        year = str[2].substring(1);
    }
}
