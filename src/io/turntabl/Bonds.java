package io.turntabl;

public class Bonds extends Trade{

    private final double dividend;

    public Bonds(String id, String symbol, int quantity, double price) {
        super(id, symbol, quantity, price);
        this.dividend = 20.00;
    }

    public Bonds(String id, String symbol, int quantity) {
        super(id, symbol, quantity);
        this.dividend = 20.00;
    }

    public double getDividend() {
        return dividend;
    }

    @Override
    public double calcDividend() {
        return dividend;
    }
}
