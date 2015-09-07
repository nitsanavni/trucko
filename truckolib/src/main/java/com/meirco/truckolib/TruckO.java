package com.meirco.truckolib;

public class TruckO {
    private final static TruckO sInstance = new TruckO();

    // suppress default ctor
    private TruckO() {
    }

    public static TruckO getInstance() {
        return sInstance;
    }

    public String getString() {
        return "TruckO lib o yeah!";
    }

    @Override
    public String toString() {
        return "stub!";
    }

}
