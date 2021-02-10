package io.turntabl;

public class Funds extends Trade{

    private double dividend;

    private final double currentPrice;

    public Funds(String id, String symbol, int quantity, double price,double currentPrice) {
        super(id, symbol, quantity, price);
        this.currentPrice=currentPrice;
    }

    public Funds(String id, String symbol, int quantity,double currentPrice) {
        super(id, symbol, quantity);
        this.currentPrice=currentPrice;
    }

    public double getDividend() {
        return dividend;
    }

    public void setDividend(double dividend) {
        this.dividend = dividend;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    @Override
    public double calcDividend() {
        return 0.2*currentPrice;
    }
}
