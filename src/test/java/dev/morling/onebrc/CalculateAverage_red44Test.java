package dev.morling.onebrc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateAverage_red44Test {

    @Test
    public void test(){
        assertEquals(CalculateAverage_red44.numFromStr("1.3".getBytes(),0,3), 13);
        assertEquals(CalculateAverage_red44.numFromStr("1.333".getBytes(),0,5), 1333);
        assertEquals(CalculateAverage_red44.numFromStr("13".getBytes(),0,2), 13);
        assertEquals(CalculateAverage_red44.numFromStr("0.3".getBytes(),0,3), 3);
    }

}