package com.meirco.truckolib;

import static org.assertj.core.api.Assertions.assertThat;

import junit.framework.TestCase;

public class TruckOTest extends TestCase {
    public void testGetString() {
        String actual = TruckO.getInstance().getString();
        assertThat(actual).isEqualTo("TruckO lib o yeah!");
    }
}
