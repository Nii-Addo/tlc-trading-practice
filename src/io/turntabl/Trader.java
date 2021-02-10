package io.turntabl;

public class Trader {

    private String name;

    private Account account=new Account(

    );

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void addTrade(Trade trade){
        double tradeValue=trade.getPrice()*trade.getQuantity();
        double amount=account.getTotalAmount();
        amount+=tradeValue;
        this.account.setTotalAmount(amount);
    }
}
