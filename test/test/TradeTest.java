package test;

import io.turntabl.Trade;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class TradeTest {
    Trade trade=new Trade("T1","APPL",100);

    @org.junit.jupiter.api.Test
    void setPrice() {
        trade.setPrice(-1.0);
        assertEquals(0,trade.getPrice(),0.1);
    }
}