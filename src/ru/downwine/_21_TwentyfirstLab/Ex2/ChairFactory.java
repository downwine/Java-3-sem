package ru.downwine._21_TwentyfirstLab.Ex2;

public class ChairFactory implements AbstractFactory {
    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair();
    }

    @Override
    public MultifunctionChair createMultifunctionChair() {
        return new MultifunctionChair();
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }
}
