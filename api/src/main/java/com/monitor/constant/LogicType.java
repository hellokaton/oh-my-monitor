package com.monitor.constant;

/**
 * Created by biezhi on 2017/1/4.
 */
public enum LogicType {

    OR("or"), AND("and");

    private String opt;

    LogicType(String opt){
        this.opt = opt;
    }

    public String getOpt() {
        return opt;
    }

}
