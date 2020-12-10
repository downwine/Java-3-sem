package ru.downwine._28_TwentyeighthLab;

public class Order {
    private int totalSum = 0;
    private boolean isClosed = false;

    public void processOrder(Strategy strategy) {
        strategy.collectInformation();
    }

    public void setTotalSum(int sum) {
        this.totalSum += sum;
    }

    public int getTotalSum() {
        return totalSum;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
