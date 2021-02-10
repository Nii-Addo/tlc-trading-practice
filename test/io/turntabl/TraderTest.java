package io.turntabl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TraderTest {

    Trader trader;
    Trade trade;

    @BeforeEach
    void setUp(){
        trader=new Trader();
        trade=new Trade("T1","APPL",100,20.0);
    }

    @Test
    void addTrade() {
        trader.addTrade(trade);
        assertEquals(2000.0,trader.getAccount().getTotalAmount(),0.1);
    }
}