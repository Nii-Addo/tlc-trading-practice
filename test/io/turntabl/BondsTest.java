package io.turntabl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BondsTest {

    Bonds bonds=new Bonds("a3","app",100,20.0);

    @Test
    void calcDividend() {
        bonds.calcDividend();
        assertEquals(20.0,bonds.calcDividend(),0.1);
    }
}