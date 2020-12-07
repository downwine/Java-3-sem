package ru.downwine._21_TwentyfirstLab.Ex2;

public class Client {
    private Chair chair;
    public void Sit(Chair chair){
        chair.sit();
    }

    public Client(Chair chair) {
        this.chair = chair;
    }
}
