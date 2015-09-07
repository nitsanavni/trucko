package com.meirco.truckolib;

import junit.framework.TestCase;

public class TruckOTest extends TestCase{
    public void testGetString() {
        String actual = TruckO.getInstance().getString();
        assertEquals("hello", actual);
    }
}
