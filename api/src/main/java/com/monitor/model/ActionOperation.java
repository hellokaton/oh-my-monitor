package com.monitor.model;

import com.monitor.constant.ActionType;

import java.io.Serializable;
import java.util.List;

/**
 * Created by biezhi on 2017/1/4.
 */
public class ActionOperation implements Serializable {

    private String name;
    private int step;
    private ActionType actionType;
    private List<UserProfile> notifiers;
    private String msgFmt = "Host({hostname},{ip}) service({service_name}) has issue,msg:{msg}";

    public String getName() {
        return name;
    }

    public ActionOperation setName(String name) {
        this.name = name;
        return this;
    }

    public int getStep() {
        return step;
    }

    public ActionOperation setStep(int step) {
        this.step = step;
        return this;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public ActionOperation setActionType(ActionType actionType) {
        this.actionType = actionType;
        return this;
    }

    public List<UserProfile> getNotifiers() {
        return notifiers;
    }

    public ActionOperation setNotifiers(List<UserProfile> notifiers) {
        this.notifiers = notifiers;
        return this;
    }

    public String getMsgFmt() {
        return msgFmt;
    }

    public ActionOperation setMsgFmt(String msgFmt) {
        this.msgFmt = msgFmt;
        return this;
    }
}
