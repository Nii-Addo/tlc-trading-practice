package io.turntabl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FundsTest {

    Funds funds=new Funds("a3","app",100,20.0);

    @Test
    void calcDividend() {
        funds.calcDividend();
        assertEquals(4,funds.calcDividend(),0.1);
    }
}