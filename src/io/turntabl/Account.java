package io.turntabl;

public class Account {

    private double totalAmount;

    public Account() {
        this.totalAmount=0.0;
    }

    public Account(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
