package com.monitor.constant;

/**
 * 严重程度
 *
 * Created by biezhi on 2017/1/4.
 */
public enum Severity {

    INFO(1), WARNING(2), AVERAGE(3), HIGH(4), DIASTER(5);

    private final int value;

    Severity(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
