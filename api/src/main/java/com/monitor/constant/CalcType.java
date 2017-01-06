package com.monitor.constant;

/**
 * Created by biezhi on 2017/1/4.
 */
public enum CalcType {

    AVG("Average"), MAX("Max"), HIT("Hit"), LAST("Last");

    private String opt;

    CalcType(String opt){
        this.opt = opt;
    }

    public String getOpt() {
        return opt;
    }

}
