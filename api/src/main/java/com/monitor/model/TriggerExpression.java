package com.monitor.model;

import com.monitor.constant.CalcType;
import com.monitor.constant.LogicType;
import com.monitor.constant.OperatorType;

import java.io.Serializable;

/**
 * Created by biezhi on 2017/1/4.
 */
public class TriggerExpression implements Serializable {

    private Trigger trigger;
    private Service service;
    private ServiceItem serviceItem;
    private String specifiedItem;
    private OperatorType operatorType;
    private CalcType calcType;
    private LogicType logicType;
    private Integer threshold;

    public Trigger getTrigger() {
        return trigger;
    }

    public TriggerExpression setTrigger(Trigger trigger) {
        this.trigger = trigger;
        return this;
    }

    public Service getService() {
        return service;
    }

    public TriggerExpression setService(Service service) {
        this.service = service;
        return this;
    }

    public ServiceItem getServiceItem() {
        return serviceItem;
    }

    public TriggerExpression setServiceItem(ServiceItem serviceItem) {
        this.serviceItem = serviceItem;
        return this;
    }

    public String getSpecifiedItem() {
        return specifiedItem;
    }

    public TriggerExpression setSpecifiedItem(String specifiedItem) {
        this.specifiedItem = specifiedItem;
        return this;
    }

    public OperatorType getOperatorType() {
        return operatorType;
    }

    public TriggerExpression setOperatorType(OperatorType operatorType) {
        this.operatorType = operatorType;
        return this;
    }

    public CalcType getCalcType() {
        return calcType;
    }

    public TriggerExpression setCalcType(CalcType calcType) {
        this.calcType = calcType;
        return this;
    }

    public LogicType getLogicType() {
        return logicType;
    }

    public TriggerExpression setLogicType(LogicType logicType) {
        this.logicType = logicType;
        return this;
    }

    public Integer getThreshold() {
        return threshold;
    }

    public TriggerExpression setThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }
}
