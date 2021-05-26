package com.function.form;

import com.function.models.Event;

public class LogRequest {
    private Event type;
    private String trace;
    private String action;

    public String getTrace() {
        return trace;
    }

    public Event getType() {
        return type;
    }

    public void setType(Event type) {
        this.type = type;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setTrace(String trace) {
        this.trace = trace;
    }
}
