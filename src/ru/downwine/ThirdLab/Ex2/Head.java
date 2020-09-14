package ru.downwine.ThirdLab.Ex2;

public class Head {
    private String haircut;
    private String hairColor;
    private int diameter;
    public Head(String haircut, String hairColor, int diameter){
        setHaircut(haircut);
        setHairColor(hairColor);
        setDiameter(diameter);
    }
    public int getDiameter() {
        return diameter;
    }

    @Override
    public String toString() {
        return "Head {" +
                "haircut = '" + haircut + '\'' +
                ", hairColor = '" + hairColor + '\'' +
                ", diameter = " + diameter +
                '}';
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getHaircut() {
        return haircut;
    }

    public boolean nod () {
        if ((int)(Math.random() * 10) > 5)
            return true;
        else return false;
    }
    public void setHaircut(String haircut) {
        this.haircut = haircut;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
}
